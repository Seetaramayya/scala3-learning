package learning.scala3.playing

object ScalaObject:
  val someString = Option("foo")
  val noneString: Option[String] = None

object SecondObject:
  def someMethod: String = "something"

class SomeClass:
  val someValue = "somevalue"

//TODO: How to pass command line arguments?
@main def seeta(age: Int, firstName: String, lastName: String, otherDetails: String*): Unit =
  val otherDetailsString = if (otherDetails.isEmpty) "." else s", ${otherDetails.mkString(" ")}."
  println(s"$firstName $lastName's age is $age$otherDetailsString")
  println(SecondObject.someMethod)
  println(ScalaObject.someString)
  println(ScalaObject.noneString)
  println(new SomeClass().someValue)
