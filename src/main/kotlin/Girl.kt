class Girl:Person(21, "Wanj") {
    override fun displayage(age:Int){
        println("My fake age is $(age-5).")

    }

}

fun main(args:Array<String>) {
    val girl = Girl()
    girl.displayage(16)

}