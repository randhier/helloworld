package hello

class Hello() {

    def getMessage(id:Int, name:String): String = {

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
      ).get(id)
        .get
      // Get a String out of the Option. If you're interested, see http://danielwestheide.com/blog/2012/12/19/the-neophytes-guide-to-scala-part-5-the-option-type.html
      s"Hello, ${name}, $idAsOrdinal planet from the Sun!" // String interpolation in scala.
    }
}
