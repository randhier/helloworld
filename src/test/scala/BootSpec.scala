package helloworld

import java.io.ByteArrayOutputStream

// FlatSpec docs: http://doc.scalatest.org/1.8/org/scalatest/FlatSpec.html
// Matchers docs: http://www.scalatest.org/user_guide/using_matchers

// This is more of a component test since I can't seem to find a way to unit test scala
// objects
class BootSpec extends UnitSpec {

  private val stream = new ByteArrayOutputStream()

  after {
    stream.reset()
  }

  behavior of "Boot"
  it should "Say hello to Mercury" in {
    Console.withOut(stream) {
      Boot.main(Array("1"))
    }
    val output = stream.toString()
    output should be("Hello, Mercury, first planet from the Sun!\n")
  }

  it should "Say hello to Venus" in {
    Console.withOut(stream) {
      Boot.main(Array("2"))
    }
    val output = stream.toString()
    output should be("Hello, Venus, second planet from the Sun!\n")
  }

  it should "Say hello to Earth" in {
    Console.withOut(stream) {
      Boot.main(Array("3"))
    }
    val output = stream.toString()
    output should be("Hello, Earth, third planet from the Sun!\n")
  }
}
