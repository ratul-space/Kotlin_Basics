package com.example.kotlinbasics

import android.annotation.SuppressLint
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.core.widgets.Rectangle
import com.google.android.gms.maps.model.Circle


class MainActivity : AppCompatActivity() {

    private val TAG: String = javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var shapeOne: Shape = Circle(0, 0)
        var shapetwo: Shape = Rectangle(100, 100)

        shapeOne.draw()
        shapetwo.draw()

    }
}

private fun Shape.draw() {


}

var DRAWTAG: String = "SampleDrawing"

abstract class shape(xPos: Int, yPos: Int) {

    var x: Int = xPos
    var y: Int = yPos

    abstract fun draw()
}

class Circle(xPos: Int, yPos: Int) : Shape() {
    override fun draw(canvas: Canvas?, paint: Paint?) {
        val xPos = 0
        val x: Int = xPos
        val yPos = 0
        var y: Int = yPos
        Log.d(DRAWTAG, "Drawing circle using circle drawing formula on position (${x}, ${y}).")

    }
}

class Rectangle(xPos: Int, yPos: Int) : Shape() {
    override fun draw(canvas: Canvas?, paint: Paint?) {
        val xPos = 0
        val x: Int = xPos
        val yPos = 0
        var y: Int = yPos


        Log.d(
            DRAWTAG,
            "Drawing rectangle using rectangle drawing formula on position (${x}, ${y})."
        )
    }

}

















