package ds.service1;

public class IllegalDeskHeightException extends Exception{// we must inherit properties from exception class to be able to use it functionality
    //constructor that will pass exception message to the parent (exception class)
    public IllegalDeskHeightException(int minDeskHeight, int maxDeskHeight) {
        //this will overwrite the error message in the Exception class
        super("Unsupported desk height provided, must be within the range between "+minDeskHeight + " to " + maxDeskHeight);
    }
    
}
