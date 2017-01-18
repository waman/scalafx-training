package org.waman.scalafx.training.javafxdoc

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.geometry._
import scalafx.scene.Scene
import scalafx.scene.control._
import scalafx.scene.layout.GridPane
import scalafx.scene.paint.Color
import scalafx.scene.text._

object LoginForm extends JFXApp{

  stage = new PrimaryStage{
    title = "ScalaFX Welcome"
    scene = new Scene{
      stylesheets.add(LoginForm.getClass.getResource("Login.css").toExternalForm)
      content = new GridPane{
        alignment = Pos.Center
        hgap = 10
        vgap = 10
        padding = Insets(25)

        add(
          new Text{
            id = "welcome-text"
            text = "Welcome"
          }, 0, 0, 2, 1)

        add(new Label("User Name:"), 0, 1)
        add(new TextField(), 1, 1)

        add(new Label("Password:"), 0, 2)
        add(new PasswordField(), 1, 2)

        val actionTarget = new Text{ id = "action-target" }
        add(new Button{
          text = "Sign in"
          alignment = Pos.BottomRight
          onAction = { e =>
            actionTarget.fill = Color.FireBrick
            actionTarget.text = "Sign in button pressed"
          }
        }, 1, 4)
        add(actionTarget, 1, 6)
      }
    }
  }
}
