fun main() {
    /*Control statements
    * iteration or loop statements keep on repeating until a condition is met
    * run or both true or false statements*/

    /*control statements
    * if
    * if else
    * nested if
    * when
    * if else if*/

    //if used to give an output based on the condition
    //example
    var age = 15
    if (age>30) {
        println( "you need to have a family")
    }

    //if else it has two options
    // example
    if (age>30) {
        println("you need to have a family")
    } else {
        println ("mind your own business")
    }

    //if else if has more than 2 options
    //example
    if (age<10){
        println("You need to sleep")
    }else if (age > 10 || age <30){
        println("mind your own business")
    } else {
        println ("bye")
    }

    //when - returns a value. it is a replacement of switch statement from java
    //example
    var number = 2
    var day = when (number) {
        1->"Monday"
        2->"Tuesday"
        3->"Wednesday"
        4->"Thursday"
        5->"Friday"
        6->"Saturday"
        7->"Sunday"
        else-> "date does not exist"
    }
    println("your day is $day")

    //when statements without an expression
    when (number) {
        1->"Monday"
        2->"Tuesday"
        3->"Wednesday"
        4->"Thursday"
        5->"Friday"
        6->"Saturday"
        7->"Sunday"
        else-> "date does not exist"
    }
    println("your day is $number")

    //nested if
    if (age <15){
        println("you are a young")
    } else if (age>15 && age<30){
        if (age >15 && age <22){
            println("you are a teen")
        } else {
            println("you are an adult")
        }
        println("mind your own business")
    } else{
        println("you need to have a family")
    }

}