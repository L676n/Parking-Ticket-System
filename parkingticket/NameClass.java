
package parkingticket;

public class NameClass {
    
    private String First;                                                         /*private fields for first and second*/
    private String Second;
    

    public NameClass(String f){                                                   /*constructer for the name of the user*/
        First = f;
        Second = "";
    }
    
    
    public void setSecond(String s){                                              /*set method to set the user second name*/
       Second = s;
}
    
    public NameClass(NameClass object2){
       First = object2.First;                                                     /*copy of the class to avoid problems*/
       Second = object2.Second;
   }
    
    
    @Override
    public String toString(){ 
        
        String str =   First + " " + Second;                                      /*toString method to show class details*/
        return str;
    }
    
}
