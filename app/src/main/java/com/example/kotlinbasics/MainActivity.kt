package com.example.kotlinbasics

import android.icu.lang.UCharacter.GraphemeClusterBreak.L
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
        derivedTwo.sayHi()
        Log.d(TAG, "onCreate: derivedTwo.name = ${derivedTwo.name}")
        derivedTwo.tellYourName()

    }
}


open class Base {
    open val name: String = "Base"

    fun tellYourName() {
        Log.d(javaClass.simpleName, "My name is $name")
    }

    open fun sayHi() {
        Log.d("Base", "hi from base")
    }
}

class Derived : Base() {
    val id = 100
    override val name: String = "Derived"

    override fun sayHi() {
        Log.d(javaClass.simpleName, "My name is: $name and my id is: $id ")
    }
}

class DerivedTwo : Base() {
    override val name: String = "Derived two"
    override fun sayHi() {
        Log.d(javaClass.simpleName, "My name is $name and i don,t have any id")
    }

}















