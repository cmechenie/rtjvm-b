package lectures.part1basics

/**
  * Created by cristian on 08/09/2018
  */
object DefaultArgs extends App {

  def trFact(n: Int, acc: Int = 1): Int = {
    if (n <= 1) acc
    else trFact(n - 1, n * acc)
  }
  println(trFact(10))

}
