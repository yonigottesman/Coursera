package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 2))

  def set1 = union(union(singletonSet(1),singletonSet(2)),union(singletonSet(4),singletonSet(3)))
  def set2 = union(union(singletonSet(1),singletonSet(2)),union(singletonSet(5),singletonSet(6)))

  println(contains(union(set1,set2) , 1))
  println(contains(union(set1,set2) , 2))
  println(contains(union(set1,set2) , 3))
  println(contains(union(set1,set2) , 4))
  println(contains(union(set1,set2) , 5))
  println(contains(union(set1,set2) , 6))
  println(contains(union(set1,set2) , 7))


  println(contains(intersect(set1,set2) , 1))



}
