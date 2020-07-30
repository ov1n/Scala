object q3 extends App{
    class Account(id:String,n:Int,b:Double){

        val nic:String=id
        val acnumber:Int=n
        var balance:Double=b

        override def toString="["+nic+":"+acnumber+":"+balance+"]"

        def withdraw(x:Double)=
        this.balance=this.balance-x

        def deposit(x:Double)=
        this.balance=this.balance+x

        def transfer(a:Account,x:Double){
            this.withdraw(x)
            a.deposit(x)
        }
    }

    val acc1 = new Account("982722063V",9587456,1000.00)
    val acc2 = new Account("945002169V",9689656,1000.00)

    //display details of 1st account
    println("1st account details:")
    println(acc1+"\n")

    //display details of 2nd account
    println("2st account details:")
    println(acc2+"\n")

    //Enter amount to transfer which is less than 1000
    println("Enter amount to transfer which is less than 1000: ")
    var user=scala.io.StdIn.readDouble()

    acc1.transfer(acc2,user)
    
    //display details of 1st account
    println("1st account details:")
    println(acc1+"\n")

    //display details of 2nd account
    println("2st account details:")
    println(acc2+"\n")
}