package org.waman.scalafx.training.scalafxdoc.properties

import scalafx.beans.binding.Bindings
import scalafx.beans.property.StringProperty

object StringBinding extends App{

  val a = new StringProperty()
  val b = Bindings.createStringBinding(
    () => Option(a.value).getOrElse("").toLowerCase(),
    a
  )

  a.value = "Hello"
  println(s"Setting `a` to ${a.value}, `b` = ${b.value}")
}
