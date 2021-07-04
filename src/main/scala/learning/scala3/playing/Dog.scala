package learning.scala3.playing

import learning.scala3.playing.{Animal, Running, Wagging}

class Dog extends Animal, Wagging, Running:
  def speak = println("Woof")
  def wag = println("Tail is wagging")

@main def useJavaInterfaceInScala =
  val d = new Dog
  d.speak
  d.wag
