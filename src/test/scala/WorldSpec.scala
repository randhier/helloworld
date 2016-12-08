package world

import org.scalatest.{ FlatSpec, Matchers }

class WorldSpec extends FlatSpec with Matchers {
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

