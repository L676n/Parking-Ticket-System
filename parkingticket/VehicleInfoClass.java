
package parkingticket;

public class VehicleInfoClass {
    
    private String Color;                                                         /*private feilds for color and brand*/
    private String Brand;
    
    
    public VehicleInfoClass(String c){                                            /*constructer of the color and brand of user car*/
        Color = c;
        Brand = "";
    }
        
    
    public void setBrand(String b){
        Brand = b;                                                               /*set method to set the user input of the brand*/
    }
    
    
    public VehicleInfoClass(VehicleInfoClass object2){
       Color = object2.Color;                                                     /*copy of the class to avoid problems*/
        Brand = object2. Brand;
   }
    
    @Override
    public String toString(){
                                                                                  /*toString method to show class details*/
        String str =  Color + ", " + Brand;
        return str;
    }
}
