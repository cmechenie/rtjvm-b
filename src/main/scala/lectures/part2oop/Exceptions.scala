package lectures.part2oop

import sun.plugin2.message.Message

/**
  * Created by cristian on 14/09/2018
  */
object Exceptions extends App {

  val x: String = null
  // this will throw a NPE
  //println(x.length)

  // 1. throwing exceptions

  //val aWeirdValue = throw new NullPointerException

  // throwable classes extend the Throwable class
  // Exception and Error are the major Throwable subtypes

  // 2. how to catch exceptions
  def getInt(withExceptions: Boolean): Int = {
    if (withExceptions) throw new RuntimeException("No Int for you")
    else 42
  }

  val potentialFail = try {
    // code that might throw
    getInt(false)
  } catch {
    case e: RuntimeException => 43
  } finally {
    // code that is executed NO MATTER WHAT
    // optional
    // does not influence the return type of this expression
    // use only for side effects, e.g. printing to a log file
    println("finally")
  }

  println(potentialFail)

  // 3. how to define your own exceptions
  class MyException extends Exception
  val exception = new MyException
//  throw exception

  /*
    1. crash your program with an OutOfMemoryError
    2. crash with a StackOverflowError
    3. define a PocketCalculator
      - add(x, y)
      - substract(x, y)
      - multiply(x, y)
      - divide(x, y)

      Throw:
        - OverflowException if add(x, y) exceeds Int.MAX_VALUE
        - UnderflowException if substract(x, y) exceeds Int.MIN_VALUE
        - MathCalculationException for division by 0
   */

  // OOM
//  val array = Array.ofDim(Int.MaxValue)

  // SOE
//  def infinite: Int = 1 + infinite
//  val noLimit = infinite

  class OverflowException extends RuntimeException
  class UnderflowException extends RuntimeException
  class MathCalculationException extends RuntimeException("Division by 0")

  object PocketCalculator {

    def add(x: Int, y: Int): Int = {
      val result = x + y
      if (x > 0 && y > 0 && result < 0) throw new OverflowException
      else if ( x < 0 && y < 0 && result > 0) throw new UnderflowException
      else result
    }
    def substract(x: Int, y: Int): Int = {
      val result = x - y
      if (x > 0 && y < 0 && result < 0) throw new OverflowException
      else if ( x < 0 && y > 0 && result > 0) throw new UnderflowException
      else result
    }
    def multiply(x: Int, y: Int): Int = {
      val result = x * y
      if (x > 0 && y > 0 && result < 0) throw new OverflowException
      else if ( x < 0 && y < 0 && result > 0) throw new OverflowException
      else if ( x < 0 && y > 0 && result > 0) throw new UnderflowException
      else if ( x > 0 && y < 0 && result > 0) throw new UnderflowException
      else result
    }
    def divide(x: Int, y: Int): Int = {
      if (y == 0) throw new MathCalculationException
      else x / y
    }
  }

  println(PocketCalculator.add(22, 10))
  println(PocketCalculator.substract(Int.MinValue, 66))
  println(Int.MinValue)

}


