object Volume extends  App{
  def Calculate(r:Double)= {

    4/3*math.Pi*r*r*r;
    
  }

  println("Volume of a sphere with radius 5 = "+Calculate(5));

}