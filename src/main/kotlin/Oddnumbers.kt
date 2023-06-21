fun main() {
    var num1 =1
    var num2 = 100
    for (i in 1..100){
        if (num1%2 !=0)
            println(num1)
        var result = num1+ num2
        num1++
        println(result)
    }
}
