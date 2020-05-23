object BookCalc extends  App{
  def CalculateShopping(y:Int)={
    //Function used to calculate shopping cost seperately
    if(y>50) {
      (y-50)*(0.75)+(y*24.95/100*60);
    }
    else{
      y*24.95/100*60;
    }

  }
  def CalculateTotal(x:Int)= {
    
    (CalculateShopping(x)+3);  //40% discount
    
  }

  println("total wholesale cost for 60 copies = "+CalculateTotal(60));

}
