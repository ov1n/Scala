object primeSeq extends App{

    def gcd(a:Int,b:Int):Int=b match{

        case 0 => a
        case x if x>a => gcd(x,a)               //If 2nd no is greater
        case _ => gcd(b,a%b)                    //change precedence
    }

    def prime(a:Int,b:Int=2):Boolean=b match{
        case x if(x==a) => return true
        case x if gcd(a,x)>1 => return false   //false if there's a common factor
        case x => prime(a,b+1)
    }

    def primeSeq(a:Int,b:Int=2):Any={

        if(b<a){
            if(prime(b)) println(b)
            primeSeq(a,b+1)
        }
    }

    println("Enter number to check for prime numbers less than it ");
    val p=scala.io.StdIn.readInt();
    primeSeq(p);
}