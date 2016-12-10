package hello

import helloworld.UnitSpec
import database.client.DatabaseClient

class HelloSpec extends UnitSpec {

  class testDB extends DatabaseClient("TEST")
  private val db = mock[testDB]
  private val hello = new Hello(db)

  behavior of "Hello Messages"
  it should "return hello message for Mercury" in {
    db.find _ expects 1 returns """{"key": 1, "value": "Mercury"}"""
    hello.getMessage(1) should be("Hello, Mercury, first planet from the Sun!")
  }

  it should "return hello message for Venus" in {
    db.find _ expects 2 returns """{"key": 2, "value": "Venus"}"""
    hello.getMessage(2) should be ("Hello, Venus, second planet from the Sun!")
  }

  it should "return hello message for Earth" in {
    db.find _ expects 3 returns """{"key": 3, "value": "Earth"}"""
    hello.getMessage(3) should be("Hello, Earth, third planet from the Sun!")
  }

  it should "return hello message for Mars" in {
    db.find _ expects 4 returns """{"key": 4, "value": "Mars"}"""
    hello.getMessage(4) should be("Hello, Mars, fourth planet from the Sun!")
  }

  it should "return hello message for Jupiter" in {
    db.find _ expects 5 returns """{"key": 5, "value": "Jupiter"}"""
    hello.getMessage(5) should be ("Hello, Jupiter, fifth planet from the Sun!")
  }

  it should "return hello message for Saturn" in {
    db.find _ expects 6 returns """{"key": 6, "value": "Saturn"}"""
    hello.getMessage(6) should be ("Hello, Saturn, sixth planet from the Sun!")
  }

  it should "return hello message for Uranus" in {
    db.find _ expects 7 returns """{"key": 7, "value": "Uranus"}"""
    hello.getMessage(7) should be("Hello, Uranus, seventh planet from the Sun!")
  }

  it should "Return hello message for Neptune" in {
     db.find _ expects 8 returns """{"key": 8, "value": "Neptune"}"""
     hello.getMessage(8) should be ("Hello, Neptune, eighth planet from the Sun!")
  }
}
