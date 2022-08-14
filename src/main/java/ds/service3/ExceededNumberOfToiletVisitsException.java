package ds.service3;

public class ExceededNumberOfToiletVisitsException extends Exception{// we must inherit properties from exception class to be able to use it functionality
    //constructor that will pass exception message to the parent (exception class)
	int numberOfVisits,maxNumberOfVisits;
    public ExceededNumberOfToiletVisitsException(int numberOfVisits, int maxNumberOfVisits) {
    	
        //this will overwrite the error message in the Exception class
        super("Number of toilet visit was exceeded, currently there was: "+numberOfVisits + " while only " + maxNumberOfVisits + "is allowed. Cleaning is needed");
        this.numberOfVisits = numberOfVisits;
    	this.maxNumberOfVisits = maxNumberOfVisits;
    }
	public int getNumberOfVisits() {
		return numberOfVisits;
	}
	public void setNumberOfVisits(int numberOfVisits) {
		this.numberOfVisits = numberOfVisits;
	}
	public int getMaxNumberOfVisits() {
		return maxNumberOfVisits;
	}
	public void setMaxNumberOfVisits(int maxNumberOfVisits) {
		this.maxNumberOfVisits = maxNumberOfVisits;
	}
    
}
