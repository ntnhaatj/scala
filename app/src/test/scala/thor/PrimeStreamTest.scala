package thor

import org.junit.runner.RunWith
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PrimeStreamTest extends AnyFlatSpec with Matchers {
  behavior of "PrimeStream"

  it can "generate specified length list" in {
    val DUMMY_LENGTH = 10
    val dummyList    = PrimeStream.generatePrimesFrom(100).take(DUMMY_LENGTH)
    dummyList should have length DUMMY_LENGTH
    println(dummyList)
  }
}
