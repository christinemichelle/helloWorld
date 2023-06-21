class Account {
    var acc_num:Int =0
    var name:String= ""
    var amt:Float= 0.toFloat()

    fun insert(ac:Int, n:String, am:Float){
        acc_num=ac
        name = n
        amt = am

        println("Account number $acc_num holder $name amount $amt")
    }

    /*Object*/
    //var acct=Account()

    fun deposit(){
        //Deposit code
    }

    fun withdraw(){

    }

    fun checkBalance(){

    }

}

fun main() {
    Account()
    var person =Account()
    person.insert( 100, "John", 100.1f)
    var person2 = Account()
    person2.insert(45,"man", 10.5f)


}