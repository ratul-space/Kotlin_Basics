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
        var derived: Derived = Derived()
        derived.sayHi()

    }
}


open class Base {
    val name: String = "Base"
    fun sayHi() {
        Log.d("Base", "hi from base")
    }
}

class Derived : Base() {

}
















