package com.example.kotlinbasics

import android.icu.lang.UCharacter.GraphemeClusterBreak.L
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.os.Bundle
import android.renderscript.BaseObj
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG: String = javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var personOne = person("Ratul")
        Log.d(TAG, "onCreate person one: name = ${personOne.name}")


    }
}

class person(name: String) {
    val name: String

    init {
        this.name = name
    }
}












