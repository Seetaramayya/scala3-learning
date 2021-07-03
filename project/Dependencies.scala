import sbt._
object Dependencies {
  // https://github.com/scalatest/scalatest
  private val ScalaTest = "org.scalatest" %% "scalatest" % "3.2.9" % Test

  val all = Seq(
    ScalaTest
  )
}
