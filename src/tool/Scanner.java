package tool;

import java.text.SimpleDateFormat;
import java.util.Date;
import vehicle.Truck;


public class Scanner {
    
    public static int numberOfScans = 0;
    
    private String analyzerID;
    public final String scannerID = "SCAN-X123-789-A";
    

    
    public Scanner(String analyzerID){
        this.analyzerID = analyzerID;
    }
    
    public void scanVehicle(Truck truck){
        
        String pattern = "E, MMMM dd,yyyy HH:mm:ss.SSS";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());

        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------------------");
        System.out.println("Scanning Vehicle: ");
        System.out.println("----------------------------------------------");
        System.out.printf("Current Time:\t %-20s \n",  date);
        System.out.printf("Analyzer ID: \t %-10s \n", analyzerID);
        System.out.printf("Analyzer ID: \t %-10s \n", scannerID);
        System.out.println("");

        System.out.println("----------Vehicle Info----------");

        System.out.printf("Model:\t\t %-10s \n",  truck.getModel());
        System.out.printf("Year Build:\t %-10d \n", truck.getYearBuild());
        System.out.printf("Year Build:\t %-10.2f \n", truck.getNewPrice());
        System.out.printf("VIN:\t\t %-10s \n",  truck.getVin());
        System.out.printf("Mileage:\t %-10d \n",  truck.getMileage());
        System.out.printf("Last Service:\t %-10s \n", truck.getLastServiceDate());
        
        System.out.println("");
        System.out.println("----------Motor Scan ----------");
        
        
        if(truck.getDuramaxMotor() != null){
            
 // Step 25 -----------------------   
 
            //IMPORTANT
            // uncomment the code line 27-47
            //uncomment the four system.out.print code below
            System.out.printf("Cylinders:\t %-10d \n", truck.getDuramaxMotor().getNumberOfCylinders());
            System.out.printf("Displacement:\t %-10.2f \n", truck.getDuramaxMotor().getDisplacement());
            System.out.printf("Fuel Type:\t %-10s \n", truck.getDuramaxMotor().getFuelType());
            System.out.printf("Serial Number:\t %-10s \n", truck.getDuramaxMotor().getSerialNumber());
            

            // output the truck object torque and HP values
            // you need to think here ..... 
            // uncomment lines below and complete add the needed code
            System.out.printf("Torque:\t\t %-10.3f \n",truck.getDuramaxMotor().engineScannerTorque());
            System.out.printf("HP:\t\t %-10.3f \n", truck.getDuramaxMotor().engineScannerHP());
           

// end Step 25 -----------------------  

        }//end if
        
        
        if(truck.getV6Motor()!= null){
// Step 26 -----------------------  
            //uncomment the four system.out.print code below
            System.out.printf("Cylinders:\t %-10d \n", truck.getV6Motor().getNumberOfCylinders());
            System.out.printf("Displacement:\t %-10.2f \n", truck.getV6Motor().getDisplacement());
            System.out.printf("Fuel Type:\t %-10s \n", truck.getV6Motor().getFuelType());
            System.out.printf("Serial Number:\t %-10s \n", truck.getV6Motor().getSerialNumber());
 
            // output the truck object torque and HP values
            // you need to think here ....
            // uncomment lines below and complete add the needed code
            System.out.printf("Torque:\t\t %-10.3f \n", truck.getV6Motor().engineScannerTorque() );
            System.out.printf("HP:\t\t %-10.3f \n", truck.getV6Motor().engineScannerHP());
           
// end Step 26 -----------------------

        }//end if

// Step 27 -----------------------  
        //uncomment the two system.out.print code below
        System.out.println("");
        System.out.println("Updating Last Service Date -> " + date);
         
        // set the last service date of the truck object to the date variable value
        // YOUR CODE HERE
 
        truck.setLastServiceDate(date);
                
// end Step 27 -----------------------  
        
        numberOfScans++;
     
    }
    
}
