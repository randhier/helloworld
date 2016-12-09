package helloworld

//import org.scalatest.{ FlatSpec, Matchers }

// FlatSpec docs: http://doc.scalatest.org/1.8/org/scalatest/FlatSpec.html
// Matchers docs: http://www.scalatest.org/user_guide/using_matchers

// This is more of a component test since I can't seem to find a way to unit test scala
// objects
class BootSpec extends UnitSpec {
  behavior of "Boot"
  it should "Say hello to Mercury" in {
    val stream = new java.io.ByteArrayOutputStream()
    Console.withOut(stream) {
      Boot.main(Array("1"))
    }
    val output = stream.toString()
    output should be("Hello, Mercury, first planet from the Sun!\n")
  }

  it should "Say hello to Venus" in {
    val stream = new java.io.ByteArrayOutputStream()
    Console.withOut(stream) {
      Boot.main(Array("2"))
    }
    val output = stream.toString()
    output should be("Hello, Venus, second planet from the Sun!\n")
  }
}
