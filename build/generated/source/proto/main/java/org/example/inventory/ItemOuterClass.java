// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inventory/item.proto

package org.example.inventory;

public final class ItemOuterClass {
  private ItemOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_inventory_Item_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_inventory_Item_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_inventory_ItemIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_inventory_ItemIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_inventory_ItemIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_inventory_ItemIdResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024inventory/item.proto\022\tinventory\032\033googl" +
      "e/protobuf/empty.proto\"Q\n\004Item\022\n\n\002id\030\001 \001" +
      "(\t\022\014\n\004name\030\002 \001(\t\022\023\n\013description\030\003 \001(\t\022\013\n" +
      "\003qyt\030\004 \001(\r\022\r\n\005price\030\005 \001(\001\"\033\n\rItemIdReque" +
      "st\022\n\n\002id\030\001 \001(\t\"\034\n\016ItemIdResponse\022\n\n\002id\030\001" +
      " \001(\t2\254\002\n\013ItemService\0228\n\ncreateItem\022\017.inv" +
      "entory.Item\032\031.inventory.ItemIdResponse\0225" +
      "\n\010readItem\022\030.inventory.ItemIdRequest\032\017.i" +
      "nventory.Item\0225\n\010listItem\022\026.google.proto" +
      "buf.Empty\032\017.inventory.Item0\001\0225\n\nupdateIt" +
      "em\022\017.inventory.Item\032\026.google.protobuf.Em" +
      "pty\022>\n\ndeleteItem\022\030.inventory.ItemIdRequ" +
      "est\032\026.google.protobuf.EmptyB\031\n\025org.examp" +
      "le.inventoryP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_inventory_Item_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_inventory_Item_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_inventory_Item_descriptor,
        new java.lang.String[] { "Id", "Name", "Description", "Qyt", "Price", });
    internal_static_inventory_ItemIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_inventory_ItemIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_inventory_ItemIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_inventory_ItemIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_inventory_ItemIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_inventory_ItemIdResponse_descriptor,
        new java.lang.String[] { "Id", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}