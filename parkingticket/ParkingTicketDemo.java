
package parkingticket;

import java.io.*;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  
import java.util.Arrays;
import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParkingTicketDemo {
    

    public static void main(String[] args)throws IOException {
        
        Scanner keyboard = new Scanner (System.in);
    
        String color, brand;
        String fName, sName;
        int[] parkingPrices = {5, 10, 15, 20, 25, 50, 110};                       /*creating this ararries to pass it to TicketDetailClass*/
        double[] times = {1, 1.5, 2, 2.5, 3, 6, 12};
        String VehicleType;
        double time;
        
        System.out.println("Times availble: ");
        TicketDetailClass timesWanted = new TicketDetailClass(times);             /*creating object to show time array*/
        System.out.println(Arrays.toString(timesWanted.getTimesWanted()));
        
        System.out.println("Prices: ");
        TicketDetailClass prices = new TicketDetailClass(parkingPrices);          /*creating object to show price array*/
        System.out.println(Arrays.toString(prices.getPrices()));
        System.out.print("\nChoose time preferd or 4 to cancle: ");
        time = keyboard.nextDouble();
        TicketDetailClass choices = new TicketDetailClass();                      /*creating object to show and to set the user inputs*/
        choices.setChoosenTime(time);
        
        while(time == 5 || time == 7 || time == 8 || time == 9 
                      || time == 10 || time == 11 ||time <=0 || time > 12){       /*craeting a big header for while to avoid mistakes*/
            System.out.println("Sorry! Wrong Input");
            System.out.println("Enter a valid number: ");     
            time = keyboard.nextDouble();
        }
        if(time == 1){
            choices.setChoosenPrice(prices.getPrices()[0]);
            System.out.println("The price is is " + prices.getPrices()[0]);        /*to set the time and the price the user chooses*/
        }
        else if(time == 1.5){
            choices.setChoosenPrice(prices.getPrices()[1]);
            System.out.println("The price is is " + prices.getPrices()[1]);        
        }
        else if(time == 2){
            choices.setChoosenPrice(prices.getPrices()[2]);
            System.out.println("The price is is " + prices.getPrices()[2]);        
        }
        else if(time == 2.5){
            choices.setChoosenPrice(prices.getPrices()[3]);
            System.out.println("The price is is " + prices.getPrices()[3]);        
        }
        else if(time == 3){
            choices.setChoosenPrice(prices.getPrices()[4]);
            System.out.println("The price is is " + prices.getPrices()[4]);        
        }
        else if(time == 6){
            choices.setChoosenPrice(prices.getPrices()[5]);
            System.out.println("The price is is " + prices.getPrices()[5]);        
        }
        else if(time == 12){
            choices.setChoosenPrice(prices.getPrices()[6]);
            System.out.println("The price is is " + prices.getPrices()[6]);        
        }
        else if(time == 4){
            System.out.println("Program ended, thank you :)");
            System.exit(0);        
        }
        
        System.out.println("");
         
        System.out.println("\nEnter your first and second name: \n");
        fName = keyboard.nextLine();
        sName = keyboard.nextLine();
        
        
        NameClass name = new  NameClass(fName);                                   /*creating object to show and set first and second name*/
        name.setSecond(sName);
        
        System.out.println("\nEnter the color of the vehicle: \n");
        color = keyboard.nextLine();
        System.out.println("\nEnter the brand of the vehicle: \n");
        brand = keyboard.nextLine();
        VehicleInfoClass VInfo = new VehicleInfoClass(color);                     /*creating object to show and set the color and the brand of the vehicle*/
        VInfo.setBrand(brand);
        
        System.out.println("\nEnter the type of your Vehicle (Car - Motorbike - Bus - Truck): \n");
        VehicleType = keyboard.nextLine();
        ParkingTicketClass ticket = new ParkingTicketClass(VehicleType, name,
                                                           VInfo, choices);       /*creating object to show all user choices and to show getters*/
        
        System.out.println("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("                  TICKET DEATIL");                    /*printing ticket*/
        System.out.println("-------------------------------------------------");
        System.out.println(ticket);
    
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();                                  /*printing current  date and time*/
            System.out.println("Date and time: " + dtf.format(now));
            
            
           System.out.println("\nReading user inputs:");
            BufferedReader reader = new BufferedReader(                           /*read user input*/
            new InputStreamReader(System.in));
             System.out.println(ticket);
            
             
        ArrayList<ParkingTicketClass> TicketDetail = new ArrayList<>();
        TicketDetail.add(ticket);                                                 /*to put user input in arrayList*/
       

            
        PrintWriter outputFile = new PrintWriter("Parking Ticket.txt");         
        for(int i = 0; i < TicketDetail.size(); ++i){                             /*writing file to show user inputs*/
            outputFile.println(TicketDetail.get(i));                             
        } 
        outputFile.close();
        
        File nameFile = new File("Parking Ticket.txt");
        Scanner inputFile = new Scanner(nameFile);                               /*to read the created file and show inputs*/
        inputFile.close();
    }
    
}
