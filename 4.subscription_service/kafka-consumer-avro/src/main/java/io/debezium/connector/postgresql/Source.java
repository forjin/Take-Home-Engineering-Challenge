/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.debezium.connector.postgresql;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Source extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2724265311306765244L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Source\",\"namespace\":\"io.debezium.connector.postgresql\",\"fields\":[{\"name\":\"version\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"connector\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"ts_ms\",\"type\":\"long\"},{\"name\":\"snapshot\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\",\"connect.default\":\"false\",\"connect.name\":\"io.debezium.data.Enum\",\"connect.parameters\":{\"allowed\":\"true,last,false,incremental\"},\"connect.version\":1},\"null\"],\"default\":\"false\"},{\"name\":\"db\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"sequence\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"schema\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"table\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"txId\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"lsn\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"xmin\",\"type\":[\"null\",\"long\"],\"default\":null}],\"connect.name\":\"io.debezium.connector.postgresql.Source\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Source> ENCODER =
      new BinaryMessageEncoder<Source>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Source> DECODER =
      new BinaryMessageDecoder<Source>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Source> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Source> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Source> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Source>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Source to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Source from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Source instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Source fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String version;
  @Deprecated public java.lang.String connector;
  @Deprecated public java.lang.String name;
  @Deprecated public long ts_ms;
  @Deprecated public java.lang.String snapshot;
  @Deprecated public java.lang.String db;
  @Deprecated public java.lang.String sequence;
  @Deprecated public java.lang.String schema;
  @Deprecated public java.lang.String table;
  @Deprecated public java.lang.Long txId;
  @Deprecated public java.lang.Long lsn;
  @Deprecated public java.lang.Long xmin;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Source() {}

  /**
   * All-args constructor.
   * @param version The new value for version
   * @param connector The new value for connector
   * @param name The new value for name
   * @param ts_ms The new value for ts_ms
   * @param snapshot The new value for snapshot
   * @param db The new value for db
   * @param sequence The new value for sequence
   * @param schema The new value for schema
   * @param table The new value for table
   * @param txId The new value for txId
   * @param lsn The new value for lsn
   * @param xmin The new value for xmin
   */
  public Source(java.lang.String version, java.lang.String connector, java.lang.String name, java.lang.Long ts_ms, java.lang.String snapshot, java.lang.String db, java.lang.String sequence, java.lang.String schema, java.lang.String table, java.lang.Long txId, java.lang.Long lsn, java.lang.Long xmin) {
    this.version = version;
    this.connector = connector;
    this.name = name;
    this.ts_ms = ts_ms;
    this.snapshot = snapshot;
    this.db = db;
    this.sequence = sequence;
    this.schema = schema;
    this.table = table;
    this.txId = txId;
    this.lsn = lsn;
    this.xmin = xmin;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return version;
    case 1: return connector;
    case 2: return name;
    case 3: return ts_ms;
    case 4: return snapshot;
    case 5: return db;
    case 6: return sequence;
    case 7: return schema;
    case 8: return table;
    case 9: return txId;
    case 10: return lsn;
    case 11: return xmin;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: version = value$ != null ? value$.toString() : null; break;
    case 1: connector = value$ != null ? value$.toString() : null; break;
    case 2: name = value$ != null ? value$.toString() : null; break;
    case 3: ts_ms = (java.lang.Long)value$; break;
    case 4: snapshot = value$ != null ? value$.toString() : null; break;
    case 5: db = value$ != null ? value$.toString() : null; break;
    case 6: sequence = value$ != null ? value$.toString() : null; break;
    case 7: schema = value$ != null ? value$.toString() : null; break;
    case 8: table = value$ != null ? value$.toString() : null; break;
    case 9: txId = (java.lang.Long)value$; break;
    case 10: lsn = (java.lang.Long)value$; break;
    case 11: xmin = (java.lang.Long)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'version' field.
   * @return The value of the 'version' field.
   */
  public java.lang.String getVersion() {
    return version;
  }


  /**
   * Sets the value of the 'version' field.
   * @param value the value to set.
   */
  public void setVersion(java.lang.String value) {
    this.version = value;
  }

  /**
   * Gets the value of the 'connector' field.
   * @return The value of the 'connector' field.
   */
  public java.lang.String getConnector() {
    return connector;
  }


  /**
   * Sets the value of the 'connector' field.
   * @param value the value to set.
   */
  public void setConnector(java.lang.String value) {
    this.connector = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'ts_ms' field.
   * @return The value of the 'ts_ms' field.
   */
  public long getTsMs() {
    return ts_ms;
  }


  /**
   * Sets the value of the 'ts_ms' field.
   * @param value the value to set.
   */
  public void setTsMs(long value) {
    this.ts_ms = value;
  }

  /**
   * Gets the value of the 'snapshot' field.
   * @return The value of the 'snapshot' field.
   */
  public java.lang.String getSnapshot() {
    return snapshot;
  }


  /**
   * Sets the value of the 'snapshot' field.
   * @param value the value to set.
   */
  public void setSnapshot(java.lang.String value) {
    this.snapshot = value;
  }

  /**
   * Gets the value of the 'db' field.
   * @return The value of the 'db' field.
   */
  public java.lang.String getDb() {
    return db;
  }


  /**
   * Sets the value of the 'db' field.
   * @param value the value to set.
   */
  public void setDb(java.lang.String value) {
    this.db = value;
  }

  /**
   * Gets the value of the 'sequence' field.
   * @return The value of the 'sequence' field.
   */
  public java.lang.String getSequence() {
    return sequence;
  }


  /**
   * Sets the value of the 'sequence' field.
   * @param value the value to set.
   */
  public void setSequence(java.lang.String value) {
    this.sequence = value;
  }

  /**
   * Gets the value of the 'schema' field.
   * @return The value of the 'schema' field.
   */
  public java.lang.String getSchema$() {
    return schema;
  }


  /**
   * Sets the value of the 'schema' field.
   * @param value the value to set.
   */
  public void setSchema$(java.lang.String value) {
    this.schema = value;
  }

  /**
   * Gets the value of the 'table' field.
   * @return The value of the 'table' field.
   */
  public java.lang.String getTable() {
    return table;
  }


  /**
   * Sets the value of the 'table' field.
   * @param value the value to set.
   */
  public void setTable(java.lang.String value) {
    this.table = value;
  }

  /**
   * Gets the value of the 'txId' field.
   * @return The value of the 'txId' field.
   */
  public java.lang.Long getTxId() {
    return txId;
  }


  /**
   * Sets the value of the 'txId' field.
   * @param value the value to set.
   */
  public void setTxId(java.lang.Long value) {
    this.txId = value;
  }

  /**
   * Gets the value of the 'lsn' field.
   * @return The value of the 'lsn' field.
   */
  public java.lang.Long getLsn() {
    return lsn;
  }


  /**
   * Sets the value of the 'lsn' field.
   * @param value the value to set.
   */
  public void setLsn(java.lang.Long value) {
    this.lsn = value;
  }

  /**
   * Gets the value of the 'xmin' field.
   * @return The value of the 'xmin' field.
   */
  public java.lang.Long getXmin() {
    return xmin;
  }


  /**
   * Sets the value of the 'xmin' field.
   * @param value the value to set.
   */
  public void setXmin(java.lang.Long value) {
    this.xmin = value;
  }

  /**
   * Creates a new Source RecordBuilder.
   * @return A new Source RecordBuilder
   */
  public static io.debezium.connector.postgresql.Source.Builder newBuilder() {
    return new io.debezium.connector.postgresql.Source.Builder();
  }

  /**
   * Creates a new Source RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Source RecordBuilder
   */
  public static io.debezium.connector.postgresql.Source.Builder newBuilder(io.debezium.connector.postgresql.Source.Builder other) {
    if (other == null) {
      return new io.debezium.connector.postgresql.Source.Builder();
    } else {
      return new io.debezium.connector.postgresql.Source.Builder(other);
    }
  }

  /**
   * Creates a new Source RecordBuilder by copying an existing Source instance.
   * @param other The existing instance to copy.
   * @return A new Source RecordBuilder
   */
  public static io.debezium.connector.postgresql.Source.Builder newBuilder(io.debezium.connector.postgresql.Source other) {
    if (other == null) {
      return new io.debezium.connector.postgresql.Source.Builder();
    } else {
      return new io.debezium.connector.postgresql.Source.Builder(other);
    }
  }

  /**
   * RecordBuilder for Source instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Source>
    implements org.apache.avro.data.RecordBuilder<Source> {

    private java.lang.String version;
    private java.lang.String connector;
    private java.lang.String name;
    private long ts_ms;
    private java.lang.String snapshot;
    private java.lang.String db;
    private java.lang.String sequence;
    private java.lang.String schema;
    private java.lang.String table;
    private java.lang.Long txId;
    private java.lang.Long lsn;
    private java.lang.Long xmin;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.debezium.connector.postgresql.Source.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.version)) {
        this.version = data().deepCopy(fields()[0].schema(), other.version);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.connector)) {
        this.connector = data().deepCopy(fields()[1].schema(), other.connector);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.ts_ms)) {
        this.ts_ms = data().deepCopy(fields()[3].schema(), other.ts_ms);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.snapshot)) {
        this.snapshot = data().deepCopy(fields()[4].schema(), other.snapshot);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.db)) {
        this.db = data().deepCopy(fields()[5].schema(), other.db);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.sequence)) {
        this.sequence = data().deepCopy(fields()[6].schema(), other.sequence);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.schema)) {
        this.schema = data().deepCopy(fields()[7].schema(), other.schema);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.table)) {
        this.table = data().deepCopy(fields()[8].schema(), other.table);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
      if (isValidValue(fields()[9], other.txId)) {
        this.txId = data().deepCopy(fields()[9].schema(), other.txId);
        fieldSetFlags()[9] = other.fieldSetFlags()[9];
      }
      if (isValidValue(fields()[10], other.lsn)) {
        this.lsn = data().deepCopy(fields()[10].schema(), other.lsn);
        fieldSetFlags()[10] = other.fieldSetFlags()[10];
      }
      if (isValidValue(fields()[11], other.xmin)) {
        this.xmin = data().deepCopy(fields()[11].schema(), other.xmin);
        fieldSetFlags()[11] = other.fieldSetFlags()[11];
      }
    }

    /**
     * Creates a Builder by copying an existing Source instance
     * @param other The existing instance to copy.
     */
    private Builder(io.debezium.connector.postgresql.Source other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.version)) {
        this.version = data().deepCopy(fields()[0].schema(), other.version);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.connector)) {
        this.connector = data().deepCopy(fields()[1].schema(), other.connector);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ts_ms)) {
        this.ts_ms = data().deepCopy(fields()[3].schema(), other.ts_ms);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.snapshot)) {
        this.snapshot = data().deepCopy(fields()[4].schema(), other.snapshot);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.db)) {
        this.db = data().deepCopy(fields()[5].schema(), other.db);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.sequence)) {
        this.sequence = data().deepCopy(fields()[6].schema(), other.sequence);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.schema)) {
        this.schema = data().deepCopy(fields()[7].schema(), other.schema);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.table)) {
        this.table = data().deepCopy(fields()[8].schema(), other.table);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.txId)) {
        this.txId = data().deepCopy(fields()[9].schema(), other.txId);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.lsn)) {
        this.lsn = data().deepCopy(fields()[10].schema(), other.lsn);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.xmin)) {
        this.xmin = data().deepCopy(fields()[11].schema(), other.xmin);
        fieldSetFlags()[11] = true;
      }
    }

    /**
      * Gets the value of the 'version' field.
      * @return The value.
      */
    public java.lang.String getVersion() {
      return version;
    }


    /**
      * Sets the value of the 'version' field.
      * @param value The value of 'version'.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder setVersion(java.lang.String value) {
      validate(fields()[0], value);
      this.version = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'version' field has been set.
      * @return True if the 'version' field has been set, false otherwise.
      */
    public boolean hasVersion() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'version' field.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder clearVersion() {
      version = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'connector' field.
      * @return The value.
      */
    public java.lang.String getConnector() {
      return connector;
    }


    /**
      * Sets the value of the 'connector' field.
      * @param value The value of 'connector'.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder setConnector(java.lang.String value) {
      validate(fields()[1], value);
      this.connector = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'connector' field has been set.
      * @return True if the 'connector' field has been set, false otherwise.
      */
    public boolean hasConnector() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'connector' field.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder clearConnector() {
      connector = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.String getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder setName(java.lang.String value) {
      validate(fields()[2], value);
      this.name = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder clearName() {
      name = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'ts_ms' field.
      * @return The value.
      */
    public long getTsMs() {
      return ts_ms;
    }


    /**
      * Sets the value of the 'ts_ms' field.
      * @param value The value of 'ts_ms'.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder setTsMs(long value) {
      validate(fields()[3], value);
      this.ts_ms = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'ts_ms' field has been set.
      * @return True if the 'ts_ms' field has been set, false otherwise.
      */
    public boolean hasTsMs() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'ts_ms' field.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder clearTsMs() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'snapshot' field.
      * @return The value.
      */
    public java.lang.String getSnapshot() {
      return snapshot;
    }


    /**
      * Sets the value of the 'snapshot' field.
      * @param value The value of 'snapshot'.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder setSnapshot(java.lang.String value) {
      validate(fields()[4], value);
      this.snapshot = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'snapshot' field has been set.
      * @return True if the 'snapshot' field has been set, false otherwise.
      */
    public boolean hasSnapshot() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'snapshot' field.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder clearSnapshot() {
      snapshot = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'db' field.
      * @return The value.
      */
    public java.lang.String getDb() {
      return db;
    }


    /**
      * Sets the value of the 'db' field.
      * @param value The value of 'db'.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder setDb(java.lang.String value) {
      validate(fields()[5], value);
      this.db = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'db' field has been set.
      * @return True if the 'db' field has been set, false otherwise.
      */
    public boolean hasDb() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'db' field.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder clearDb() {
      db = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'sequence' field.
      * @return The value.
      */
    public java.lang.String getSequence() {
      return sequence;
    }


    /**
      * Sets the value of the 'sequence' field.
      * @param value The value of 'sequence'.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder setSequence(java.lang.String value) {
      validate(fields()[6], value);
      this.sequence = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'sequence' field has been set.
      * @return True if the 'sequence' field has been set, false otherwise.
      */
    public boolean hasSequence() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'sequence' field.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder clearSequence() {
      sequence = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'schema' field.
      * @return The value.
      */
    public java.lang.String getSchema$() {
      return schema;
    }


    /**
      * Sets the value of the 'schema' field.
      * @param value The value of 'schema'.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder setSchema$(java.lang.String value) {
      validate(fields()[7], value);
      this.schema = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'schema' field has been set.
      * @return True if the 'schema' field has been set, false otherwise.
      */
    public boolean hasSchema$() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'schema' field.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder clearSchema$() {
      schema = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'table' field.
      * @return The value.
      */
    public java.lang.String getTable() {
      return table;
    }


    /**
      * Sets the value of the 'table' field.
      * @param value The value of 'table'.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder setTable(java.lang.String value) {
      validate(fields()[8], value);
      this.table = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'table' field has been set.
      * @return True if the 'table' field has been set, false otherwise.
      */
    public boolean hasTable() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'table' field.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder clearTable() {
      table = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'txId' field.
      * @return The value.
      */
    public java.lang.Long getTxId() {
      return txId;
    }


    /**
      * Sets the value of the 'txId' field.
      * @param value The value of 'txId'.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder setTxId(java.lang.Long value) {
      validate(fields()[9], value);
      this.txId = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'txId' field has been set.
      * @return True if the 'txId' field has been set, false otherwise.
      */
    public boolean hasTxId() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'txId' field.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder clearTxId() {
      txId = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'lsn' field.
      * @return The value.
      */
    public java.lang.Long getLsn() {
      return lsn;
    }


    /**
      * Sets the value of the 'lsn' field.
      * @param value The value of 'lsn'.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder setLsn(java.lang.Long value) {
      validate(fields()[10], value);
      this.lsn = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'lsn' field has been set.
      * @return True if the 'lsn' field has been set, false otherwise.
      */
    public boolean hasLsn() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'lsn' field.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder clearLsn() {
      lsn = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'xmin' field.
      * @return The value.
      */
    public java.lang.Long getXmin() {
      return xmin;
    }


    /**
      * Sets the value of the 'xmin' field.
      * @param value The value of 'xmin'.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder setXmin(java.lang.Long value) {
      validate(fields()[11], value);
      this.xmin = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'xmin' field has been set.
      * @return True if the 'xmin' field has been set, false otherwise.
      */
    public boolean hasXmin() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'xmin' field.
      * @return This builder.
      */
    public io.debezium.connector.postgresql.Source.Builder clearXmin() {
      xmin = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Source build() {
      try {
        Source record = new Source();
        record.version = fieldSetFlags()[0] ? this.version : (java.lang.String) defaultValue(fields()[0]);
        record.connector = fieldSetFlags()[1] ? this.connector : (java.lang.String) defaultValue(fields()[1]);
        record.name = fieldSetFlags()[2] ? this.name : (java.lang.String) defaultValue(fields()[2]);
        record.ts_ms = fieldSetFlags()[3] ? this.ts_ms : (java.lang.Long) defaultValue(fields()[3]);
        record.snapshot = fieldSetFlags()[4] ? this.snapshot : (java.lang.String) defaultValue(fields()[4]);
        record.db = fieldSetFlags()[5] ? this.db : (java.lang.String) defaultValue(fields()[5]);
        record.sequence = fieldSetFlags()[6] ? this.sequence : (java.lang.String) defaultValue(fields()[6]);
        record.schema = fieldSetFlags()[7] ? this.schema : (java.lang.String) defaultValue(fields()[7]);
        record.table = fieldSetFlags()[8] ? this.table : (java.lang.String) defaultValue(fields()[8]);
        record.txId = fieldSetFlags()[9] ? this.txId : (java.lang.Long) defaultValue(fields()[9]);
        record.lsn = fieldSetFlags()[10] ? this.lsn : (java.lang.Long) defaultValue(fields()[10]);
        record.xmin = fieldSetFlags()[11] ? this.xmin : (java.lang.Long) defaultValue(fields()[11]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Source>
    WRITER$ = (org.apache.avro.io.DatumWriter<Source>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Source>
    READER$ = (org.apache.avro.io.DatumReader<Source>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.version);

    out.writeString(this.connector);

    out.writeString(this.name);

    out.writeLong(this.ts_ms);

    if (this.snapshot == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.snapshot);
    }

    out.writeString(this.db);

    if (this.sequence == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.sequence);
    }

    out.writeString(this.schema);

    out.writeString(this.table);

    if (this.txId == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.txId);
    }

    if (this.lsn == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.lsn);
    }

    if (this.xmin == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.xmin);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.version = in.readString();

      this.connector = in.readString();

      this.name = in.readString();

      this.ts_ms = in.readLong();

      if (in.readIndex() != 0) {
        in.readNull();
        this.snapshot = null;
      } else {
        this.snapshot = in.readString();
      }

      this.db = in.readString();

      if (in.readIndex() != 1) {
        in.readNull();
        this.sequence = null;
      } else {
        this.sequence = in.readString();
      }

      this.schema = in.readString();

      this.table = in.readString();

      if (in.readIndex() != 1) {
        in.readNull();
        this.txId = null;
      } else {
        this.txId = in.readLong();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.lsn = null;
      } else {
        this.lsn = in.readLong();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.xmin = null;
      } else {
        this.xmin = in.readLong();
      }

    } else {
      for (int i = 0; i < 12; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.version = in.readString();
          break;

        case 1:
          this.connector = in.readString();
          break;

        case 2:
          this.name = in.readString();
          break;

        case 3:
          this.ts_ms = in.readLong();
          break;

        case 4:
          if (in.readIndex() != 0) {
            in.readNull();
            this.snapshot = null;
          } else {
            this.snapshot = in.readString();
          }
          break;

        case 5:
          this.db = in.readString();
          break;

        case 6:
          if (in.readIndex() != 1) {
            in.readNull();
            this.sequence = null;
          } else {
            this.sequence = in.readString();
          }
          break;

        case 7:
          this.schema = in.readString();
          break;

        case 8:
          this.table = in.readString();
          break;

        case 9:
          if (in.readIndex() != 1) {
            in.readNull();
            this.txId = null;
          } else {
            this.txId = in.readLong();
          }
          break;

        case 10:
          if (in.readIndex() != 1) {
            in.readNull();
            this.lsn = null;
          } else {
            this.lsn = in.readLong();
          }
          break;

        case 11:
          if (in.readIndex() != 1) {
            in.readNull();
            this.xmin = null;
          } else {
            this.xmin = in.readLong();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










