// automatically generated by the FlatBuffers compiler, do not modify

package messaging;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class FeatureDefs extends Table {
  public static void ValidateVersion() {
    Constants.FLATBUFFERS_23_1_21();
  }

  public static FeatureDefs getRootAsFeatureDefs(ByteBuffer _bb) {
    return getRootAsFeatureDefs(_bb, new FeatureDefs());
  }

  public static FeatureDefs getRootAsFeatureDefs(ByteBuffer _bb, FeatureDefs obj) {
    _bb.order(ByteOrder.LITTLE_ENDIAN);
    return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb));
  }

  public void __init(int _i, ByteBuffer _bb) {
    __reset(_i, _bb);
  }

  public FeatureDefs __assign(int _i, ByteBuffer _bb) {
    __init(_i, _bb);
    return this;
  }

  public messaging.FeatureDef items(int j) {
    return items(new messaging.FeatureDef(), j);
  }

  public messaging.FeatureDef items(messaging.FeatureDef obj, int j) {
    int o = __offset(4);
    return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null;
  }

  public int itemsLength() {
    int o = __offset(4);
    return o != 0 ? __vector_len(o) : 0;
  }

  public messaging.FeatureDef.Vector itemsVector() {
    return itemsVector(new messaging.FeatureDef.Vector());
  }

  public messaging.FeatureDef.Vector itemsVector(messaging.FeatureDef.Vector obj) {
    int o = __offset(4);
    return o != 0 ? obj.__assign(__vector(o), 4, bb) : null;
  }

  public static int createFeatureDefs(FlatBufferBuilder builder, int itemsOffset) {
    builder.startTable(1);
    FeatureDefs.addItems(builder, itemsOffset);
    return FeatureDefs.endFeatureDefs(builder);
  }

  public static void startFeatureDefs(FlatBufferBuilder builder) {
    builder.startTable(1);
  }

  public static void addItems(FlatBufferBuilder builder, int itemsOffset) {
    builder.addOffset(0, itemsOffset, 0);
  }

  public static int createItemsVector(FlatBufferBuilder builder, int[] data) {
    builder.startVector(4, data.length, 4);
    for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]);
    return builder.endVector();
  }

  public static void startItemsVector(FlatBufferBuilder builder, int numElems) {
    builder.startVector(4, numElems, 4);
  }

  public static int endFeatureDefs(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) {
      __reset(_vector, _element_size, _bb);
      return this;
    }

    public FeatureDefs get(int j) {
      return get(new FeatureDefs(), j);
    }

    public FeatureDefs get(FeatureDefs obj, int j) {
      return obj.__assign(__indirect(__element(j), bb), bb);
    }
  }
}
