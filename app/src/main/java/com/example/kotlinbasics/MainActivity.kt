package com.example.kotlinbasics

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnOne = findViewById<Button>(R.id.button_sent)
        var onClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(
                    applicationContext,
                    "hi from add button, welcome to kotlin world",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
        btnOne.setOnClickListener(onClickListener)

    }
}

// myObject's super class is 'Any'
/*val myObject = object {
    var firstName = "Ratul"
    fun myFullName() = "Ratul Hossain"
}

Log.d(TAG, "check firstName: ${myObject.firstName}")
Log.d(TAG, "check fullName: ${myObject.myFullName()}")*/

//        val widgetOne = Widget("Widget 1")
//
//        var widgetClickable = object : Widget("Widget 3"), Clickable {
//            override fun onClick() {
//                TODO("Not yet implemented")
//            }
//        }
//
//
//    }
//
//    companion object {
//        private const val TAG = "MainActivity"
//    }
//}
//
//open class Widget(text: String) {
//    private var myText = text
//}
//
//interface Clickable {
//    fun onClick()
//}
//
//class ClickableWidget : Widget("Widget 2"), Clickable {
//    override fun onClick() {
//        TODO("Not yet implemented")
