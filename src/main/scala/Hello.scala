package hello

import com.fasterxml.jackson.jr.ob._
import world.World
import database.client.DatabaseClient


class Hello(db: DatabaseClient) {
    // In scala, an object can be thought of as a singleton object
    // or a class with static methods. By convention, the object
    // containing the main method is often called "Boot".

    def getMessage(id:Int): String = {
      // Find the database record and transform it into an instance of our domain class
      var recordJSON = db.find(id)
      var parsedJSON = JSON.std.mapFrom(recordJSON)
      var world = new World(
        parsedJSON.get("key").asInstanceOf[Int],
        parsedJSON.get("value").asInstanceOf[String])

      // Build the message to print
      var idAsOrdinal = Map(
        1 -> "first",
        2 -> "second",
        3 -> "third",
        4 -> "fourth",
        5 -> "fifth",
        6 -> "sixth",
        7 -> "seventh",
        8 -> "eighth"
      ).get(world.id)
        .get
      // Get a String out of the Option. If you're interested, see http://danielwestheide.com/blog/2012/12/19/the-neophytes-guide-to-scala-part-5-the-option-type.html
      s"Hello, ${world.name}, $idAsOrdinal planet from the Sun!" // String interpolation in scala.
    }
}
