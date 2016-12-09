package world

import helloworld.UnitSpec

class WorldSpec extends UnitSpec {
  behavior of "World"
  it should "Return Mercury and id 1" in {
    def world = new World(1, "Mercury")
    world.name should be ("Mercury")
    world.id should be (1)
  }

  it should "Return Venus and id 2" in {
    def world = new World(2, "Venus")
    world.name should be("Venus")
    world.id should be (2)
  }
}

