object sum extends App{

    def sum(n:Int):Int=n match{

        case 0 => return 0
        case x => return n+sum(n-1)
    }

    println("Enter number to check addition to ");
    val p=scala.io.StdIn.readInt();
    
    println(sum(p))
}