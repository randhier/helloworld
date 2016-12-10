package helloworld

import java.io.ByteArrayOutputStream


import org.scalatest._
import org.scalamock.scalatest.MockFactory

// FlatSpec docs: http://doc.scalatest.org/1.8/org/scalatest/FlatSpec.html
// Matchers docs: http://www.scalatest.org/user_guide/using_matchers

// Could not find a way to do an end-to-end test by starting up the app then sending commands.
// This was the closest I was able to get
class BootEndToEndSpec extends FlatSpec with Matchers with BeforeAndAfter with MockFactory {

  private val stream = new ByteArrayOutputStream()

  after {
    stream.reset()
  }

  behavior of "Boot integration"
  it should "say hello to Mercury" in {
    Console.withOut(stream) {
      Boot.main(Array("1"))
    }
    val output = stream.toString()
    output should be("Hello, Mercury, first planet from the Sun!\n")
  }

  it should "say hello to Venus" in {
    Console.withOut(stream) {
      Boot.main(Array("2"))
    }
    val output = stream.toString()
    output should be("Hello, Venus, second planet from the Sun!\n")
  }

  it should "say hello to Earth" in {
    Console.withOut(stream) {
      Boot.main(Array("3"))
    }
    val output = stream.toString()
    output should be("Hello, Earth, third planet from the Sun!\n")
  }

  it should "say hello to Mars" in {
    Console.withOut(stream) {
      Boot.main(Array("4"))
    }
    val output = stream.toString()
    output should be("Hello, Mars, fourth planet from the Sun!\n")
  }

  it should "say hello to Jupiter" in {
    Console.withOut(stream) {
      Boot.main(Array("5"))
    }
    val output = stream.toString()
    output should be("Hello, Jupiter, fifth planet from the Sun!\n")
  }

  it should "say hello to Saturn" in {
    Console.withOut(stream) {
      Boot.main(Array("6"))
    }
    val output = stream.toString()
    output should be("Hello, Saturn, sixth planet from the Sun!\n")
  }

  it should "say hello to Uranus" in {
    Console.withOut(stream) {
      Boot.main(Array("7"))
    }
    val output = stream.toString()
    output should be("Hello, Uranus, seventh planet from the Sun!\n")
  }

  it should "say hello to Neptune" in {
    Console.withOut(stream) {
      Boot.main(Array("8"))
    }
    val output = stream.toString()
    output should be("Hello, Neptune, eighth planet from the Sun!\n")
  }
}

