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

        var personTwo = person("Zoro", 19)
        Log.d(TAG, "onCreate person two: name = ${personTwo.name}, age = ${personTwo.age}")


    }
}

class person(name: String) {
    var name: String
    var age: Int = 0

    init {
        this.name = name
    }

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

}












