//=============================================================================
// PROGRAMMER: Eduardo Aparicio Jaime  
// PANTHER ID: 5645176
//
// CLASS: COP2210
// SECTION: U01
// SEMESTER: Spring 2021
// CLASSTIME: T/TH 5:00-6:15 pm
//
// Project: Project 1
// DUE:02/14/2021
//
// CERTIFICATION: I understand FIU’s academic policies, and I certify that this work is my
// own and that none of it is the work of any other person.
//=============================================================================
package app;


import motor.Duramax;
import motor.V6; 
import tool.Analyzer; 
import vehicle.Truck; 


public class Controller {

    public static void main(String[] args) {
            
        
 
           Duramax motor1 = new Duramax();
           Duramax motor2 = new Duramax(8);
          
           
           
        
            

              
        System.out.println("==============================================================");
        System.out.println("Direct Motor Scan");
        System.out.println("==============================================================");
        System.out.println("");

        motor1.scan("");
        motor2.scan("\t");
        
        
        
    
        
          


// Step 15 ---------------- 
//            // Create a variable  named motor3 of type V6 
//            // YOUR CODE HERE
            V6 motor3 = new V6();
                   
            
            motor3.scan("\t\t");

            // call the scan method on variable  motor3 with input "\t\t"
            // YOUR CODE HERE
           
            
// End Step 15 -----------------------      


// Step 23 -----------------------

              // Uncomment line the three System.out.println code below
            
           System.out.println("");
           System.out.println("--------------------------------------------------------------");
           System.out.println("");
           Truck truck1 = new Truck("Colorado", motor1);

              // Create a Truck object named truck1 with inputs" "Colorado", motor1
              // YOUR CODE HERE
             

              // call the scan method on the variable truck1
              // YOUR CODE HERE
             truck1.scan();
              
// end Step 23 -----------------------
            
// Step 24 -----------------------        
            // Create a Truck object named truck2 with inputs" "Colorado", motor3, 2014
            // YOUR CODE HERE
       Truck truck2 = new Truck("Colorado",motor3,2014);
            // call the scan method on the variable truck2
            // YOUR CODE HERE
      truck2.scan();
            
            
// end Step 24 -----------------------
            
// Step 28 -----------------------  
            // use the scanner of the Analyzer to scan Vehicle -> truck1
            // YOUR CODE HERE
      Analyzer.getScanner().scanVehicle(truck1);
      Analyzer.getScanner().scanVehicle(truck2);      

            // use the scanner of the Analyzer to scan Vehicle -> truck2
            // YOUR CODE HERE
       

// end Step 28 -----------------------  

        System.out.println(" ");
       
    }
    
}
