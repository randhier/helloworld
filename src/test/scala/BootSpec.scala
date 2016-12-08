package helloworld

import org.scalatest.{ FlatSpec, Matchers }

// FlatSpec docs: http://doc.scalatest.org/1.8/org/scalatest/FlatSpec.html
// Matchers docs: http://www.scalatest.org/user_guide/using_matchers

// As you extract classes or methods out of Boot, add unit tests for them using
// this as a template.
class BootSpec extends FlatSpec with Matchers {
  behavior of "Boot"
  it should "do what?" in {
    // TODO
    true shouldBe true
  }
}
