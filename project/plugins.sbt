addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.9.3")

addSbtPlugin("com.eed3si9n" % "sbt-projectmatrix" % "0.11.0")

// Code quality
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.4.2")

addSbtPlugin("ch.epfl.scala" % "sbt-missinglink" % "0.3.6")

addSbtPlugin("com.github.cb372" % "sbt-explicit-dependencies" % "0.3.1")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.4")

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.14.2")

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.13.1")

addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.10.0")

// Compiled documentation
addSbtPlugin("org.scalameta" % "sbt-mdoc" % "2.7.1")

// Scala.js and Scala Native
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.19.0")

addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.5.7")
