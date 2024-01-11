package com.example.kotlinbasics

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private val TAG: String = javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var personOne = person("Ratul")
        personOne.age = 19
        Log.d(TAG, "onCreate person one: name = ${personOne.name}, age = ${personOne.age}")

        var personTwo = person("Zoro", 19)
        personTwo.height = 45.0
        Log.d(
            TAG,
            "onCreate person two: name = ${personTwo.name}, age = ${personTwo.age}, height = ${personTwo.height}"
        )


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

    var gender: String = ""
    private var _height: Double = 0.0
    public var height: Double
        get() = _height
        set(value) {
            _height = value
        }


//    var gender: String = ""
//    public fun getGender(): String{
//        return gender
//    }
//    public fun setGender(gender: String){
//        this.gender = gender
//    }
}














