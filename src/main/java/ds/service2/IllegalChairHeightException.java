package ds.service2;

public class IllegalChairHeightException extends Exception{// we must inherit properties from exception class to be able to use it functionality
    //constructor that will pass exception message to the parent (exception class)
    public IllegalChairHeightException(int minChairHeight, int maxChairHeight) {
        //this will overwrite the error message in the Exception class
        super("Unsupported desk height provided, must be within the range between "+minChairHeight + " to " + maxChairHeight);
    }
}
