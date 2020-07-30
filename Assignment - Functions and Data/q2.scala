object q2 extends App{

    class Rational(x:Int,y:Int){

        //make sure denominator is positive
        require(y>0,"denominator must be greater than 0")
        private def gcd(a:Int,b:Int):Int=if(b==0) a else gcd(b,a%b)

        val denom=y/gcd(x,y)
        val numer=x/gcd(x,y)

        //If 1 parameter is given use this constructor
        def this(x:Int)=this(x,1)
        
        def -(r:Rational)=
            new Rational(numer*r.denom-denom*r.numer,denom*r.denom)

        def neg=new Rational(-this.numer,this.denom)

        def *(r:Rational)=
            new Rational(numer*r.numer,denom*r.denom)

        override def toString=numer +"/"+ denom
    }
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)
    val answer=x-y-z
    println(answer)
}