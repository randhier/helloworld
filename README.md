# Hello, World!

"Hello, World!" is a command-line application that takes an integer id as
an argument. That id number corresponds to a planet in the solar system.
The application then returns a message saying hello to that world :)

This very simple, very much contrived application needs to be
modularized, with tests added for those modules
(after all, it will grow bigger and more complex as we add features).

For example:

* We might like to send new messages to a given world.
* We might like to use a more robust database solution
while still using our primary domain type (`World`) and without
rewriting the entire application.
* We might like to provide a different
interface to the application, running as a service and responding to
messages via HTTP instead of terminal input.

How can we test each bit of existing functionality in this small system
in isolation, while laying the groundwork for future extensions?

## Coding challenge

This application is written in Scala, but don't worry about writing
idiomatic Scala to complete this exercise.

Please spend some time on the following:

1. What unit, integration, and end-to-end tests would you like to see
   written for this application? Please add unit tests under
   `src/test/scala` and integration or end-to-end tests under
   `src/it/scala`.
2. In what ways should this application change to make it more easily
   testable? Please make changes directly to the code (IE if you have
   spotted a missing unit test, you may need to actually extract a class
   to create a unit to test.)

We are primarily interested in your ability to think about and
express test coverage and in your ability to suggest ways to
modularize a system to make it more easily testable (and extensible).

Thus, if you feel the need to use a technology other than Scala,
feel free to re-implement the project in
Java, Ruby, Python, or JavaScript if you are more comfortable working in those
languages.

## Running the app

To run the application, first [install scala and sbt](http://www.scala-lang.org/download/). Now navigate to the directory where you cloned the project and open sbt:

```
cd ~/Projects/helloworld
sbt
```

Now run the application from the sbt console (where 3 is the id for
Earth):

```
> run 3
[info] Running helloworld.Boot 3
"Hello, Earth, third planet from the Sun!"
[success] Total time: 1 s, completed Nov 16, 2016 2:04:01 PM
>
```

You can enter an interactive REPL from the sbt prompt by typing
`console`. (Press ctrl + D to exit the REPL.)

## Running Tests
From the sbt prompt, run `test` to run unit tests, or `it:test` to run
integration tests.

Please note that `sbt` can seem frustrating if you are accustomed to
conventional build tools, so in the interest of time you may want to
resist the desire to add new build tasks.

