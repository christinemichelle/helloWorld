//class myclass(val name:String, var id:Int) {
//}

//fun main() {
//var mtu =myclass ("gigi" , 22 )
//println(mtu.name)
//println(mtu.id)
//}

//class Myclass{
//constructor(id: Int, name: String){
//print(id)
//print(name)
//}
//}

//fun main() {
//var sec= Myclass (21, "Steve")
//println(sec)
//}

open class Base(){
    var a=1
    private var b=2
    protected open var c=3
    internal val d=4

    protected fun e(){

    }
}
class derived:Base(){
    override var c =9
}

fun main() {
    val base =Base()
    val Derived = derived()
}