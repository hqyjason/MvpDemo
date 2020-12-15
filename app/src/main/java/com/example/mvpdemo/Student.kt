package com.example.mvpdemo

/**
 *author:hequnyu
 *Description:
 *Date:2020/8/6
 */
class Student( name:String,  age:Int) : Person(name , age),Study {
    init {
        //println("sno is " + sno)
        //println("grade is " + grade)
    }

    override fun readBooks() {
        println(name + " is reading.")
    }

    override fun doHomeWork() {
        println(name + " is doing homework")
    }
}