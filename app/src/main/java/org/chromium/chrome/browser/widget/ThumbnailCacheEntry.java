// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: thumbnail_cache_entry.proto

package org.chromium.chrome.browser.widget;

public final class ThumbnailCacheEntry {
  private ThumbnailCacheEntry() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ContentIdOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.chromium.chrome.browser.widget.ContentId)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    boolean hasId();
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    java.lang.String getId();
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    com.google.protobuf.ByteString
        getIdBytes();
  }
  /**
   * Protobuf type {@code org.chromium.chrome.browser.widget.ContentId}
   */
  public  static final class ContentId extends
      com.google.protobuf.GeneratedMessageLite<
          ContentId, ContentId.Builder> implements
      // @@protoc_insertion_point(message_implements:org.chromium.chrome.browser.widget.ContentId)
      ContentIdOrBuilder {
    private ContentId() {
      id_ = "";
    }
    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private java.lang.String id_;
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    @java.lang.Override
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    @java.lang.Override
    public java.lang.String getId() {
      return id_;
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(id_);
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    private void setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      id_ = value;
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    private void clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = getDefaultInstance().getId();
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    private void setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      id_ = value.toStringUtf8();
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeString(1, getId());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getId());
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code org.chromium.chrome.browser.widget.ContentId}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId, Builder> implements
        // @@protoc_insertion_point(builder_implements:org.chromium.chrome.browser.widget.ContentId)
        org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentIdOrBuilder {
      // Construct using org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * Required.
       * </pre>
       *
       * <code>optional string id = 1;</code>
       */
      @java.lang.Override
      public boolean hasId() {
        return instance.hasId();
      }
      /**
       * <pre>
       * Required.
       * </pre>
       *
       * <code>optional string id = 1;</code>
       */
      @java.lang.Override
      public java.lang.String getId() {
        return instance.getId();
      }
      /**
       * <pre>
       * Required.
       * </pre>
       *
       * <code>optional string id = 1;</code>
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getIdBytes() {
        return instance.getIdBytes();
      }
      /**
       * <pre>
       * Required.
       * </pre>
       *
       * <code>optional string id = 1;</code>
       */
      public Builder setId(
          java.lang.String value) {
        copyOnWrite();
        instance.setId(value);
        return this;
      }
      /**
       * <pre>
       * Required.
       * </pre>
       *
       * <code>optional string id = 1;</code>
       */
      public Builder clearId() {
        copyOnWrite();
        instance.clearId();
        return this;
      }
      /**
       * <pre>
       * Required.
       * </pre>
       *
       * <code>optional string id = 1;</code>
       */
      public Builder setIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setIdBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:org.chromium.chrome.browser.widget.ContentId)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId other = (org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId) arg1;
          id_ = visitor.visitString(
              hasId(), id_,
              other.hasId(), other.id_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
            bitField0_ |= other.bitField0_;
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
          }
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                case 10: {
                  java.lang.String s = input.readString();
                  bitField0_ |= 0x00000001;
                  id_ = s;
                  break;
                }
                default: {
                  if (!parseUnknownField(tag, input)) {
                    done = true;
                  }
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId> parser = PARSER;
          if (parser == null) {
            synchronized (org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId.class) {
              parser = PARSER;
              if (parser == null) {
                parser = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:org.chromium.chrome.browser.widget.ContentId)
    private static final org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId DEFAULT_INSTANCE;
    static {
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = new ContentId();
    }

    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ContentId> PARSER;

    public static com.google.protobuf.Parser<ContentId> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ThumbnailEntryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.chromium.chrome.browser.widget.ThumbnailEntry)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>optional .org.chromium.chrome.browser.widget.ContentId content_id = 1;</code>
     */
    boolean hasContentId();
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>optional .org.chromium.chrome.browser.widget.ContentId content_id = 1;</code>
     */
    org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId getContentId();

    /**
     * <pre>
     * Requested size (maximum required dimension (pixel) of the smaller side)
     * of the thumbnail.
     * Required.
     * </pre>
     *
     * <code>optional int32 size_px = 2;</code>
     */
    boolean hasSizePx();
    /**
     * <pre>
     * Requested size (maximum required dimension (pixel) of the smaller side)
     * of the thumbnail.
     * Required.
     * </pre>
     *
     * <code>optional int32 size_px = 2;</code>
     */
    int getSizePx();

    /**
     * <code>optional bytes compressed_png = 3;</code>
     */
    boolean hasCompressedPng();
    /**
     * <code>optional bytes compressed_png = 3;</code>
     */
    com.google.protobuf.ByteString getCompressedPng();
  }
  /**
   * Protobuf type {@code org.chromium.chrome.browser.widget.ThumbnailEntry}
   */
  public  static final class ThumbnailEntry extends
      com.google.protobuf.GeneratedMessageLite<
          ThumbnailEntry, ThumbnailEntry.Builder> implements
      // @@protoc_insertion_point(message_implements:org.chromium.chrome.browser.widget.ThumbnailEntry)
      ThumbnailEntryOrBuilder {
    private ThumbnailEntry() {
      compressedPng_ = com.google.protobuf.ByteString.EMPTY;
    }
    private int bitField0_;
    public static final int CONTENT_ID_FIELD_NUMBER = 1;
    private org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId contentId_;
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>optional .org.chromium.chrome.browser.widget.ContentId content_id = 1;</code>
     */
    @java.lang.Override
    public boolean hasContentId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>optional .org.chromium.chrome.browser.widget.ContentId content_id = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId getContentId() {
      return contentId_ == null ? org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId.getDefaultInstance() : contentId_;
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>optional .org.chromium.chrome.browser.widget.ContentId content_id = 1;</code>
     */
    private void setContentId(org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      contentId_ = value;
      bitField0_ |= 0x00000001;
      }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>optional .org.chromium.chrome.browser.widget.ContentId content_id = 1;</code>
     */
    private void setContentId(
        org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId.Builder builderForValue) {
      contentId_ = builderForValue.build();
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>optional .org.chromium.chrome.browser.widget.ContentId content_id = 1;</code>
     */
    @java.lang.SuppressWarnings({"ReferenceEquality"})
    private void mergeContentId(org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      if (contentId_ != null &&
          contentId_ != org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId.getDefaultInstance()) {
        contentId_ =
          org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId.newBuilder(contentId_).mergeFrom(value).buildPartial();
      } else {
        contentId_ = value;
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>optional .org.chromium.chrome.browser.widget.ContentId content_id = 1;</code>
     */
    private void clearContentId() {  contentId_ = null;
      bitField0_ = (bitField0_ & ~0x00000001);
    }

    public static final int SIZE_PX_FIELD_NUMBER = 2;
    private int sizePx_;
    /**
     * <pre>
     * Requested size (maximum required dimension (pixel) of the smaller side)
     * of the thumbnail.
     * Required.
     * </pre>
     *
     * <code>optional int32 size_px = 2;</code>
     */
    @java.lang.Override
    public boolean hasSizePx() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     * Requested size (maximum required dimension (pixel) of the smaller side)
     * of the thumbnail.
     * Required.
     * </pre>
     *
     * <code>optional int32 size_px = 2;</code>
     */
    @java.lang.Override
    public int getSizePx() {
      return sizePx_;
    }
    /**
     * <pre>
     * Requested size (maximum required dimension (pixel) of the smaller side)
     * of the thumbnail.
     * Required.
     * </pre>
     *
     * <code>optional int32 size_px = 2;</code>
     */
    private void setSizePx(int value) {
      bitField0_ |= 0x00000002;
      sizePx_ = value;
    }
    /**
     * <pre>
     * Requested size (maximum required dimension (pixel) of the smaller side)
     * of the thumbnail.
     * Required.
     * </pre>
     *
     * <code>optional int32 size_px = 2;</code>
     */
    private void clearSizePx() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sizePx_ = 0;
    }

    public static final int COMPRESSED_PNG_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString compressedPng_;
    /**
     * <code>optional bytes compressed_png = 3;</code>
     */
    @java.lang.Override
    public boolean hasCompressedPng() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bytes compressed_png = 3;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getCompressedPng() {
      return compressedPng_;
    }
    /**
     * <code>optional bytes compressed_png = 3;</code>
     */
    private void setCompressedPng(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      compressedPng_ = value;
    }
    /**
     * <code>optional bytes compressed_png = 3;</code>
     */
    private void clearCompressedPng() {
      bitField0_ = (bitField0_ & ~0x00000004);
      compressedPng_ = getDefaultInstance().getCompressedPng();
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getContentId());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, sizePx_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, compressedPng_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getContentId());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, sizePx_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, compressedPng_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ThumbnailEntry parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ThumbnailEntry parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ThumbnailEntry parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ThumbnailEntry parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ThumbnailEntry parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ThumbnailEntry parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ThumbnailEntry parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ThumbnailEntry parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ThumbnailEntry parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ThumbnailEntry parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ThumbnailEntry parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ThumbnailEntry parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ThumbnailEntry prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code org.chromium.chrome.browser.widget.ThumbnailEntry}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ThumbnailEntry, Builder> implements
        // @@protoc_insertion_point(builder_implements:org.chromium.chrome.browser.widget.ThumbnailEntry)
        org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ThumbnailEntryOrBuilder {
      // Construct using org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ThumbnailEntry.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * Required.
       * </pre>
       *
       * <code>optional .org.chromium.chrome.browser.widget.ContentId content_id = 1;</code>
       */
      @java.lang.Override
      public boolean hasContentId() {
        return instance.hasContentId();
      }
      /**
       * <pre>
       * Required.
       * </pre>
       *
       * <code>optional .org.chromium.chrome.browser.widget.ContentId content_id = 1;</code>
       */
      @java.lang.Override
      public org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId getContentId() {
        return instance.getContentId();
      }
      /**
       * <pre>
       * Required.
       * </pre>
       *
       * <code>optional .org.chromium.chrome.browser.widget.ContentId content_id = 1;</code>
       */
      public Builder setContentId(org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId value) {
        copyOnWrite();
        instance.setContentId(value);
        return this;
        }
      /**
       * <pre>
       * Required.
       * </pre>
       *
       * <code>optional .org.chromium.chrome.browser.widget.ContentId content_id = 1;</code>
       */
      public Builder setContentId(
          org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId.Builder builderForValue) {
        copyOnWrite();
        instance.setContentId(builderForValue);
        return this;
      }
      /**
       * <pre>
       * Required.
       * </pre>
       *
       * <code>optional .org.chromium.chrome.browser.widget.ContentId content_id = 1;</code>
       */
      public Builder mergeContentId(org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId value) {
        copyOnWrite();
        instance.mergeContentId(value);
        return this;
      }
      /**
       * <pre>
       * Required.
       * </pre>
       *
       * <code>optional .org.chromium.chrome.browser.widget.ContentId content_id = 1;</code>
       */
      public Builder clearContentId() {  copyOnWrite();
        instance.clearContentId();
        return this;
      }

      /**
       * <pre>
       * Requested size (maximum required dimension (pixel) of the smaller side)
       * of the thumbnail.
       * Required.
       * </pre>
       *
       * <code>optional int32 size_px = 2;</code>
       */
      @java.lang.Override
      public boolean hasSizePx() {
        return instance.hasSizePx();
      }
      /**
       * <pre>
       * Requested size (maximum required dimension (pixel) of the smaller side)
       * of the thumbnail.
       * Required.
       * </pre>
       *
       * <code>optional int32 size_px = 2;</code>
       */
      @java.lang.Override
      public int getSizePx() {
        return instance.getSizePx();
      }
      /**
       * <pre>
       * Requested size (maximum required dimension (pixel) of the smaller side)
       * of the thumbnail.
       * Required.
       * </pre>
       *
       * <code>optional int32 size_px = 2;</code>
       */
      public Builder setSizePx(int value) {
        copyOnWrite();
        instance.setSizePx(value);
        return this;
      }
      /**
       * <pre>
       * Requested size (maximum required dimension (pixel) of the smaller side)
       * of the thumbnail.
       * Required.
       * </pre>
       *
       * <code>optional int32 size_px = 2;</code>
       */
      public Builder clearSizePx() {
        copyOnWrite();
        instance.clearSizePx();
        return this;
      }

      /**
       * <code>optional bytes compressed_png = 3;</code>
       */
      @java.lang.Override
      public boolean hasCompressedPng() {
        return instance.hasCompressedPng();
      }
      /**
       * <code>optional bytes compressed_png = 3;</code>
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getCompressedPng() {
        return instance.getCompressedPng();
      }
      /**
       * <code>optional bytes compressed_png = 3;</code>
       */
      public Builder setCompressedPng(com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setCompressedPng(value);
        return this;
      }
      /**
       * <code>optional bytes compressed_png = 3;</code>
       */
      public Builder clearCompressedPng() {
        copyOnWrite();
        instance.clearCompressedPng();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:org.chromium.chrome.browser.widget.ThumbnailEntry)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ThumbnailEntry();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ThumbnailEntry other = (org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ThumbnailEntry) arg1;
          contentId_ = visitor.visitMessage(contentId_, other.contentId_);
          sizePx_ = visitor.visitInt(
              hasSizePx(), sizePx_,
              other.hasSizePx(), other.sizePx_);
          compressedPng_ = visitor.visitByteString(
              hasCompressedPng(), compressedPng_,
              other.hasCompressedPng(), other.compressedPng_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
            bitField0_ |= other.bitField0_;
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
          }
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                case 10: {
                  org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId.Builder subBuilder = null;
                  if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    subBuilder = contentId_.toBuilder();
                  }
                  contentId_ = input.readMessage(org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ContentId.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(contentId_);
                    contentId_ = subBuilder.buildPartial();
                  }
                  bitField0_ |= 0x00000001;
                  break;
                }
                case 16: {
                  bitField0_ |= 0x00000002;
                  sizePx_ = input.readInt32();
                  break;
                }
                case 26: {
                  bitField0_ |= 0x00000004;
                  compressedPng_ = input.readBytes();
                  break;
                }
                default: {
                  if (!parseUnknownField(tag, input)) {
                    done = true;
                  }
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ThumbnailEntry> parser = PARSER;
          if (parser == null) {
            synchronized (org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ThumbnailEntry.class) {
              parser = PARSER;
              if (parser == null) {
                parser = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:org.chromium.chrome.browser.widget.ThumbnailEntry)
    private static final org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ThumbnailEntry DEFAULT_INSTANCE;
    static {
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = new ThumbnailEntry();
    }

    public static org.chromium.chrome.browser.widget.ThumbnailCacheEntry.ThumbnailEntry getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ThumbnailEntry> PARSER;

    public static com.google.protobuf.Parser<ThumbnailEntry> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}