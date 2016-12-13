package helloworld

import com.fasterxml.jackson.jr.ob.JSON
import database.client.DatabaseClient
import hello.Hello
import world.World

object Boot {
  // In scala, an object can be thought of as a singleton object
  // or a class with static methods. By convention, the object
  // containing the main method is often called "Boot".

  def main(args: Array[String]) = {

    // Just as in Java, the main method is the entry point of
    // the application. The args parameter is an array of strings
    // containing the command line arguments passed to the app.

    // The file path src/resources/db/
    var databasePath = getClass.getResource("/db").getPath

    // See the DatabaseClient class
    var databaseClient = new DatabaseClient(databasePath)

    // Parse command line arguments
    var inputID = args( 0 ).toInt

    // Get Json from DB for ID and parse to fit World class format
    var recordJSON = databaseClient.find(inputID)
    var (id, planet) = parseDBPlanet(recordJSON)
    // New World class
    var world = new World(id, planet)

    // Hello class to get message
    var hello = new Hello()
    var message = hello.getMessage(world.id, world.name)

    println(message)
  }

  // Wanted this to be a part of the World class or a class on it's own
  // that World called but I think it works best as a function of boot for now.
  def parseDBPlanet(json: String) : (Int, String) = {
    var parsedJSON = JSON.std.mapFrom(json)
    (parsedJSON.get("key").asInstanceOf[Int], parsedJSON.get("value").asInstanceOf[String])
  }
}

