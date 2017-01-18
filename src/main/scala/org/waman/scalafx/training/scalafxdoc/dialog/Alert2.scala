package org.waman.scalafx.training.scalafxdoc.dialog

import org.waman.scalafx.training.scalafxdoc.HelloStageDemo.stage

import scalafx.Includes.when
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.control.Alert
import scalafx.scene.control.Alert.AlertType
import scalafx.scene.paint.Color.LightGreen
import scalafx.scene.shape.Rectangle

object Alert2 extends JFXApp{


  stage = new PrimaryStage{
    title.value = "Hello Stage"
    width = 400
    height = 300
    scene = new Scene {
      fill = LightGreen
      content = new Rectangle{
        x = 25
        y = 40
        width = 100
        height = 100
      }
    }
  }

  new Alert(AlertType.Information){
    initOwner(stage)
    title = "Information Dialog"
    headerText = "Look, an Information Dialog."
    contentText = "I have a great message for you!"
  }.showAndWait()
}
