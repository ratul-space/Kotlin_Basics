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


class MainActivity : AppCompatActivity() {

    private val TAG: String = javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var countrylist = mutableListOf<Country>()
        countrylist.add(Country("Bangladesh", "Dhaka"))

        var countryIndia = Country("", "")
        countryIndia.name = "India"
        countryIndia.capital = "Delhi"

        countrylist.add(countryIndia)
        countrylist.add(Country("Nepal", "Kathmandu"))

        for (country in countrylist) {
            Log.d(TAG, "onCreate: name = ${country.name}, capital = ${country.capital}")
        }


    }
}

data class Country(var name: String, var capital: String)
















