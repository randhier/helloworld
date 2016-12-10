package helloworld

import org.scalatest._
import org.scalamock.scalatest.MockFactory

abstract class UnitSpec extends FlatSpec with Matchers with BeforeAndAfter with MockFactory {
}