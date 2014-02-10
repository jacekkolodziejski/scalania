name := "scalania"

organization := "pl.japila"

version in Global := "0.1.0-SNAPSHOT"

scalaVersion in Global := "2.11.0-M8"

scalacOptions ++= Seq( "-deprecation", "-unchecked", "-feature")

scalacOptions in Test ++= Seq("-Yrangepos")

libraryDependencies in Global += "org.specs2" %% "specs2" % "2.3.7" % "test"

resolvers in Global ++= Seq("snapshots", "releases") map Resolver.sonatypeRepo

lazy val scalania = project in file(".") aggregate exercises

lazy val exercises = project

lazy val answers = project dependsOn (exercises % "test->test")
