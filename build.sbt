name := "Unit_Integration_Assignment"

version := "0.1"

scalaVersion := "2.13.4"

lazy val Question1andQuestion2 = project.in(file("Question1andQuestion2"))
  .settings(libraryDependencies += "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test)

lazy val Question3 = project.in(file("Question3"))
  .settings(libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test, "org.mockito" %% "mockito-scala" % "1.16.15" % Test))

