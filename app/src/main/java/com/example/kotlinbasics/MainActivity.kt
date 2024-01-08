package com.example.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // myObject's super class is 'Any'
        val myObject = object {
            var firstName = "Ratul"
            fun myFullName() = "Ratul Hossain"
        }

        Log.d(TAG, "check firstName: ${myObject.firstName}")
        Log.d(TAG, "check fullName: ${myObject.myFullName()}")
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}