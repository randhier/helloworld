package helloworld

import hello.Hello

object Boot {
  // In scala, an object can be thought of as a singleton object
  // or a class with static methods. By convention, the object
  // containing the main method is often called "Boot".

  def main(args: Array[String]) = {

    // Just as in Java, the main method is the entry point of
    // the application. The args parameter is an array of strings
    // containing the command line arguments passed to the app.

    // Parse command line arguments
    var id = args( 0 ).toInt

    // Hello class to get message
    var hello = new Hello(id)
    var message = hello.message

    println(message)
  }
}

