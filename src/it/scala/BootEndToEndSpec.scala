package helloworld

import org.scalatest.{ FlatSpec, Matchers }

// FlatSpec docs: http://doc.scalatest.org/1.8/org/scalatest/FlatSpec.html
// Matchers docs: http://www.scalatest.org/user_guide/using_matchers

class BootEndToEndSpec extends FlatSpec with Matchers {
  behavior of "Boot"
  it should "do what?" in {
    // TODO
    true shouldBe true
  }
}

