object BookCalc extends  App{
  def Calculate(x:Int)= {

    val bookPrice:Double=24.95; //cover price of book
    var wholePrice:Double=0     //A temporary variable is taken to store whole price
    
    if(x>50) {
      wholePrice=((x-50)*(0.75)+(x*bookPrice))+3;
      wholePrice;
    }
    else{
      wholePrice=(x*bookPrice)+3;
      wholePrice;
    }
    
  }

  println(Calculate(20));

}