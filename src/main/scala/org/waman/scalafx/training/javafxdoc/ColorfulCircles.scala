package org.waman.scalafx.training.javafxdoc

import scala.util.Random
import scalafx.animation.{KeyFrame, KeyValue, Timeline}
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.effect.{BlendMode, BoxBlur}
import scalafx.scene.paint.{Color, CycleMethod, LinearGradient, Stop}
import scalafx.scene.shape._
import scalafx.scene._
import scalafx.util.Duration

object ColorfulCircles extends JFXApp{

  stage = new PrimaryStage{

    val thisRoot = new Group

    val thisScene = new Scene(thisRoot, 800, 600, Color.Black)
    scene = thisScene

    def randomWidth() : Double = Random.nextDouble * thisScene.width()
    def randomHeight(): Double = Random.nextDouble * thisScene.height()

    // background
    val colors = Rectangle(
      thisScene.width(),
      thisScene.height(),
      LinearGradient(0f, 1f, 1f, 0f, true, CycleMethod.NoCycle,
        Stop(0   , Color.web("#f8bd55")),
        Stop(0.14, Color.web("#c0fe56")),
        Stop(0.28, Color.web("#5dfbc1")),
        Stop(0.43, Color.web("#64c2f8")),
        Stop(0.57, Color.web("#be4af7")),
        Stop(0.71, Color.web("#ed5fc2")),
        Stop(0.85, Color.web("#ef504c")),
        Stop(1   , Color.web("#f2660f"))
      )
    )
    colors.width  <= thisScene.width
    colors.height <= thisScene.height

    // circles
    val circles = new Group
    circles.children = Seq.fill(30){
      new Circle{
        radius      = 150
        fill        = Color.web("white", 0.05)
        strokeType  = StrokeType.Outside
        stroke      = Color.web("white", 0.16)
        strokeWidth = 4
        effect      = new BoxBlur(10, 10, 3)
      }
    }

    // blend mode
    val blendModeGroup = new Group(
      new Group(
        Rectangle(thisScene.width(), thisScene.height(), Color.Black),
        circles),
      colors)
    colors.blendMode = BlendMode.Overlay
    thisRoot.children.add(blendModeGroup)

    // animation
    val timeline = new Timeline
    circles.children.forEach{ circle =>
      timeline.keyFrames.addAll(
        KeyFrame(
          Duration.Zero,
          values = Set(
            KeyValue(circle.translateXProperty, randomWidth()),
            KeyValue(circle.translateYProperty(), randomHeight())
          )
        ),

        KeyFrame(
          Duration(40000),
          values = Set(
            KeyValue(circle.translateXProperty, randomWidth()),
            KeyValue(circle.translateYProperty(), randomHeight())
          )
        )
      )
    }
    timeline.play()
  }
}
