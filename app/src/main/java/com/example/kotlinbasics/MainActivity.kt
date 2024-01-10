package com.example.kotlinbasics

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG: String = javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var base: Base = Base()
        base.sayHi()
        Log.d(TAG, "onCreate base.name = ${base.name}")

        var derived: Derived = Derived()
        derived.sayHi()
        Log.d(TAG, "onCreate derived.name = ${derived.name}")
        derived.tellYourName()

        var derivedTwo: DerivedTwo = DerivedTwo()
        Log.d(TAG, "onCreate: derivedTwo.name = ${derivedTwo.name}")
        derivedTwo.tellYourName()

    }
}


open class Base {
    open val name: String = "Base"
    fun sayHi() {
        Log.d("Base", "hi from base")
    }
}

class Derived : Base() {
    val id = 100
    fun tellYourName() {
        Log.d("Derived", "My name is $name")
    }
}

class DerivedTwo : Base() {
    override val name: String = "Derived two"
    fun tellYourName() {
        Log.d("DerivedTwo", "My name is $name")
    }
}















