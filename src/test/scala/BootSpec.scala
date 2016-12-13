package helloworld

class BootSpec extends UnitSpec{

  behavior of "Boot methods"

  behavior of "Boot parseDBPlanet"
  it should "parse DB output" in {
    Boot.parseDBPlanet("""{"key": 1, "value": "Mercury"}""") should be((1, "Mercury"))
  }
}
