package org.example.inventory;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;

import com.google.protobuf.Empty;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.InsertOneResult;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import java.util.Objects;
import org.bson.Document;
import org.bson.types.ObjectId;

public class ItemServiceImpl extends ItemServiceGrpc.ItemServiceImplBase {

  private final MongoCollection<Document> mongoCollection;

  public ItemServiceImpl(MongoClient mongoClient) {
    MongoDatabase mongoDatabase = mongoClient.getDatabase("itemdb");
    this.mongoCollection = mongoDatabase.getCollection("item");
  }

  @Override
  public void createItem(Item request, StreamObserver<ItemIdResponse> responseObserver) {
    Document document = createItemDocument(request);
    InsertOneResult result = null;
    try{
      result = mongoCollection.insertOne(document);
    }catch (MongoException e){
      responseObserver.onError(
          Status.INTERNAL
              .withDescription("Item couldn't be created")
              .asRuntimeException()
      );
    }
    String id = Objects.requireNonNull(Objects.requireNonNull(result).getInsertedId()).asObjectId().getValue().toString();
    responseObserver.onNext(
        ItemIdResponse.newBuilder()
            .setId(id)
            .build()
    );
    responseObserver.onCompleted();
  }




  @Override
  public StreamObserver<Item> createItemViaStream(StreamObserver<ItemsCreated> responseObserver) {
    // TODO implementar metodo
    // sugerencia, para practicar el streaming desde el lado del cliente
    // enviar una lista de items que seran insertados en la base de datos y retornar el total de items creados
    return new StreamObserver<>() {
      int inserted = 0;
      int failed = 0;
      @Override
      public void onNext(Item value) {
        try {
          Document document = createItemDocument(value);
          mongoCollection.insertOne(document);
          ++inserted;
        } catch (MongoException e) {
            ++failed;
        }
      }
      @Override
      public void onError(Throwable t) {
        responseObserver.onError(
            Status.INTERNAL
                .withDescription("An error occurred")
                .asRuntimeException()
        );
      }
      @Override
      public void onCompleted() {
        responseObserver.onNext(ItemsCreated.newBuilder().setTotal(inserted).build());
        responseObserver.onCompleted();
      }
    };

  }

  @Override
  public void readItem(ItemIdRequest request, StreamObserver<Item> responseObserver) {
    Document result = mongoCollection.find(eq("_id", new ObjectId(request.getId()))).first();
    //validation
    if(result == null){
      responseObserver.onError(
          Status.NOT_FOUND
              .withDescription("Item was not found")
              .asRuntimeException()
      );
    }
    responseObserver
        .onNext(
            itemBuilder(Objects.requireNonNull(result))
        );
    responseObserver.onCompleted();
  }



  @Override
  public void listItem(Empty request, StreamObserver<Item> responseObserver) {
    for(Document document : mongoCollection.find()){
      responseObserver
          .onNext(
              itemBuilder(document)
          );
    }
    responseObserver.onCompleted();
  }

  @Override
  public StreamObserver<ItemIdRequest> listItemViaStream(StreamObserver<Item> responseObserver) {
    // TODO implementar metodo
    // sugerencia, para practicar el streaming bidireccional
    // enviar una lista de item id consultar en base de datos y retornar un stream con los items encontrados
    return new StreamObserver<>() {
      @Override
      public void onNext(ItemIdRequest value) {
        Document result = mongoCollection.find(eq("_id", new ObjectId(value.getId()))).first();
        //validation
        if(result != null){
          responseObserver
              .onNext(
                  itemBuilder(result)
              );
        }
      }
      @Override
      public void onError(Throwable t) {
        responseObserver.onError(
            Status.NOT_FOUND
                .withDescription("There was an error: " + t.getMessage())
                .asRuntimeException()
        );
      }
      @Override
      public void onCompleted() {
        responseObserver.onCompleted();
      }
    };
  }

  @Override
  public void updateItem(Item request, StreamObserver<Empty> responseObserver) {
    Document result = mongoCollection.findOneAndUpdate(
        eq("_id", new ObjectId(request.getId())),
        combine(
            set("name", request.getName()),
            set("description", request.getDescription()),
            set("qty", request.getQyt()),
            set("price", request.getPrice())
        )
    );
    //validation
    if(result == null){
      responseObserver
          .onError(
              Status.NOT_FOUND
                  .withDescription("Item was not found")
                  .asRuntimeException()
          );
    }
    responseObserver.onNext(Empty.getDefaultInstance());
    responseObserver.onCompleted();
  }

  @Override
  public void deleteItem(ItemIdRequest request, StreamObserver<Empty> responseObserver) {
    try{
      mongoCollection.deleteOne(eq("_id", new ObjectId(request.getId())));
    }catch (MongoException e){
      responseObserver.onError(
          Status.INTERNAL
              .withDescription("Item couldn't be deleted")
              .asRuntimeException()
      );
    }
    responseObserver
        .onNext(Empty.getDefaultInstance());
    responseObserver
        .onCompleted();
  }


  private Document createItemDocument(Item item){
    return new Document("name", item.getName())
        .append("description", item.getDescription())
        .append("qty", item.getQyt())
        .append("price", item.getPrice());
  }

  private Item itemBuilder(Document result) {
    return Item.newBuilder()
        .setId(result.getObjectId("_id").toString())
        .setName(result.getString("name"))
        .setDescription(result.getString("description"))
        .setQyt(result.getInteger("qty"))
        .setPrice(result.getDouble("price"))
        .build();
  }
}
