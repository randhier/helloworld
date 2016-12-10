package world

import helloworld.UnitSpec

class WorldSpec extends UnitSpec {
  behavior of "World domain"
  it should "return Mercury and id 1" in {
    val world = new World(1, "Mercury")
    world.name should be ("Mercury")
    world.id should be (1)
  }

  it should "return Venus and id 2" in {
    val world = new World(2, "Venus")
    world.name should be("Venus")
    world.id should be (2)
  }

  it should "return Earth and id 3" in {
    val world = new World(2, "Venus")
    world.name should be("Venus")
    world.id should be (2)
  }

  it should "return Mars and id 4" in {
    val world = new World(2, "Venus")
    world.name should be("Venus")
    world.id should be (2)
  }

  it should "return Neptune and id 9" in {
    val world = new World(5, "Neptune")
    world.name should be("Neptune")
    world.id should be (5)
  }
}

