object bestTicketPrice extends  App{
    def attendees(price:Int)={      //get how much people come to visit
                                    //based on ticket price
        120+(15-price)/5*20;                
    }

    def revenue(price:Int):Int={    //income from tickets
        attendees(price)*price;
    }

    def cost(price:Int)={           //cost per show
        500+3*attendees(price);
    }

    def profit(price:Int):Int={
        revenue(price)-cost(price);
    }

    println("Enter suggested price: ");
    val p=scala.io.StdIn.readInt();

    println("profit for "+p+"= "+profit(p));
}