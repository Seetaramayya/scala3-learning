package learning.scala3

import scala.annotation.varargs

object Varargs:
  @varargs def printAll(args: String*): Unit = println(args.map(_.toLowerCase).mkString("[ ", " ", " ]"))
