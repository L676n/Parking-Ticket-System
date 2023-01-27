
package parkingticket;


public class TicketDetailClass {
    
    private int[] Prices ;
    private double[] TimesWanted;                                                  /*private feilds of arraies and choices*/  
    private int choosenPrice;
    private double choosenTime;
    
    public TicketDetailClass(){                                                    /*no Args constructer to set time and price choosen*/
        choosenTime = 0;
        choosenPrice = 0;
        
    }
    
    public TicketDetailClass(int[] priceArray){                                   /*constructer to show price array*/
        Prices = priceArray; 
    }
    
    public TicketDetailClass(double[] timeArray){                                 /*constructer to show time array*/
        TimesWanted = timeArray; 
    }
    
    
    public TicketDetailClass(TicketDetailClass object2){
       Prices = object2.Prices;
       TimesWanted = object2. TimesWanted;
       choosenPrice = object2.choosenPrice;                                        /*copy of the class to avoid problems*/
       choosenTime = object2.choosenTime;
        
   }
    
    public int[] getPrices(){                                                      /*get method to show prices in main class*/
        
        return Prices;
    }
    
    public double[] getTimesWanted(){                                             /*get method to show times in main class*/
        
        return TimesWanted; 
    }
    
    public void setChoosenPrice(int CP){                                          /*set method to set price specified*/
        choosenPrice = CP; 
    }
    
    public void setChoosenTime(double CT){                                        /*set method to set user prfered time to park*/
        choosenTime = CT;
    }
    
    @Override
    public String toString(){
        
        String str = choosenTime + ", " + choosenPrice;                           /*toString method to show class details*/
        return str;
    }
}
