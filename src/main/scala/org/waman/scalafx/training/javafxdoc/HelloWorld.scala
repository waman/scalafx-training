package org.waman.scalafx.training.javafxdoc

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.control.Button
import scalafx.scene.layout.StackPane


object HelloWorld extends JFXApp{

  stage = new PrimaryStage{
    title = "Hello World"
    width = 300
    height = 250
    scene = new Scene{
      content = new StackPane{
        children = Seq(
          new Button{
            text = "Say 'Hello World'"
            onAction = { e => println("Hello World!") }
          }
        )
      }
    }
  }
}
