package learning.scala3

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class MathUtilsSpec extends AnyWordSpec, Matchers:
  "Math Utils double" should {
    "return 2 times of given number" in {
      MathUtils.double(2) shouldBe 4
    }
  }

  "Math Utils sum" should {
    "return added value of the given numbers" in {
      MathUtils.sum(2, 3) shouldBe 5
    }
  }
end MathUtilsSpec
