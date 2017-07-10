// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EventMessage.proto

package com.gasmonitor.collector;

public final class EventProbuf {
  private EventProbuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface EventMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EventMessage)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>required string hardwareId = 1;</code>
     */
    boolean hasHardwareId();
    /**
     * <code>required string hardwareId = 1;</code>
     */
    java.lang.String getHardwareId();
    /**
     * <code>required string hardwareId = 1;</code>
     */
    com.google.protobuf.ByteString
        getHardwareIdBytes();

    /**
     * <code>optional double temperature = 2;</code>
     */
    boolean hasTemperature();
    /**
     * <code>optional double temperature = 2;</code>
     */
    double getTemperature();

    /**
     * <code>optional double pressure = 3;</code>
     */
    boolean hasPressure();
    /**
     * <code>optional double pressure = 3;</code>
     */
    double getPressure();

    /**
     * <code>optional double standard = 4;</code>
     */
    boolean hasStandard();
    /**
     * <code>optional double standard = 4;</code>
     */
    double getStandard();

    /**
     * <code>optional double running = 5;</code>
     */
    boolean hasRunning();
    /**
     * <code>optional double running = 5;</code>
     */
    double getRunning();

    /**
     * <code>optional double summary = 6;</code>
     */
    boolean hasSummary();
    /**
     * <code>optional double summary = 6;</code>
     */
    double getSummary();

    /**
     * <code>optional uint64 pointtime = 7;</code>
     */
    boolean hasPointtime();
    /**
     * <code>optional uint64 pointtime = 7;</code>
     */
    long getPointtime();
  }
  /**
   * Protobuf type {@code EventMessage}
   */
  public static final class EventMessage extends
      com.google.protobuf.GeneratedMessageLite implements
      // @@protoc_insertion_point(message_implements:EventMessage)
      EventMessageOrBuilder {
    // Use EventMessage.newBuilder() to construct.
    private EventMessage(com.google.protobuf.GeneratedMessageLite.Builder builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private EventMessage(boolean noInit) { this.unknownFields = com.google.protobuf.ByteString.EMPTY;}

    private static final EventMessage defaultInstance;
    public static EventMessage getDefaultInstance() {
      return defaultInstance;
    }

    public EventMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.ByteString unknownFields;
    private EventMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.ByteString.Output unknownFieldsOutput =
          com.google.protobuf.ByteString.newOutput();
      com.google.protobuf.CodedOutputStream unknownFieldsCodedOutput =
          com.google.protobuf.CodedOutputStream.newInstance(
              unknownFieldsOutput);
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFieldsCodedOutput,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              hardwareId_ = bs;
              break;
            }
            case 17: {
              bitField0_ |= 0x00000002;
              temperature_ = input.readDouble();
              break;
            }
            case 25: {
              bitField0_ |= 0x00000004;
              pressure_ = input.readDouble();
              break;
            }
            case 33: {
              bitField0_ |= 0x00000008;
              standard_ = input.readDouble();
              break;
            }
            case 41: {
              bitField0_ |= 0x00000010;
              running_ = input.readDouble();
              break;
            }
            case 49: {
              bitField0_ |= 0x00000020;
              summary_ = input.readDouble();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              pointtime_ = input.readUInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        try {
          unknownFieldsCodedOutput.flush();
        } catch (java.io.IOException e) {
        // Should not happen
        } finally {
          unknownFields = unknownFieldsOutput.toByteString();
        }
        makeExtensionsImmutable();
      }
    }
    public static com.google.protobuf.Parser<EventMessage> PARSER =
        new com.google.protobuf.AbstractParser<EventMessage>() {
      public EventMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EventMessage(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<EventMessage> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int HARDWAREID_FIELD_NUMBER = 1;
    private java.lang.Object hardwareId_;
    /**
     * <code>required string hardwareId = 1;</code>
     */
    public boolean hasHardwareId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string hardwareId = 1;</code>
     */
    public java.lang.String getHardwareId() {
      java.lang.Object ref = hardwareId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          hardwareId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string hardwareId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getHardwareIdBytes() {
      java.lang.Object ref = hardwareId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hardwareId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TEMPERATURE_FIELD_NUMBER = 2;
    private double temperature_;
    /**
     * <code>optional double temperature = 2;</code>
     */
    public boolean hasTemperature() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional double temperature = 2;</code>
     */
    public double getTemperature() {
      return temperature_;
    }

    public static final int PRESSURE_FIELD_NUMBER = 3;
    private double pressure_;
    /**
     * <code>optional double pressure = 3;</code>
     */
    public boolean hasPressure() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional double pressure = 3;</code>
     */
    public double getPressure() {
      return pressure_;
    }

    public static final int STANDARD_FIELD_NUMBER = 4;
    private double standard_;
    /**
     * <code>optional double standard = 4;</code>
     */
    public boolean hasStandard() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional double standard = 4;</code>
     */
    public double getStandard() {
      return standard_;
    }

    public static final int RUNNING_FIELD_NUMBER = 5;
    private double running_;
    /**
     * <code>optional double running = 5;</code>
     */
    public boolean hasRunning() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional double running = 5;</code>
     */
    public double getRunning() {
      return running_;
    }

    public static final int SUMMARY_FIELD_NUMBER = 6;
    private double summary_;
    /**
     * <code>optional double summary = 6;</code>
     */
    public boolean hasSummary() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional double summary = 6;</code>
     */
    public double getSummary() {
      return summary_;
    }

    public static final int POINTTIME_FIELD_NUMBER = 7;
    private long pointtime_;
    /**
     * <code>optional uint64 pointtime = 7;</code>
     */
    public boolean hasPointtime() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional uint64 pointtime = 7;</code>
     */
    public long getPointtime() {
      return pointtime_;
    }

    private void initFields() {
      hardwareId_ = "";
      temperature_ = 0D;
      pressure_ = 0D;
      standard_ = 0D;
      running_ = 0D;
      summary_ = 0D;
      pointtime_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasHardwareId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getHardwareIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeDouble(2, temperature_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeDouble(3, pressure_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeDouble(4, standard_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeDouble(5, running_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeDouble(6, summary_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeUInt64(7, pointtime_);
      }
      output.writeRawBytes(unknownFields);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getHardwareIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, temperature_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, pressure_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(4, standard_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(5, running_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(6, summary_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(7, pointtime_);
      }
      size += unknownFields.size();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.gasmonitor.collector.EventProbuf.EventMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.gasmonitor.collector.EventProbuf.EventMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.gasmonitor.collector.EventProbuf.EventMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.gasmonitor.collector.EventProbuf.EventMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.gasmonitor.collector.EventProbuf.EventMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.gasmonitor.collector.EventProbuf.EventMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.gasmonitor.collector.EventProbuf.EventMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.gasmonitor.collector.EventProbuf.EventMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.gasmonitor.collector.EventProbuf.EventMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.gasmonitor.collector.EventProbuf.EventMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.gasmonitor.collector.EventProbuf.EventMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    /**
     * Protobuf type {@code EventMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.gasmonitor.collector.EventProbuf.EventMessage, Builder>
        implements
        // @@protoc_insertion_point(builder_implements:EventMessage)
        com.gasmonitor.collector.EventProbuf.EventMessageOrBuilder {
      // Construct using com.gasmonitor.collector.EventProbuf.EventMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        hardwareId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        temperature_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000002);
        pressure_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000004);
        standard_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000008);
        running_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000010);
        summary_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000020);
        pointtime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.gasmonitor.collector.EventProbuf.EventMessage getDefaultInstanceForType() {
        return com.gasmonitor.collector.EventProbuf.EventMessage.getDefaultInstance();
      }

      public com.gasmonitor.collector.EventProbuf.EventMessage build() {
        com.gasmonitor.collector.EventProbuf.EventMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.gasmonitor.collector.EventProbuf.EventMessage buildPartial() {
        com.gasmonitor.collector.EventProbuf.EventMessage result = new com.gasmonitor.collector.EventProbuf.EventMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.hardwareId_ = hardwareId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.temperature_ = temperature_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.pressure_ = pressure_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.standard_ = standard_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.running_ = running_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.summary_ = summary_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.pointtime_ = pointtime_;
        result.bitField0_ = to_bitField0_;
        return result;
      }

      public Builder mergeFrom(com.gasmonitor.collector.EventProbuf.EventMessage other) {
        if (other == com.gasmonitor.collector.EventProbuf.EventMessage.getDefaultInstance()) return this;
        if (other.hasHardwareId()) {
          bitField0_ |= 0x00000001;
          hardwareId_ = other.hardwareId_;
          
        }
        if (other.hasTemperature()) {
          setTemperature(other.getTemperature());
        }
        if (other.hasPressure()) {
          setPressure(other.getPressure());
        }
        if (other.hasStandard()) {
          setStandard(other.getStandard());
        }
        if (other.hasRunning()) {
          setRunning(other.getRunning());
        }
        if (other.hasSummary()) {
          setSummary(other.getSummary());
        }
        if (other.hasPointtime()) {
          setPointtime(other.getPointtime());
        }
        setUnknownFields(
            getUnknownFields().concat(other.unknownFields));
        return this;
      }

      public final boolean isInitialized() {
        if (!hasHardwareId()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.gasmonitor.collector.EventProbuf.EventMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.gasmonitor.collector.EventProbuf.EventMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object hardwareId_ = "";
      /**
       * <code>required string hardwareId = 1;</code>
       */
      public boolean hasHardwareId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string hardwareId = 1;</code>
       */
      public java.lang.String getHardwareId() {
        java.lang.Object ref = hardwareId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            hardwareId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string hardwareId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getHardwareIdBytes() {
        java.lang.Object ref = hardwareId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          hardwareId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string hardwareId = 1;</code>
       */
      public Builder setHardwareId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        hardwareId_ = value;
        
        return this;
      }
      /**
       * <code>required string hardwareId = 1;</code>
       */
      public Builder clearHardwareId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        hardwareId_ = getDefaultInstance().getHardwareId();
        
        return this;
      }
      /**
       * <code>required string hardwareId = 1;</code>
       */
      public Builder setHardwareIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        hardwareId_ = value;
        
        return this;
      }

      private double temperature_ ;
      /**
       * <code>optional double temperature = 2;</code>
       */
      public boolean hasTemperature() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional double temperature = 2;</code>
       */
      public double getTemperature() {
        return temperature_;
      }
      /**
       * <code>optional double temperature = 2;</code>
       */
      public Builder setTemperature(double value) {
        bitField0_ |= 0x00000002;
        temperature_ = value;
        
        return this;
      }
      /**
       * <code>optional double temperature = 2;</code>
       */
      public Builder clearTemperature() {
        bitField0_ = (bitField0_ & ~0x00000002);
        temperature_ = 0D;
        
        return this;
      }

      private double pressure_ ;
      /**
       * <code>optional double pressure = 3;</code>
       */
      public boolean hasPressure() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional double pressure = 3;</code>
       */
      public double getPressure() {
        return pressure_;
      }
      /**
       * <code>optional double pressure = 3;</code>
       */
      public Builder setPressure(double value) {
        bitField0_ |= 0x00000004;
        pressure_ = value;
        
        return this;
      }
      /**
       * <code>optional double pressure = 3;</code>
       */
      public Builder clearPressure() {
        bitField0_ = (bitField0_ & ~0x00000004);
        pressure_ = 0D;
        
        return this;
      }

      private double standard_ ;
      /**
       * <code>optional double standard = 4;</code>
       */
      public boolean hasStandard() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional double standard = 4;</code>
       */
      public double getStandard() {
        return standard_;
      }
      /**
       * <code>optional double standard = 4;</code>
       */
      public Builder setStandard(double value) {
        bitField0_ |= 0x00000008;
        standard_ = value;
        
        return this;
      }
      /**
       * <code>optional double standard = 4;</code>
       */
      public Builder clearStandard() {
        bitField0_ = (bitField0_ & ~0x00000008);
        standard_ = 0D;
        
        return this;
      }

      private double running_ ;
      /**
       * <code>optional double running = 5;</code>
       */
      public boolean hasRunning() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional double running = 5;</code>
       */
      public double getRunning() {
        return running_;
      }
      /**
       * <code>optional double running = 5;</code>
       */
      public Builder setRunning(double value) {
        bitField0_ |= 0x00000010;
        running_ = value;
        
        return this;
      }
      /**
       * <code>optional double running = 5;</code>
       */
      public Builder clearRunning() {
        bitField0_ = (bitField0_ & ~0x00000010);
        running_ = 0D;
        
        return this;
      }

      private double summary_ ;
      /**
       * <code>optional double summary = 6;</code>
       */
      public boolean hasSummary() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional double summary = 6;</code>
       */
      public double getSummary() {
        return summary_;
      }
      /**
       * <code>optional double summary = 6;</code>
       */
      public Builder setSummary(double value) {
        bitField0_ |= 0x00000020;
        summary_ = value;
        
        return this;
      }
      /**
       * <code>optional double summary = 6;</code>
       */
      public Builder clearSummary() {
        bitField0_ = (bitField0_ & ~0x00000020);
        summary_ = 0D;
        
        return this;
      }

      private long pointtime_ ;
      /**
       * <code>optional uint64 pointtime = 7;</code>
       */
      public boolean hasPointtime() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional uint64 pointtime = 7;</code>
       */
      public long getPointtime() {
        return pointtime_;
      }
      /**
       * <code>optional uint64 pointtime = 7;</code>
       */
      public Builder setPointtime(long value) {
        bitField0_ |= 0x00000040;
        pointtime_ = value;
        
        return this;
      }
      /**
       * <code>optional uint64 pointtime = 7;</code>
       */
      public Builder clearPointtime() {
        bitField0_ = (bitField0_ & ~0x00000040);
        pointtime_ = 0L;
        
        return this;
      }

      // @@protoc_insertion_point(builder_scope:EventMessage)
    }

    static {
      defaultInstance = new EventMessage(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:EventMessage)
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}