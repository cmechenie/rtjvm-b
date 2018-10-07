package lectures.part1basics

/**
  * Created by cristian on 08/09/2018
  */
object CBMvsCBV extends App {

  def calledByValue(n: Long): Unit = {
    println("by value: " + n)
    println("by value :" + n)
  }

  def calledByName(n: => Long): Unit = {
    println("by name: " + n)
    println("by name :" + n)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite(): Int = infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  printFirst(34, infinite())
}
