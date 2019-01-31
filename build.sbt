version in ThisBuild := "0.1.0-SNAPSHOT"

organization in ThisBuild := "de.surfice"

lazy val commonSettings = Seq(
  scalacOptions ++= Seq("-deprecation","-unchecked","-feature","-Xlint"),
  resolvers += Resolver.sonatypeRepo("snapshots"),
  libraryDependencies ++= Seq(
    "com.lihaoyi" %%% "utest" % "0.6.6" % "test"
  ),
  scalacOptions ++= (if (isSnapshot.value) Seq.empty else Seq({
        val a = baseDirectory.value.toURI.toString.replaceFirst("[^/]+/?$", "")
        val g = "https://raw.githubusercontent.com/surprof/scalajs-rxjs"
        s"-P:scalajs:mapSourceURI:$a->$g/v${version.value}/"
      }))
)

lazy val crossSettings = Seq(
  scalaVersion := "2.12.8",
  crossScalaVersions := Seq("2.12.8")
)

lazy val rxjs = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(commonSettings: _*)
  .settings(crossSettings:_*)
  .settings(publishingSettings: _*)
  .settings( 
    name := "scalajs-rxjs",
    libraryDependencies ++= Seq(
    ),
    testFrameworks += new TestFramework("utest.runner.Framework"),
    resolvers += Resolver.sonatypeRepo("releases")
  )


lazy val publishingSettings = Seq(
  publishMavenStyle := true,
  publishTo := {
    val nexus = "https://oss.sonatype.org/"
    if (isSnapshot.value)
      Some("snapshots" at nexus + "content/repositories/snapshots")
    else
      Some("releases"  at nexus + "service/local/staging/deploy/maven2")
  },
  pomExtra := (
    <url>https://github.com/surprof/scalajs-rxjs</url>
    <licenses>
      <license>
        <name>MIT License</name>
        <url>http://www.opensource.org/licenses/mit-license.php</url>
      </license>
    </licenses>
    <scm>
      <url>git@github.com:surprof/scalajs-rxjs</url>
      <connection>scm:git:git@github.com:surprof/scalajs-rxjs.git</connection>
    </scm>
    <developers>
      <developer>
        <id>surprof</id>
        <name>Gabor Suranyi</name>
        <email>45617562+surprof@users.noreply.github.com</email>
      </developer>
    </developers>
  )
)
 
