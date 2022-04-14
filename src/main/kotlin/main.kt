fun main(){
    println(takeProduct())
    var thing=Product("cabbage",2,40.00,"hygiene")
    var those =Product("Gloves",2,40.0,"Hygiene")
    var that = Product("Table",3,400.00,"other")
    var all = mutableListOf<Product>(thing,those,that)

    var currentAcc= CurrentAccount("01234","Barclays",7000)
      currentAcc.deposit(100.00)
      currentAcc.withdraw(700.00)
      currentAcc.details()
    (thisString("banana"))
}
 open class CurrentAccount(var accountNumber:String,var accountName:String,var balance:Int){

    fun deposit(amount:Double){
       var total= balance+amount
        println(total.toString().toDouble())
    }
   open fun withdraw(amount:Double){
      var new =balance-amount
        println(new.toString().toDouble())
    }
    fun details(){
        var l =balance*2
println(" Account number is $accountNumber with balance $balance")
    }
}
class SavingAccount(accountNumber: String,accountName: String,balance: Int):CurrentAccount(accountNumber,accountName,balance){
    override fun withdraw(amount: Double) {
        super.withdraw(amount)
    }


    }

data class Product(var name:String,var weight:Int,var price:Double,var category:String)
fun takeProduct(): Product {
    var thing=Product("cabbage",2,40.00,"hygiene")
    var those =Product("Gloves",2,40.0,"Hygiene")
    var that = Product("Table",3,400.00,"other")
    var all = mutableListOf<Product>(thing,those,that)
    when (that.category){
        "Eat"->println("Groceries")
        "Clean"-> println("Hygiene")
        "Nothing here"-> println("Other")
        else-> println("Exit code")
    }
    return that
}
 fun thisString(text:String):String{
     text.forEachIndexed { index, c ->
         if ((index%2)==0  ){
             println(c)
         }
         }
     return  text
     }
