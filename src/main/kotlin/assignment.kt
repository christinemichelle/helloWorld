fun main() {

    var txt = "i love coding"
    var word= "coding"
    println("The length $word is" + word.length)

    var animal= "snake"
    println(animal.uppercase())

    var domestic= "Camel"
    println(domestic.lowercase())

    println(calculateDicountedPrice(100.0 , 20))

}
fun calculateDicountedPrice(price: Double, discountPercentage:Int) : Double{
    val dicountedPrice= price-(discountPercentage.toDouble()/100 * price)
    return dicountedPrice

}

