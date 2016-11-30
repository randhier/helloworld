// Ignore this build file if you like.
import sbt._
import Keys._

object HelloWorldBuild extends Build {

  lazy val dependencies = Seq(
    "org.scalatest" % "scalatest_2.11" % "2.2.6" % "test,it",
    "org.mockito" % "mockito-core" % "1.10.19",
    "com.fasterxml.jackson.jr" % "jackson-jr-objects" % "2.7.4"
  )

  lazy val projectSettings = Seq(
    name := "Hello, World!",
    scalaVersion in ThisBuild := "2.11.5",
    libraryDependencies ++= dependencies
  )

  lazy val root = Project("root", file("."))
    .configs(IntegrationTest)
    .settings(Defaults.itSettings : _*)
    .settings(projectSettings)

}
