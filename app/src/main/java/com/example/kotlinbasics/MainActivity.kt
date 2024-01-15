package com.example.kotlinbasics

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private val TAG: String = javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        debugPrint("Welcome from a normal function")
        pringString("Welcome from a higher order function", this::debugPrint)
        pringString("Welcome from anonymous function",
            fun(massage: String) {
                Log.d(TAG, massage)
            })
        pringString("Welcome from Lamda Exoression 1") { massage: String -> Log.d(TAG, massage) }
        pringString(
            "Welcome from Lamda Exoression 2"
        ) { massage -> Log.d(TAG, massage) }//Lamda expression
        pringString("Welcome from Lamda Exoression 3") { Log.d(TAG, it) }//Lamda expression

    }

    private fun pringString(str: String, execFun: (msg: String) -> Unit) {
        return execFun(str)
    }

    private fun debugPrint(msg: String) {
        Log.d(TAG, msg)
    }
}

//        val dog = Dog()
//        dog.bark()
//        val human = Human()
//        Log.d(LOG_TAG, "I am ${human.javaClass.simpleName}, I have life")
//        val robot = Robot()
//        val talkingRobot = TalkingRobot()
//
//        var movable: Movable = dog
//        movable.move()
//        movable = human
//        movable.move()
//        movable = robot
//        movable.move()
//        movable = talkingRobot
//        movable.move()
//        var eatable: Eatable = dog
//        eatable.eat()
//        eatable = human
//        eatable.eat()
//        var speakable: Speakable = human
//        speakable.speak()
//        speakable = talkingRobot
//        speakable.speak()
//        speakable = human
//        speakable.speak()
//    }
//}
//
//const val LOG_TAG = "DemoLogs"
//
//interface Movable {
//    fun move()
//}
//
//interface Eatable {
//    fun eat()
//}
//
//interface Speakable {
//    fun speak()
//}
//
//abstract class Animal : Movable, Eatable {
//    val hasLife: Boolean = true
//
//    override fun move() {
//        Log.d(LOG_TAG, "I am ${TAG}, I can move")
//    }
//
//    override fun eat() {
//        Log.d(LOG_TAG, "I am ${javaClass.simpleName}, I can eat")
//    }
//}
//
//class Dog : Animal() {
//    fun bark() {
//        Log.d(LOG_TAG, "I am ${javaClass.simpleName}, I can bark")
//    }
//}
//
//class Human : Animal(), Speakable {
//    override fun speak() {
//        Log.d(LOG_TAG, "I am ${javaClass.simpleName}, I can speak")
//    }
//}
//
//open class Robot : Movable {
//    override fun move() {
//        Log.d(LOG_TAG, "I am ${javaClass.simpleName}, I can move")
//    }
//}
//
//class TalkingRobot : Robot(), Speakable {
//    override fun speak() {
//        Log.d(LOG_TAG, "I am ${javaClass.simpleName}, I can speak")
//    }
//}


//        var result = sum(30, 50)
//        Log.d(TAG, "Result is: $result")
//        Log.d(TAG, "result is: ${max(30, 20)}")
//        sumAndPrint(40, 60)
//    }
//    fun sum(a: Int, b: Int): Int {
//        return a + b
//    }
//    fun sumAndPrint(a: Int, b: Int) {
//        var sum = a + b
//        Log.d(TAG, "sum and print: sum of $a and $b is: $sum  ")
//    }
//    fun max(a: Int, b: Int): Int = if (a > b) a else b
//}
//        val original = 20000
//        val added = original.plusTwo()
//
//        Log.d(TAG, "result = $added")
//
//        val myClass1 = MyClass()
//        myClass1.internalFunc()
//        myClass1.internalFunc(200)
//    }
//}
//fun Int.plusTwo() = this + 200
//class MyClass {
//    fun internalFunc() {
//        Log.d("MainActivity", "I am the internal fun")
//    }
//}
//fun MyClass.internalFunc(value: Int) {
//    Log.d("MainActivity", "I am external fun and my value is: $value")
//}
//        var personOne = person("Ratul")
//        personOne.age = 19
//        personOne.gender = "Male"
//        Log.d(TAG, "onCreate person one: name = ${personOne.name}, age = ${personOne.age}")
//
//        var personTwo = person("Zoro", 19)
//        personTwo.height = 69.0
//        personTwo.gender = "Male"
//        Log.d(
//            TAG,
//            "onCreate person two: name = ${personTwo.name}, age = ${personTwo.age}, height = ${personTwo.height} inch, is teenage = ${personTwo.isTeenager}"
//        )
//        var personThree = person("Anne")
//        personThree.gender = "Female"
//        Log.d(
//            TAG,
//            " onCreate person three: name = ${personThree.name}, Gender = ${personThree.gender}"
//        )
//
//
//    }
//}
//
//class person(name: String) {
//    var name: String
//    var age: Int = 0
//
//    init {
//        this.name = name
//    }
//
//    constructor(name: String, age: Int) : this(name) {
//        this.age = age
//
//    }
//
//    private var _height: Double = 0.0
//    public var height: Double
//        get() = _height
//        set(value) {
//            _height = value
//        }
//    var isTeenager: Boolean = false
//        private set
//        get() = (age >= 13 && age <= 19)
//
//    var gender: String = ""
//        get() {
//            throw Exception("Gender info is private")
//        }
//        set(value) {
//            if (gender.isNullOrBlank()) {
//                throw Exception("Gender must be Male or Female")
//            } else if (value.equals("Male") || value.equals("Female")) {
//                field = value
//            } else {
//                throw Exception("Gender must be Male or Female")
//            }

//        }
//
//}
//    var isTeenager: Boolean = false
//        private set
//        get() {
//            var ret: Boolean = false
//            if (age >= 13 && age <= 19) {
//                ret = true
//            }
//            return ret
//        }


//    var gender: String = ""
//    public fun getGender(): String{
//        return gender
//    }
//    public fun setGender(gender: String){
//        this.gender = gender
//    }















