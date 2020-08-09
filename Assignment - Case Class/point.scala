object point extends  App{
    case class Point(a:Int,b:Int){
        def x:Int=a
        def y:Int=b

        //add 2 given points
        def +(a:Point)=
            Point(a.x+this.x,a.y+this.y)

        //moves a point according to the parameters
        def move(dx:Int,dy:Int)=
            Point(this.x+dx,this.y+dy)


        //distance between 2 given points
        def distance(a:Point)=
            Math.sqrt(Math.pow(a.y-y,2)+Math.pow(a.x-x,2))

        //switches x and y coordinates
        def inverse()=
            Point(this.y,this.x)
    }

    //2 arbitary points as example
    println("Enter x value for 1st point: ")
    val a1=scala.io.StdIn.readInt()
    println("Enter y value for 1st point: ")
    val b1=scala.io.StdIn.readInt()
    val p1=Point(a1,b1)

    println("Enter x value for 2nd point: ")
    val a2=scala.io.StdIn.readInt()
    println("Enter y value for 2nd point: ")
    val b2=scala.io.StdIn.readInt()
    val p2=Point(a2,b2)

    //print addition of 2 points
    println("Addition of 2 points: "+(p1+p2))

    //print distance between 2 points
    println("Distance between 2 points: "+p1.distance(p2)+"\n")

    //get dx and dy to move p1
    println("Enter dx to move 1st point: ")
    val dx=scala.io.StdIn.readInt()
    println("Enter dy to move 1st point: ")
    val dy=scala.io.StdIn.readInt()

    //move point
    println("Moved point p1: "+p1.move(dx,dy))

    //Invert point p1
    println("p1 before inverting: "+p1)
    println("p1 after inverting: "+p1.inverse())
}