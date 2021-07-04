package learning.scala3.playing

import learning.scala3.playing.JavaClass
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

import scala.jdk.OptionConverters.RichOptional
import scala.jdk.CollectionConverters._

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
