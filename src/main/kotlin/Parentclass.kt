class Parentclass {
    private var name: String =""

    class nestedclass{
        var describe: String="Code inside nested class"
        private var id:Int = 15

        fun nestedOutput(){
            println("ID is $id")
        }
    }
}

fun main() {
    println(Parentclass.nestedclass().describe)

    var object1=Parentclass.nestedclass()
    object1.nestedOutput()

}