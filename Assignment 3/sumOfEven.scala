object sumofEven extends App{
 
    def sumofEven(n:Int,b:Int=0):Int=b match{

        case x if x>=n => return 0
        case x => b+sumofEven(n,b+2)
    }

    println("Enter number to check sum of even numers upto :");
    val p=scala.io.StdIn.readInt();
    
    println(sumofEven(p))
}