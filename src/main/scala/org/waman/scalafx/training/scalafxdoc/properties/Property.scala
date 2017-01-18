package org.waman.scalafx.training.scalafxdoc.properties

import scalafx.beans.property.DoubleProperty

object Property extends App{

  val speed = new DoubleProperty(this, "speed", 55){
    onChange{(_, oldValue, newValue) =>
      println(
        s"Value of property '$name' is changing from $oldValue to $newValue")
    }
  }

  speed() = 60
  speed()= 75
  speed.value = 25
}
