ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "PP_Lista10"
  )
lazy val scalaReflect = Def.setting { "org.scala-lang" % "scala-reflect" % "2.10.0" }