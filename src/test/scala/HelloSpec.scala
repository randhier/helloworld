package hello

import helloworld.UnitSpec
import database.client.DatabaseClient

class HelloSpec extends UnitSpec {

  private val hello = new Hello()

  behavior of "Hello Messages"
  it should "return hello message for Mercury" in {
    hello.getMessage(1, "Mercury") should be("Hello, Mercury, first planet from the Sun!")
  }

  it should "return hello message for Venus" in {
    hello.getMessage(2, "Venus") should be ("Hello, Venus, second planet from the Sun!")
  }

  it should "return hello message for Earth" in {
    hello.getMessage(3, "Earth") should be("Hello, Earth, third planet from the Sun!")
  }

  it should "return hello message for Mars" in {
    hello.getMessage(4, "Mars") should be("Hello, Mars, fourth planet from the Sun!")
  }

  it should "return hello message for Jupiter" in {
    hello.getMessage(5, "Jupiter") should be ("Hello, Jupiter, fifth planet from the Sun!")
  }

  it should "return hello message for Saturn" in {
    hello.getMessage(6, "Saturn") should be ("Hello, Saturn, sixth planet from the Sun!")
  }

  it should "return hello message for Uranus" in {
    hello.getMessage(7, "Uranus") should be("Hello, Uranus, seventh planet from the Sun!")
  }

  it should "Return hello message for Neptune" in {
     hello.getMessage(8, "Neptune") should be ("Hello, Neptune, eighth planet from the Sun!")
  }
}
