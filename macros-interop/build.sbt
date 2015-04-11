import sbt.Keys._

name := "macros-interop"

scalacOptions ++= Seq("-Ymacro-debug-lite")

val scalaVer = "2.11.6"

lazy val commonSettings = Seq(
  organization := "com.practicingtechie",
  version := "0.1",
  scalaVersion := scalaVer
)

lazy val mymacros = project.
  settings(commonSettings: _*).
  settings(libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVer)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  dependsOn(mymacros)

libraryDependencies ++= Seq(
  "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2",
  //"com.typesafe.scala-logging" %% "scala-logging" % "3.1.0",
  "ch.qos.logback" % "logback-classic" % "1.1.3"
)