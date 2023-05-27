// COP2210 - FALL 2020 - Project 1
package vehicle;

import java.util.Random;
import motor.Duramax;
import motor.V6;


public class Truck {
    
    private static int numberOfCarCreated = 0;
    private static int nextNumberID = 1000;
    private static final String VIN_CONSTANT = "VIN-";
    
    private String model;
    private int mileage;
    private double newPrice;
    private int yearBuild;
    private Duramax duramaxMotor;
    private V6 v6Motor;
    private String vin;
    private String lastServiceDate;
    
    //------------------------------------------------
    
    public Truck(){
        
        
       
        Random rndGen = new Random();
               
 // Step 19 -----------------------
 
        // use the rndGen object to generate a randon value for
        // mileage with has the range 0 - 12000 (be careful here)
        // newPrice with a range of 25000 - 40000
        // YOUR CODE HERE
        mileage = rndGen.nextInt(12001);
        newPrice = rndGen.nextInt(15001) + 25000; 
        
        // set the model instance variable to "NA"
        // YOUR CODE HERE
        model = "NA";
        
        // set the duramaxMotor instance variable to null
        // YOUR CODE HERE
        duramaxMotor = null;
        
        // set the v6Motor instance variable to a new V6 object using the default constructor
        // YOUR CODE HERE
        v6Motor = new V6();
        
        // set the yearBuild instance variable to 2020
        // YOUR CODE HERE
        yearBuild = 2020;
        
        // set the vin instance variable to "NA"
        // YOUR CODE HERE
        vin = "NA";
        
        // set the lastServiceDate instance variable to "NA"
        // YOUR CODE HERE
        lastServiceDate = "NA";
        
        
        // increment the class variable  numberOfCarCreated by 1
        // YOUR CODE HERE
        numberOfCarCreated ++;
        
// end Step 19 -----------------------    

    }
    
    //------------------------------------------------
   public Truck(String model, Duramax duramax){
 
// Step 20 -----------------------
       // call the default constructor
       // YOUR CODE HERE
       this();
       
       // set the model instance variable to the input variable model value
       // YOUR CODE HERE
       this.model = model;
       
       // set the duramaxMotor instance variable to the input variable duramaxMotor value
       // YOUR CODE HERE
        duramaxMotor = duramax;
        
       // set the v6Motor instance variable to null
       // YOUR CODE HERE
        v6Motor = null;
       
       // set the vin instance variable to the addition of the following:
       // VIN_CONSTANT, model , "-" , yearBuild, "-" and the input duramax variable serialNumber
       // YOUR CODE HERE
        vin = VIN_CONSTANT + model + "-" + yearBuild + "-" + duramax.getSerialNumber();
        
 // end Step 20 -----------------------
   }
   
   //------------------------------------------------
    public Truck(String model, Duramax duramax, int yearBuild){
 
// Step 21 -----------------------
       
       // call the correct constructor with the constructor  inputs model and duramax variables
       // hint use this.....
       // YOUR CODE HERE
       this(model, duramax);
       
       // set the yearBuild instance variable to the input variable yearBuild value
       // YOUR CODE HERE
       this.yearBuild = yearBuild;
       
       // set the vin instance variable to the addition of the following:
       // VIN_CONSTANT, model , "-" , yearBuild, "-" and the input duramax variable serialNumber
       // YOUR CODE HERE
       vin = VIN_CONSTANT + model + "-" + yearBuild + "-" + duramax.getSerialNumber();
       
        Random rndGen = new Random();
       
        if(yearBuild <= 2019 || yearBuild > 2015 ){
            // use the rndGen object to generate a randon value for
            // mileage with has the range 0 - 175000 (be careful here)
            // YOUR CODE HERE
            mileage = rndGen.nextInt(175001);
        }//end if
        
        if(yearBuild <= 2015 || yearBuild >= 2010 ){
            // use the rndGen object to generate a randon value for
            // mileage with has the range 60000 - 500000 (be careful here)
            // YOUR CODE HERE
            mileage = rndGen.nextInt(440001) + 60000;
        }//end if
        
        
         // Question why did we not set the newPrice here.......
         
// end Step 21 -----------------------       
         
   }
   
   //------------------------------------------------
   public Truck(String model, V6 v6, int yearBuild){
  
// Step 22 ----------------------- 

       // call the default constructor
       // YOUR CODE HERE
        this();
        
        
       // set the yearBuild instance variable to the input variable yearBuild value
       // YOUR CODE HERE
     
        this.yearBuild = yearBuild;
        
       // set the model instance variable to the input  variable model value
       // YOUR CODE HERE
      this.model = model;
       
        Random rndGen = new Random();

        // set the vin instance variable to addition of the following:
        // VIN_CONSTANT, model, "-" , yearBuild ,"-" , v6 serial number
        // YOUR CODE HERE
vin = VIN_CONSTANT + model + "-" + yearBuild + "-" + v6.getSerialNumber();

        
        if(yearBuild <= 2019 || yearBuild > 2015 ){
            // use the rndGen object to generate a randon value for
            // mileage with has the range 0 - 150000 (be careful here)
            // YOUR CODE HERE
         
        }//end if
        
        if(yearBuild <= 2015 || yearBuild >= 2010 ){
            // use the rndGen object to generate a randon value for
            // mileage with has the range 60000 - 410000 (be careful here)
            // YOUR CODE HERE
           
        }//end if

// end Step 22 -----------------------         
        
   }

    public static int getNumberOfCarCreated() {
        return numberOfCarCreated;
    }

    public static int getNextNumberID() {
        return nextNumberID;
    }

    public static String getVIN_CONSTANT() {
        return VIN_CONSTANT;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public double getNewPrice() {
        return newPrice;
    }

    public int getYearBuild() {
        return yearBuild;
    }

    public Duramax getDuramaxMotor() {
        return duramaxMotor;
    }

    public V6 getV6Motor() {
        return v6Motor;
    }

    public String getVin() {
        return vin;
    }

    public String getLastServiceDate() {
        return lastServiceDate;
    }

    public void setLastServiceDate(String lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }
   

   //------------------------------------------------
   
     public void scan(){
        
        System.out.println("");
        System.out.println("----------------------------------------------");
        System.out.println(" Scanning Truck");
        System.out.println("----------------------------------------------");
        System.out.printf("Model:\t\t %-10s \n",  model);
        System.out.printf("Year Build:\t %-10d \n",  yearBuild);
        System.out.printf("Mileage:\t %-10d \n",  mileage);
        System.out.printf("VIN:\t\t %-10s \n",  vin);
        
        System.out.println("");
        
        if(duramaxMotor != null){
            duramaxMotor.scan("\t");
        }//end if
        
        if(v6Motor != null){
            v6Motor.scan("\t");
        }//end if
        
  
    }
   
}//end class
