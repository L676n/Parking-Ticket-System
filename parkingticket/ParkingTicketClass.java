
package parkingticket;

public class ParkingTicketClass {
    
    private String VehicleType;
    private NameClass name;                                                       
    private VehicleInfoClass vehicle;
    private TicketDetailClass ticketDetail;                                       /*private fields for VehicleType and name
                                                                                       and vehicle and ticketDetail*/
    
    
    public ParkingTicketClass(String vt, NameClass nam, VehicleInfoClass v,
                               TicketDetailClass TD){                              /*constructer to get inputs from other classes
                                                                                     and to get VehicleType from the user */
        VehicleType = vt;
        name = new NameClass(nam);
        vehicle = new VehicleInfoClass(v);
        ticketDetail = new TicketDetailClass(TD);
    } 
    
    public String getVehicleType(){                                               /*get method to get the user input of the VehicleType*/
        return VehicleType;         
    }
    
     public NameClass getName(){                                                  /*get method to get the user input from the NameClass*/
        return new NameClass(name);
    }
     
    public VehicleInfoClass getVehicle(){                                         /*get method to get the user input from the VehicleInfoClass*/    
        return new VehicleInfoClass(vehicle);
    }
    
    public TicketDetailClass getTicketDetail(){                                   /*get method to get the user input from the TicketDetailClass*/
        return new TicketDetailClass(ticketDetail);
    }
    
    @Override
    public String toString(){
        String str = "Vehicle type: " + VehicleType
                    +"\nOwner name: " + name                                      /*toString method to show class details*/
                    +"\nColor and brand: " + vehicle
                    +"\nPrice and time: " + ticketDetail;
        
        return str;
    }
    
}
