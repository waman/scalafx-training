package org.waman.scalafx.training.scalafxdoc

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.shape.Rectangle
import scalafx.scene.paint.Color._
import scalafx.Includes._

object HelloStageDemo extends JFXApp{

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
        fill <== when (hover) choose Green otherwise Red
      }
    }
  }
}
