import io.StdIn._

object q1 extends App{

    class Rational(x:Int,y:Int){

        require(y>0,"denominator must be greater than 0")
        def this(x:Int)=this(x,1)

        private def gcd(a:Int,b:Int):Int=if(b==0) a else gcd(b,a%b)

        val numer=x/gcd(Math.abs(x),y)
        val denom=y/gcd(Math.abs(x),y)

        def neg=new Rational(-this.numer,this.denom)

        override def toString=numer +"/"+ denom
    }
    println("Enter numerator for number: ")
    var num=readInt()

    println("Enter denominator for number: ")
    var denom=readInt()

    val output=new Rational(num,denom)
    println(output.neg)//.mul(z)
}