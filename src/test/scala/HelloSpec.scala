package hello

import helloworld.UnitSpec
import database.client.DatabaseClient

class HelloSpec extends UnitSpec {
  behavior of "Hello Message"
  it should "return message for Mercury" in {
    def hello = new Hello(1)
    hello.message should be ("Hello, Mercury, first planet from the Sun!")
  }

//  behavior of "Hello Message function"
//  it should "return message for Mercury" in {
//    val hello = mock[DatabaseClient]
//    (hello.find _).expects(1).returns("")
//  }


}
