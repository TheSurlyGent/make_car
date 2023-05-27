package tool;

import vehicle.Truck;


public class Analyzer {
    
    private static final String analyzerID = "AX_20102";
    
    private static Scanner scanner = new Scanner(analyzerID);

    public static Scanner getScanner() {
        return scanner;
    }


    public static String getAnalyzerID() {
        return analyzerID;
    }
    
}//end class
