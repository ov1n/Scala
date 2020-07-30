object q4 extends App{

    //variable to keep list of accounts
    var bank:List[Account]=List()

    class Account(id:String,n:Int,b:Double){

        val nic:String=id
        val acnumber:Int=n
        var balance:Double=b

        override def toString="["+nic+":"+acnumber+":"+balance+"]"

        //function to print balance
        def displayBalance()=
        println(balance)

        def withdraw(x:Double)=
        this.balance=this.balance-x

        def deposit(x:Double)=
        this.balance=this.balance+x

        def transfer(a:Account,x:Double){
            this.withdraw(x)
            a.deposit(x)
        }

        //function to add balances of 2 accounts passes dummy NIC and acnumber
        def +(x:Account)=
            new Account("",0,this.balance+x.balance)

        //function to multiply balance of an account
        def *(x:Double)=
           this.balance*=x
    }

    //find a particular account with an NIC
    val find=(n:String,b:List[Account])=>
        b.filter(x=>x.nic.equals(n))

    //4.1
    //get accounts which have a negative balance
    val overdraft=(b:List[Account])=> 
        b.filter(x=>x.balance<0)

    //get accounts which have a positive balance
    val deposit=(b:List[Account])=> 
        b.filter(x=>x.balance>0)

    //4.2
    //get balances of all accounts
    val balance=(b:List[Account])=> 
        b.reduce((x,y)=>x+y)

    //4.3
    //setting interest
    def interest(b:List[Account]){
        overdraft(b).map(x=>x*1.1)
        deposit(b).map(x=>x*1.05)
    }

    //2 dummy accounts to demonstrate function
    val acc1 = new Account("982722063V",9587456,4000.00)
    val acc2 = new Account("945002169V",9689656,-300.00)

    bank=List(acc1,acc2);
    //display details of 1st account
    println("1st account details:")
    println(acc1+"\n")

    //display details of 2nd account
    println("2st account details:")
    println(acc2+"\n")
    
    //Overdraft function demonstration
    //println("Overdraft")
    //overdraft(bank).foreach(println)

    //Sum of all accounts before interest
    println("Sum of all accounts before interest:")
    balance(bank).displayBalance

    //overdraft account
    //bank=interest(bank)
    interest(bank)
    println("\nInterest")
    bank.foreach(println)

    //Sum of all accounts after interest
    println("\nSum of all accounts before interest:")
    balance(bank).displayBalance
}