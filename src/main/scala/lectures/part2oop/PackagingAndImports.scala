package lectures.part2oop

import java.sql

import playground.{PrinceCharming, Cinderella => Princess}
import java.util.Date
import java.sql.{Date => SQLDate}

/**
  * Created by cristian on 15/09/2018
  */
object PackagingAndImports extends App {

  // package members are accessible by their simple name
  val writer = new Writer("Cristian", "RockTheJVM", 2018)

  // import the package
  val princess = new Princess

  // packages are hierarchy
  // matches the folder structure

  // package object
  sayHello
  println(SPEED_OF_LIGHT)

  //imports
  val prince = new PrinceCharming

  val d = new Date
  val sqlDate = new SQLDate(2018, 5, 1)

  // default imports
  // java.lang - String Object, Exception, etc.
  // scala - Int, Nothing, Function, etc.
  // scala.Predef - println, ???, etc.

}
