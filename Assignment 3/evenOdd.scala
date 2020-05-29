object evenOdd extends App{

    def evenOdd(n:Int):Any= n match{

        case 0 => println("Even")
        case 1 => println("Odd")
        case _ => evenOdd(n-2)
    }

    println("Enter number to check if odd or even ");
    val p=scala.io.StdIn.readInt();

    evenOdd(p);
}