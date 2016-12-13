package world

import helloworld.UnitSpec

class WorldSpec extends UnitSpec {
  behavior of "World domain"
  it should "return Mercury and id 1" in {
    val world = new World(1, "Mercury")
    world.name should be("Mercury")
    world.id should be(1)
  }
}

