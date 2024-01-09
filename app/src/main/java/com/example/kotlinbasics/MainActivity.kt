package com.example.kotlinbasics

import android.annotation.SuppressLint
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.drawable.shapes.Shape
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.core.widgets.Rectangle
import com.google.android.gms.maps.model.Circle

enum class Answers {
    YES, NO, NOT_ANSWERED
}

class MainActivity : AppCompatActivity() {

    private val TAG: String = javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, giveAnswer(Answers.YES))
        Log.d(TAG, giveAnswer(Answers.NO))
        Log.d(TAG, giveAnswer(Answers.NOT_ANSWERED))
    }


    fun giveAnswer(ans: Answers): String {
        when (ans) {
            Answers.YES -> return "Answered: yes"
            Answers.NO -> return "Answered: no"
            Answers.NOT_ANSWERED -> return "Not answered"


        }
    }
}
















