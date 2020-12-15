package com.example.mvpdemo

/**
 *author:hequnyu
 *Description:
 *Date:2020/8/6
 */
fun main() {
/*    val p = Person()
    p.name = "Jack"
    p.age = 19
    p.eat()*/
/*    val student = Student("a123",5)
    doStudy(student)*/
/*    val cellPhone1 = CellPhone("Samsung",1299.99)
    val cellPhone2 = CellPhone("Samsung",1299.99)
    println(cellPhone1)
    println("cellphone1 equals cellphone2 "+(cellPhone1 == cellPhone2))
    Singleton.singletonTest()*/
    val list = listOf<String>("Apple","Banana","Orange","Pear","Grape","Watermelon")
    //val lambda = {fruit:String -> fruit.length}
    //val maxLength = list.maxBy({fruit:String -> fruit.length})
    //val maxLength = list.maxBy{it.length}
    //val newlist = list.map{it.toLowerCase()}
    val newlist = list.filter { it.length<=5 }.map{it.toUpperCase()}
    for (fruit in newlist){
        println(fruit)
    }
}

fun doStudy(study: Study) {
    study.readBooks()
    study.doHomeWork()
}
