object Test{
  def main(args : Array[String]): Unit = {
    import scala.collection.immutable.*
    assert(IntMap.empty == HashMap.empty);
    assert(HashMap.empty == IntMap.empty);
    assert(LongMap.empty == HashMap.empty);
    assert(HashMap.empty == LongMap.empty);
    assert(IntMap.empty == LongMap.empty);
    assert(IntMap(1 -> 2) == HashMap(1 -> 2));
    assert(LongMap(1L -> 2) == HashMap(1L -> 2));
  }
}
