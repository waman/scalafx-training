package org.waman.scalafx.training.scalafxdoc.dialog

import scalafx.application.JFXApp
import scalafx.scene.control.{Alert, ButtonType}
import scalafx.scene.control.Alert.AlertType

object Alert3 extends JFXApp{

  val alert = new Alert(AlertType.Confirmation){
    title = "Confirmation Dialog"
    headerText = "Look, a Confirmation Dialog."
    contentText = "Are you ok with this?"
  }

  val result = alert.showAndWait()

  result match {
    case Some(ButtonType.OK) => println("OK")
    case _                   => println("Cancel or closed")
  }
}
