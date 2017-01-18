package org.waman.scalafx.training.scalafxdoc.properties

import scalafx.beans.property.DoubleProperty

object BindingExpressions extends App{

  val base   = DoubleProperty(15)
  val height = DoubleProperty(10)
  val area   = DoubleProperty(0)

  area <== base * height /2

  printValues()

  println("Setting base to "+ 20)
  base() = 20

  printValues()

  println("Setting height to " + 5)
  height() = 5

  printValues()

  def printValues(): Unit = {
    println(s"base = ${base.value}, height = ${height.value}, area = ${area.value}")
    println()
  }
}
