// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/essentialcontacts/v1/service.proto

package com.google.cloud.essentialcontacts.v1;

public final class Service {
  private Service() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_essentialcontacts_v1_Contact_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_Contact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_essentialcontacts_v1_ListContactsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_ListContactsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_essentialcontacts_v1_ListContactsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_ListContactsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_essentialcontacts_v1_GetContactRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_GetContactRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_essentialcontacts_v1_DeleteContactRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_DeleteContactRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_essentialcontacts_v1_CreateContactRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_CreateContactRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_essentialcontacts_v1_UpdateContactRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_UpdateContactRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_essentialcontacts_v1_ComputeContactsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_ComputeContactsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_essentialcontacts_v1_ComputeContactsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_ComputeContactsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_essentialcontacts_v1_SendTestMessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_SendTestMessageRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/essentialcontacts/v1/serv" +
      "ice.proto\022!google.cloud.essentialcontact" +
      "s.v1\032\034google/api/annotations.proto\032\027goog" +
      "le/api/client.proto\032\037google/api/field_be" +
      "havior.proto\032\031google/api/resource.proto\032" +
      "-google/cloud/essentialcontacts/v1/enums" +
      ".proto\032\033google/protobuf/empty.proto\032 goo" +
      "gle/protobuf/field_mask.proto\032\037google/pr" +
      "otobuf/timestamp.proto\"\321\003\n\007Contact\022\014\n\004na" +
      "me\030\001 \001(\t\022\r\n\005email\030\002 \001(\t\022d\n#notification_" +
      "category_subscriptions\030\003 \003(\01627.google.cl" +
      "oud.essentialcontacts.v1.NotificationCat" +
      "egory\022\024\n\014language_tag\030\004 \001(\t\022L\n\020validatio" +
      "n_state\030\010 \001(\01622.google.cloud.essentialco" +
      "ntacts.v1.ValidationState\0221\n\rvalidate_ti" +
      "me\030\t \001(\0132\032.google.protobuf.Timestamp:\253\001\352" +
      "A\247\001\n(essentialcontacts.googleapis.com/Co" +
      "ntact\022%projects/{project}/contacts/{cont" +
      "act}\022#folders/{folder}/contacts/{contact" +
      "}\022/organizations/{organization}/contacts" +
      "/{contact}\"\210\001\n\023ListContactsRequest\022@\n\006pa" +
      "rent\030\001 \001(\tB0\340A\002\372A*\022(essentialcontacts.go" +
      "ogleapis.com/Contact\022\026\n\tpage_size\030\002 \001(\005B" +
      "\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\"m\n\024ListCon" +
      "tactsResponse\022<\n\010contacts\030\001 \003(\0132*.google" +
      ".cloud.essentialcontacts.v1.Contact\022\027\n\017n" +
      "ext_page_token\030\002 \001(\t\"S\n\021GetContactReques" +
      "t\022>\n\004name\030\001 \001(\tB0\340A\002\372A*\n(essentialcontac" +
      "ts.googleapis.com/Contact\"V\n\024DeleteConta" +
      "ctRequest\022>\n\004name\030\001 \001(\tB0\340A\002\372A*\n(essenti" +
      "alcontacts.googleapis.com/Contact\"\232\001\n\024Cr" +
      "eateContactRequest\022@\n\006parent\030\001 \001(\tB0\340A\002\372" +
      "A*\022(essentialcontacts.googleapis.com/Con" +
      "tact\022@\n\007contact\030\002 \001(\0132*.google.cloud.ess" +
      "entialcontacts.v1.ContactB\003\340A\002\"\216\001\n\024Updat" +
      "eContactRequest\022@\n\007contact\030\002 \001(\0132*.googl" +
      "e.cloud.essentialcontacts.v1.ContactB\003\340A" +
      "\002\0224\n\013update_mask\030\003 \001(\0132\032.google.protobuf" +
      ".FieldMaskB\003\340A\001\"\345\001\n\026ComputeContactsReque" +
      "st\022@\n\006parent\030\001 \001(\tB0\340A\002\372A*\022(essentialcon" +
      "tacts.googleapis.com/Contact\022X\n\027notifica" +
      "tion_categories\030\006 \003(\01627.google.cloud.ess" +
      "entialcontacts.v1.NotificationCategory\022\026" +
      "\n\tpage_size\030\003 \001(\005B\003\340A\001\022\027\n\npage_token\030\004 \001" +
      "(\tB\003\340A\001\"p\n\027ComputeContactsResponse\022<\n\010co" +
      "ntacts\030\001 \003(\0132*.google.cloud.essentialcon" +
      "tacts.v1.Contact\022\027\n\017next_page_token\030\002 \001(" +
      "\t\"\375\001\n\026SendTestMessageRequest\022B\n\010contacts" +
      "\030\001 \003(\tB0\340A\002\372A*\n(essentialcontacts.google" +
      "apis.com/Contact\022B\n\010resource\030\002 \001(\tB0\340A\002\372" +
      "A*\022(essentialcontacts.googleapis.com/Con" +
      "tact\022[\n\025notification_category\030\003 \001(\01627.go" +
      "ogle.cloud.essentialcontacts.v1.Notifica" +
      "tionCategoryB\003\340A\0022\313\017\n\030EssentialContactsS" +
      "ervice\022\230\002\n\rCreateContact\0227.google.cloud." +
      "essentialcontacts.v1.CreateContactReques" +
      "t\032*.google.cloud.essentialcontacts.v1.Co" +
      "ntact\"\241\001\202\323\344\223\002\211\001\" /v1/{parent=projects/*}" +
      "/contacts:\007contactZ*\"\037/v1/{parent=folder" +
      "s/*}/contacts:\007contactZ0\"%/v1/{parent=or" +
      "ganizations/*}/contacts:\007contact\332A\016paren" +
      "t,contact\022\265\002\n\rUpdateContact\0227.google.clo" +
      "ud.essentialcontacts.v1.UpdateContactReq" +
      "uest\032*.google.cloud.essentialcontacts.v1" +
      ".Contact\"\276\001\202\323\344\223\002\241\0012(/v1/{contact.name=pr" +
      "ojects/*/contacts/*}:\007contactZ22\'/v1/{co" +
      "ntact.name=folders/*/contacts/*}:\007contac" +
      "tZ82-/v1/{contact.name=organizations/*/c" +
      "ontacts/*}:\007contact\332A\023contact,update_mas" +
      "k\022\376\001\n\014ListContacts\0226.google.cloud.essent" +
      "ialcontacts.v1.ListContactsRequest\0327.goo" +
      "gle.cloud.essentialcontacts.v1.ListConta" +
      "ctsResponse\"}\202\323\344\223\002n\022 /v1/{parent=project" +
      "s/*}/contactsZ!\022\037/v1/{parent=folders/*}/" +
      "contactsZ\'\022%/v1/{parent=organizations/*}" +
      "/contacts\332A\006parent\022\353\001\n\nGetContact\0224.goog" +
      "le.cloud.essentialcontacts.v1.GetContact" +
      "Request\032*.google.cloud.essentialcontacts" +
      ".v1.Contact\"{\202\323\344\223\002n\022 /v1/{name=projects/" +
      "*/contacts/*}Z!\022\037/v1/{name=folders/*/con" +
      "tacts/*}Z\'\022%/v1/{name=organizations/*/co" +
      "ntacts/*}\332A\004name\022\335\001\n\rDeleteContact\0227.goo" +
      "gle.cloud.essentialcontacts.v1.DeleteCon" +
      "tactRequest\032\026.google.protobuf.Empty\"{\202\323\344" +
      "\223\002n* /v1/{name=projects/*/contacts/*}Z!*" +
      "\037/v1/{name=folders/*/contacts/*}Z\'*%/v1/" +
      "{name=organizations/*/contacts/*}\332A\004name" +
      "\022\230\002\n\017ComputeContacts\0229.google.cloud.esse" +
      "ntialcontacts.v1.ComputeContactsRequest\032" +
      ":.google.cloud.essentialcontacts.v1.Comp" +
      "uteContactsResponse\"\215\001\202\323\344\223\002\206\001\022(/v1/{pare" +
      "nt=projects/*}/contacts:computeZ)\022\'/v1/{" +
      "parent=folders/*}/contacts:computeZ/\022-/v" +
      "1/{parent=organizations/*}/contacts:comp" +
      "ute\022\233\002\n\017SendTestMessage\0229.google.cloud.e" +
      "ssentialcontacts.v1.SendTestMessageReque" +
      "st\032\026.google.protobuf.Empty\"\264\001\202\323\344\223\002\255\001\"2/v" +
      "1/{resource=projects/*}/contacts:sendTes" +
      "tMessage:\001*Z6\"1/v1/{resource=folders/*}/" +
      "contacts:sendTestMessage:\001*Z<\"7/v1/{reso" +
      "urce=organizations/*}/contacts:sendTestM" +
      "essage:\001*\032T\312A essentialcontacts.googleap" +
      "is.com\322A.https://www.googleapis.com/auth" +
      "/cloud-platformB\355\001\n%com.google.cloud.ess" +
      "entialcontacts.v1P\001ZScloud.google.com/go" +
      "/essentialcontacts/apiv1/essentialcontac" +
      "tspb;essentialcontactspb\252\002!Google.Cloud." +
      "EssentialContacts.V1\312\002!Google\\Cloud\\Esse" +
      "ntialContacts\\V1\352\002$Google::Cloud::Essent" +
      "ialContacts::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.essentialcontacts.v1.EnumsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_essentialcontacts_v1_Contact_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_essentialcontacts_v1_Contact_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_essentialcontacts_v1_Contact_descriptor,
        new java.lang.String[] { "Name", "Email", "NotificationCategorySubscriptions", "LanguageTag", "ValidationState", "ValidateTime", });
    internal_static_google_cloud_essentialcontacts_v1_ListContactsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_essentialcontacts_v1_ListContactsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_essentialcontacts_v1_ListContactsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_essentialcontacts_v1_ListContactsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_essentialcontacts_v1_ListContactsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_essentialcontacts_v1_ListContactsResponse_descriptor,
        new java.lang.String[] { "Contacts", "NextPageToken", });
    internal_static_google_cloud_essentialcontacts_v1_GetContactRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_essentialcontacts_v1_GetContactRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_essentialcontacts_v1_GetContactRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_essentialcontacts_v1_DeleteContactRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_essentialcontacts_v1_DeleteContactRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_essentialcontacts_v1_DeleteContactRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_essentialcontacts_v1_CreateContactRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_essentialcontacts_v1_CreateContactRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_essentialcontacts_v1_CreateContactRequest_descriptor,
        new java.lang.String[] { "Parent", "Contact", });
    internal_static_google_cloud_essentialcontacts_v1_UpdateContactRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_essentialcontacts_v1_UpdateContactRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_essentialcontacts_v1_UpdateContactRequest_descriptor,
        new java.lang.String[] { "Contact", "UpdateMask", });
    internal_static_google_cloud_essentialcontacts_v1_ComputeContactsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_essentialcontacts_v1_ComputeContactsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_essentialcontacts_v1_ComputeContactsRequest_descriptor,
        new java.lang.String[] { "Parent", "NotificationCategories", "PageSize", "PageToken", });
    internal_static_google_cloud_essentialcontacts_v1_ComputeContactsResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_essentialcontacts_v1_ComputeContactsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_essentialcontacts_v1_ComputeContactsResponse_descriptor,
        new java.lang.String[] { "Contacts", "NextPageToken", });
    internal_static_google_cloud_essentialcontacts_v1_SendTestMessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_essentialcontacts_v1_SendTestMessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_essentialcontacts_v1_SendTestMessageRequest_descriptor,
        new java.lang.String[] { "Contacts", "Resource", "NotificationCategory", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.essentialcontacts.v1.EnumsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
