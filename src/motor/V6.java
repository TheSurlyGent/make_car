
package motor;


public class V6 {
    
    // Class constants and variables
    //---------------------------------------------------------------
 
// Step 11 -----------------
    
    // Use the UML Diagram to declare the Class constants and variable for this class
    // YOUR CODE HERE
    public final String SERIAL_ID = "GM-V6-LFZ-";
    public final String FACTORY_LOCATION = "MICHIGAN-";
    
    public int engineCounter = 12000;
    
    
    private double displacement;
    private int numberOfCylinders;
    private double mpg;
    private String serialNumber;
    private String fuelType;
    
    // set engineCounter starting value to 12000
    // YOUR CODE HERE
  
 
// end  Step 11 -----------------
    
    // Instance constants and variables
    //---------------------------------------------------------------
    
    
    


// Constructors
    //---------------------------------------------------------------
    public V6(){
        
// Step 12 -----------------        
        //  initialize the instance variable serialNumber with the adding of the following:
        // SERIAL_ID, FACTORY_LOCATION, and  engineCounter;
        // YOUR CODE HERE
        serialNumber = SERIAL_ID + FACTORY_LOCATION + engineCounter;
        
        
   
        
        // Increment the class variable engineCounter by 1
        // YOUR CODE HERE
engineCounter++;
        
 // end Step 12 -----------------  
        
        displacement = 3.6;
        numberOfCylinders = 6;
        fuelType = "Gas";
        mpg = 20;
        
    }
    
    
// Step 13 -------------------
    // Add all needed setter and getter methods. (Hint: look at the UML Diagram)
    // YOUR CODE HERE
    public String getSERIAL_ID() {
        return SERIAL_ID;
    }
   
    //------------------------------------------------
    
    public String getFACTORY_LOCATION() {
        return FACTORY_LOCATION;
    }
    
    //------------------------------------------------
    
    public int getEngineCounter() {
        return engineCounter;
    }

    //---------------------------------------------------------------
    // Instance setters name getters methods
    //---------------------------------------------------------------

    public double getDisplacement() {
        return displacement;
    }
    
    //------------------------------------------------
    
    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }
    
    //------------------------------------------------
    
 
    public String getSerialNumber() {
        return serialNumber;
    }

    //------------------------------------------------
    
    public String getFuelType() {
        return fuelType;
    }
    
    //------------------------------------------------

    public double getMpg() {
        return mpg;
    }
// end Step 13 -------------------
    
    
    //---------------------------------------------------------------
    // Instance Utility Methods
    //---------------------------------------------------------------
     public double engineScannerTorque(){
        
        return calculateTorque();
    }
     
     
    //------------------------------------------------
     
    public double engineScannerHP(){
        
        return calculateHP();
    }
    
    //------------------------------------------------
    
     
     private double calculateTorque(){
        
        final double  TORQUE_CONSTANT = 142.4;
        final double  CYLINDER_LOAD_FACTOR = 1220.13;
        double torque = 0.0;
        
        
// Step 16 --------------------------- 
        
        torque = CYLINDER_LOAD_FACTOR * Math.sqrt( ( Math.pow( (displacement / numberOfCylinders), 24) 
                                                            *  Math.log(TORQUE_CONSTANT)) ) + TORQUE_CONSTANT/ 0.75;
        
//end  Step 16 --------------------------- 
        
        return torque;
    }

    
     //------------------------------------------------
    
    private double calculateHP(){
        
        double hp = 0.0;
        
// Step 17 --------------------------- 

         hp = Math.pow( (2 * Math.PI * 4700 * calculateTorque() / 33000), 1.11) ;
        
// end Step 17 --------------------------- 
        
        return hp;
    }
    
    
    
     public void scan(String spacer){
         System.out.println("");
         
// Step 14 -----------------------
        // Use println and printf methods for the output and make sure your output is aligned
        // as shown below
        /*
        
        ----------------------------------------------
	Scanning V6
	----------------------------------------------
	Displacement:		 3.600      
	Number of Cylinders:	 6          
	Fuel Type:		 Gas        
	Serial Number:		 GM-V6-LFZ-MICHIGAN-12000 
	MPG:			 20.000  
        
        //
        
        System.out.println("");
        System.out.println(spacer + "----------------------------------------------");
        System.out.println(spacer + " Scanning V6");
        System.out.println(spacer + "----------------------------------------------");
        System.out.printf(spacer + "Displacement:\t\t %-10.3f \n",  displacement);
        */
        // Here the spacer variable is a spacing string like "\t"
        
        //YOUR CODE HERE
        System.out.println("");
        System.out.println(spacer + "----------------------------------------------");
        System.out.println(spacer + " Scanning V6");
        System.out.println(spacer + "----------------------------------------------");
        System.out.printf(spacer + "Displacement:\t\t %-10.3f \n",  displacement);
        System.out.printf(spacer + "Number of Cylinders:\t %-10d \n",  numberOfCylinders);
        System.out.printf(spacer + "Fuel Type:\t\t %-10s \n",  fuelType);
        System.out.printf(spacer + "Serial Number:\t\t %-10s \n",  serialNumber);
        System.out.printf(spacer + "MPG:\t\t\t %-10.3f \n",  mpg);
        System.out.printf(spacer + "Torque: \t\t %-10.3f \n", calculateTorque());
        System.out.printf(spacer + "HP: \t\t\t %-10.3f \n", calculateHP());

// end Step 14 -----------------------     
        System.out.println("");
       
 
// Step 18 -----------------------

        // Use printf to output the torque and  hp value of the motor
        // see project instructions to see the format of the output
        // YOUR CODE HERE   
        

// end Step 18 -----------------------  
        
    }
    
}//end of class