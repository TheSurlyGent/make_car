package motor;

public class Duramax {
    
    // Class constants and variables
    //---------------------------------------------------------------
    public static final String SERIAL_ID = "GM-DMAX-";
    public static final String FACTORY_LOCATION = "OHIO-";
    public static int engineCounter = 5500;
    
    
    // Instance constants and variables
    //---------------------------------------------------------------
    private double displacement;
    private int numberOfCylinders;
    private String serialNumber;
    private String fuelType;
    private double mpg;
    
    
    // Constructors
    //---------------------------------------------------------------
    public Duramax(){
    serialNumber = SERIAL_ID + FACTORY_LOCATION + engineCounter; 
    
    engineCounter++;
       
    displacement = 2.8;
    numberOfCylinders = 4;
    fuelType = "Diesel";
    mpg = 25;
     
    }
    
    //------------------------------------------------
    public Duramax(int numberOfCylinders){
  
// Step 4 -----------------------
       
        
        if(numberOfCylinders == 8){
 
        this.numberOfCylinders = numberOfCylinders;

            fuelType = "Diesel";
            serialNumber = SERIAL_ID + FACTORY_LOCATION + engineCounter;
           
          
            displacement = 6.6;
            mpg = 19.6;
        }//end if
    }
    //------------------------------------------------
    
    //---------------------------------------------------------------
    // Class  methods
    //---------------------------------------------------------------
   
    public static String getSERIAL_ID() {
        return SERIAL_ID;
    }
  
    //------------------------------------------------
    
    public static String getFACTORY_LOCATION() {
        return FACTORY_LOCATION;
    }
    
    //------------------------------------------------
    
    public static int getEngineCounter() {
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

 
    //---------------------------------------------------------------
    // Instance Utility Methods
    //---------------------------------------------------------------
    
     public double engineScannerTorque(){
        
        return calculateTorque();
    }
    
     
     public double engineScannerHP(){
        
        return calculateHP();
    }
    
    
    private double calculateTorque(){
        
        final double  TORQUE_CONSTANT = 3.4;
        final double  CYLINDER_LOAD_FACTOR = 74.13;
        double torque = 0.0;


        torque = (CYLINDER_LOAD_FACTOR) * Math.pow((displacement / numberOfCylinders), 1.18) * Math.exp(.59*TORQUE_CONSTANT);


   
        return torque;
    }
    
    //------------------------------------------------
    
   
    
     private double calculateHP(){
         
         double hp = 0.0;
         hp = (Math.sqrt(Math.PI * 4700 * calculateTorque() / 33000)) * Math.pow(numberOfCylinders, 1.926);
  
        
        
        
// end Step 9 ---------------      
        return hp;
    }

    
 
 
    public void scan(String spacer){
        System.out.println("");
// Step 6 -----------------------
        // Use println and printf methods for the output and make sure your output is aligned
        // as shown below
        /*
        
        ----------------------------------------------
        Scanning Duramax
        ----------------------------------------------
        Displacement:		2.800      
        Number of Cylinders:	4          
        Fuel Type:                  Diesel     
        Serial Number:		GM-DMAX-OHIO-5500 
        MPG:			25.000    
        
        */
        // hint: 
        System.out.println(spacer + "----------------------------------------------");
        System.out.println(spacer + " Scanning Duramax");
        System.out.println(spacer + "----------------------------------------------");
        System.out.printf(spacer + "Displacement:\t\t %-10.3f \n", displacement);
        System.out.printf(spacer + "Number of Cylinders:\t %-10d \n", numberOfCylinders);
        System.out.printf(spacer + "Fuel Type:\t\t %-10s \n",fuelType);
        System.out.printf(spacer + "Serial Number: \t\t %10s \n", serialNumber);
        System.out.printf(spacer + "MPG: \t\t\t %-10.3f \n", mpg);
        System.out.printf(spacer + "Torque: \t\t %-10.3f \n", calculateTorque());
        System.out.printf(spacer + "Hp: \t\t\t %-10.3f \n", calculateHP());
        
       

        
// Step 10 -----------------------        
        // Use printf to output the torque and  hp values of the motor
        // see project instruction for the format of the output
        // YOUR CODE HERE
        
        
    
// end Step 10 -----------------------     


    }

}//end of class
