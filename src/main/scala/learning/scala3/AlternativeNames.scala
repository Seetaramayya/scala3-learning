package learning.scala3

import scala.annotation.targetName

object AlternativeNames:
  @targetName("add") def +(a: Int, b: Int) = a + b
