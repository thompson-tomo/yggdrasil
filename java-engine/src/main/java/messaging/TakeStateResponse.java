// automatically generated by the FlatBuffers compiler, do not modify

package messaging;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class TakeStateResponse extends Table {
  public static void ValidateVersion() {
    Constants.FLATBUFFERS_23_1_21();
  }

  public static TakeStateResponse getRootAsTakeStateResponse(ByteBuffer _bb) {
    return getRootAsTakeStateResponse(_bb, new TakeStateResponse());
  }

  public static TakeStateResponse getRootAsTakeStateResponse(
      ByteBuffer _bb, TakeStateResponse obj) {
    _bb.order(ByteOrder.LITTLE_ENDIAN);
    return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb));
  }

  public void __init(int _i, ByteBuffer _bb) {
    __reset(_i, _bb);
  }

  public TakeStateResponse __assign(int _i, ByteBuffer _bb) {
    __init(_i, _bb);
    return this;
  }

  public String warnings(int j) {
    int o = __offset(4);
    return o != 0 ? __string(__vector(o) + j * 4) : null;
  }

  public int warningsLength() {
    int o = __offset(4);
    return o != 0 ? __vector_len(o) : 0;
  }

  public StringVector warningsVector() {
    return warningsVector(new StringVector());
  }

  public StringVector warningsVector(StringVector obj) {
    int o = __offset(4);
    return o != 0 ? obj.__assign(__vector(o), 4, bb) : null;
  }

  public String error() {
    int o = __offset(6);
    return o != 0 ? __string(o + bb_pos) : null;
  }

  public ByteBuffer errorAsByteBuffer() {
    return __vector_as_bytebuffer(6, 1);
  }

  public ByteBuffer errorInByteBuffer(ByteBuffer _bb) {
    return __vector_in_bytebuffer(_bb, 6, 1);
  }

  public static int createTakeStateResponse(
      FlatBufferBuilder builder, int warningsOffset, int errorOffset) {
    builder.startTable(2);
    TakeStateResponse.addError(builder, errorOffset);
    TakeStateResponse.addWarnings(builder, warningsOffset);
    return TakeStateResponse.endTakeStateResponse(builder);
  }

  public static void startTakeStateResponse(FlatBufferBuilder builder) {
    builder.startTable(2);
  }

  public static void addWarnings(FlatBufferBuilder builder, int warningsOffset) {
    builder.addOffset(0, warningsOffset, 0);
  }

  public static int createWarningsVector(FlatBufferBuilder builder, int[] data) {
    builder.startVector(4, data.length, 4);
    for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]);
    return builder.endVector();
  }

  public static void startWarningsVector(FlatBufferBuilder builder, int numElems) {
    builder.startVector(4, numElems, 4);
  }

  public static void addError(FlatBufferBuilder builder, int errorOffset) {
    builder.addOffset(1, errorOffset, 0);
  }

  public static int endTakeStateResponse(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) {
      __reset(_vector, _element_size, _bb);
      return this;
    }

    public TakeStateResponse get(int j) {
      return get(new TakeStateResponse(), j);
    }

    public TakeStateResponse get(TakeStateResponse obj, int j) {
      return obj.__assign(__indirect(__element(j), bb), bb);
    }
  }
}
