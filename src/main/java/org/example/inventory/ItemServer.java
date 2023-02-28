package org.example.inventory;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;
import java.io.IOException;

public class ItemServer {

  public static void main(String[] args) throws IOException, InterruptedException {

    final int port = 50051;

    MongoClient mongoClient = MongoClients.create("mongodb://root:root@localhost:27017/");

    Server server = ServerBuilder
        .forPort(port)
        .addService(ProtoReflectionService.newInstance())
        .addService(new ItemServiceImpl(mongoClient))
        .build();

    server.start();

    System.out.println("Server started on port " + port);

    server.awaitTermination();
  }
}