package learning.scala3

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

import scala.jdk.OptionConverters.*
import scala.jdk.CollectionConverters.*

class JavaCollectionsInScala extends AnyWordSpec, Matchers:

  "JavaCollections in Scala" should {
    "convert" in {
      JavaClass.getStrings.asScala.toList shouldBe List("a", "b", "c")
    }
  }

  "JavaOption in Scala" should {
    "convert" in {
      JavaClass.oString.toScala shouldBe Some("foo")
      JavaClass.oEmptyString.toScala shouldBe None
    }
  }

end JavaCollectionsInScala
