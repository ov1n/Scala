object takeHomeSalary extends  App{
    def wage(hours:Int)={
        hours*150;
    }

    def ot(hours:Int)={
        hours*75;
    }

    def income(hour1:Int,hour2:Int)={
        wage(hour1)+ot(hour2);
    }

    def tax(amount:Int):Double={
        amount*0.1;
    }

    def takeHome(hour1:Int,hour2:Int):Double={
        income(hour1,hour2)-tax(income(hour1,hour2));
    }

    println("Enter working hours: ");
    val h1=scala.io.StdIn.readInt();

    println("\nEnter OT hours: ");
    val h2=scala.io.StdIn.readInt();

    println("Take Home salary= "+takeHome(h1,h2));
}