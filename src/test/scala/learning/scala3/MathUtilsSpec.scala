package learning.scala3

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class MathUtilsSpec extends AnyWordSpec with Matchers {
  "Math Utils double" should {
    "return 2 times of given number" in {
      MathUtils.double(2) shouldBe 4
    }
  }
}
