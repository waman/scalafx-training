name := "scalafx-training"

version := "0.1"

scalaVersion := "2.11.8"

//***** Custom settings *****
val javaVersion = settingKey[String]("javac source/target version")

val encoding = settingKey[String]("source encoding")

javaVersion := "1.8"

encoding := "UTF-8"

//***** Options & Dependencies *****
javacOptions ++= Seq(
  "-source", javaVersion.value,
  "-target", javaVersion.value,
  "-encoding", encoding.value
)

scalacOptions ++= Seq(
  "-Xlint",
  "-deprecation",
  "-unchecked",
  "-feature",
  "-encoding", encoding.value,
  "-Xexperimental"
)

libraryDependencies ++= Seq(
  "org.scalafx" % "scalafx_2.11" % "8.0.102-R11"
)

fork in Global := true

crossPaths := false

    