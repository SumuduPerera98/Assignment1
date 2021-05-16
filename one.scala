
object one  extends App{
    def convert(x:Double)=x*1.8+32;
      println (convert(35));

        def volume(y:Double)=(((4/3.0)*3.14)*y*y*y);
          println (volume(5));

            def shipCost(z:Int):Double={
                  var amount: Double=0;
                      if(z<=50){
                              amount=3;
                                  }else{
                                          amount=3+(0.75*(z-50));
                                              }
                                                  return amount;
                                                    }
              def discount(x:Int):Double={
                    var newprice:Double=0;
                        newprice=x*(24.95-(24.95*0.4));
                            return newprice;}

                def total(x:Int)=discount(x)+shipCost(x);
                  println(total(60));
}
