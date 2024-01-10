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

    fun tellYourName() {
        Log.d(javaClass.simpleName, "My name is $name")
    }

    fun sayHi() {
        Log.d("Base", "hi from base")
    }
}

class Derived : Base() {
    val id = 100
    override val name: String = "Derived"
}

class DerivedTwo : Base() {
    override val name: String = "Derived two"

}















