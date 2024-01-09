package com.example.kotlinbasics

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


enum class Answers {
    YES, NO, NOT_ANSWERED
}

enum class States {
    SUCCEEDED,
    FAILED
}

enum class Weekdays {
    SUN, MUN, TUE, WED, THU, FRI, SAT
}

class MainActivity : AppCompatActivity() {

    private val TAG: String = javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, giveAnswer(Answers.YES))
        Log.d(TAG, giveAnswer(Answers.NO))
        Log.d(TAG, giveAnswer(Answers.NOT_ANSWERED))

        if (cheakState(49) == States.FAILED) Log.d(TAG, "FAILED")
        if (cheakState(51) == States.SUCCEEDED) Log.d(TAG, "SUCCEEDED")

        for (day in Weekdays.values()) {
            Log.d(TAG, "${day.name} = ${day.ordinal}")
        }
    }

    fun giveAnswer(ans: Answers): String {
        return when (ans) {
            Answers.YES -> "Answered: yes"
            Answers.NO -> "Answered: no"
            Answers.NOT_ANSWERED -> "Not answered"

        }
    }

    fun cheakState(value: Int): States {
        return if (value <= 50) States.FAILED
        else States.SUCCEEDED

    }
}

















