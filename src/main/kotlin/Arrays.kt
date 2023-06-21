fun main() {
    var fruits = arrayOf("mangoes", "bananas", "apples", "pineapples", "oranges", "watermelons", "strawberry" ,"blueberries" ,"treeTomato","lunquats")
    println(fruits[4])


    for (z in fruits)
        println(z)

    fruits.get(5)

    fruits.set(5, "grapes")

    for (z in fruits)
        println(z)

    if ("oranges" in fruits) {
        println("It exists")
    }else{
        println("It does not exist")
    }

//
//    var Data = arrayOf("weather", 21, "shoes",35)
//
//    //Using the getter function
//    println(fruits.get(7))
//
//    //Using set function to set the value at index seven
//    fruits.set(7,"blueberries")
//    println(fruits.get(7))


    //looping through an array
    var months= arrayOf("January","February","March", "April" , "May","June", "July", "August", "September","October","November","December")

    for (i in months)
        println(i)




}