package lectures.part2oop

/**
  * Created by cristian on 10/09/2018
  */
object AbstractDataTypes extends App {

  // abstract
  abstract class Animal {
    val creatureType: String = "Wild"
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "K9"

    override def eat: Unit = println("crunch crunch")
  }

  // traits
  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal: String = "fresh meat"
  }

  trait ColdBlooded
  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "croc"
    def eat: Unit = println("nomnomnom")
    def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  // trait vs. abstract classes
  // 1 - traits cannot have constructor parameters
  // 2 - multiple traits can be inherited by the same class
  // 3 - traits = behaviour, abstract class = "thing"
}
