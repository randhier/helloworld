package helloworld

import org.scalatest.{ FlatSpec, Matchers }

// FlatSpec docs: http://doc.scalatest.org/1.8/org/scalatest/FlatSpec.html
// Matchers docs: http://www.scalatest.org/user_guide/using_matchers

// As you extract classes or methods out of Boot, add unit tests for them using
// this as a template.
class BootSpec extends FlatSpec with Matchers {
  behavior of "World"
  it should "Return Mercury" in {
    def world = new World(1, "Mercury")
    val name = world.name
    name should be ("Mercury")
  }

  it should "Return Venus" in {
    def world = new World(1, "Venus")
    val name = world.name
    name should be("Venus")
  }
}

