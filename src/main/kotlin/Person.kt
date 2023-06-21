open class Person(age:Int,name: String) {
    //code for eating,talking,walking
    init {
        println("My name is $name .")
        println("My name is $age")
    }



    open fun displayage(age: Int){
        println("my age is $age")
    }

}
class MathTeacher(age:Int, name:String){
    //other features of math teacher
}
class Football(age: Int, name:String){
    //other features of a footballer
}
class Businessman(age: Int, name:String){
    //other features of a businessman
}


fun main(args:Array<String>) {
    val t1=Teacher(25,"Jack")
    t1.teachMaths()
    println()

    val f1=football(25,"Museveni")
    f1.playfootball()
    println()

    val m1=Business(35,"Kamau")
    m1.manBusiness()
    println()
}