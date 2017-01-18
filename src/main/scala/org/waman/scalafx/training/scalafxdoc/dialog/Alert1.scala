package org.waman.scalafx.training.scalafxdoc.dialog

import scalafx.application.JFXApp
import scalafx.scene.control.Alert
import scalafx.scene.control.Alert.AlertType

object Alert1 extends JFXApp{

  new Alert(AlertType.Information, "Hello Dialogs!!!").showAndWait()
}
