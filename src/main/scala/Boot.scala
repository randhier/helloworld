package helloworld

import com.fasterxml.jackson.jr.ob._
import world.World

object Boot {
  // In scala, an object can be thought of as a singleton object
  // or a class with static methods. By convention, the object
  // containing the main method is often called "Boot".

  // The file path src/resources/db/
  var databasePath = getClass.getResource("/db").getPath

  // See the DatabaseClient class
  var databaseClient = new DatabaseClient(databasePath)

  def main(args: Array[String]) = {

    // Just as in Java, the main method is the entry point of
    // the application. The args parameter is an array of strings
    // containing the command line arguments passed to the app.

    // Parse command line arguments
    var id = args( 0 ).toInt

    // Find the database record and transform it into an instance of our domain class
    var recordJSON = databaseClient.find(id)
    var parsedJSON = JSON.std.mapFrom(recordJSON)
    var world = new World(
      parsedJSON.get("key").asInstanceOf[Int],
      parsedJSON.get("value").asInstanceOf[String]
    )

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
      .get // Get a String out of the Option. If you're interested, see http://danielwestheide.com/blog/2012/12/19/the-neophytes-guide-to-scala-part-5-the-option-type.html
    var message = s"Hello, ${world.name}, $idAsOrdinal planet from the Sun!" // String interpolation in scala.

    println(message)
  }
}

class DatabaseClient(databasePath: String) {
  // Imagine that this database client has been provided by a 3rd party.
  // This very simple database looks up records in flat files and returns JSON.
  import scala.io.Source // Not the preferred io library in scala btw :)

  // find takes an Int and returns a JSON string
  def find(id: Int): String = {
    // Example: databaseClient.find(1)
    // Returns: { key: 1, value: Mercury }
    // Feel free to ignore implementation details here :)
    var path = databasePath + "/" + id.toString
    // Open the file with the file name in path.
    var source = Source.fromFile(path)
    // Read a string from the file.
    var string = try source.getLines.next finally source.close()

    s"""{"key": $id, "value": "$string"}"""
  }
}
