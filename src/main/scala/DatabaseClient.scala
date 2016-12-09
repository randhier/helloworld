package database.client

class DatabaseClient(databasePath: String) {
  // Imagine that this database client has been provided by a 3rd party.
  // This very simple database looks up records in flat files and returns JSON.
  import scala.io.Source
  // Not the preferred io library in scala btw :)

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