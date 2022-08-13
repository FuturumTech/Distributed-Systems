package ds.service3;

import java.util.ArrayList;

public class Service3DataBase {
	public static ArrayList<Toilet> myToilets = new ArrayList<>();

	public ArrayList<Toilet> getMyToilets() {
		return myToilets;
	}

	// nested class:
	public static class Toilet {
		int numberOfVisits;
		String toiletName;
		String toiletCleanedDateAndTime;
		String toiletLastEnterDateAndTime;
		 int maxNumberOfVisits, minNumberOfVisits;
		 boolean needsCleaning;

		// Constructor with parameters
		public Toilet(String toiletName, int numberOfVisits, String toiletCleanedDateAndTime) {
			setNumberOfVisits(numberOfVisits);
			setToiletName(toiletName);
			setToiletCleanedDateAndTime(toiletCleanedDateAndTime);
			// assuming default parameters:
			this.minNumberOfVisits = 0;
			this.maxNumberOfVisits = 25;
			this.toiletLastEnterDateAndTime = "Non used yet";
			//in case the toiltet is created with a number of visits bigger than max
			if(this.numberOfVisits < maxNumberOfVisits) {
				this.needsCleaning = false;
			}else this.needsCleaning = true;
		}

		public int getNumberOfVisits() {
			return numberOfVisits;
		}

		public void setNumberOfVisits(int numberOfVisits) {
			this.numberOfVisits = numberOfVisits;
		}

		public String getToiletName() {
			return toiletName;
		}

		public void setToiletName(String toiletName) {
			this.toiletName = toiletName;
		}

		public String getToiletCleanedDateAndTime() {
			return toiletCleanedDateAndTime;
		}

		public void setNeedsCleaning(boolean needsCleaning) {
			this.needsCleaning = needsCleaning;
		}

		public boolean getNeedsCleaning() {
			return needsCleaning;
		}
		
		
		public void setToiletCleanedDateAndTime(String toiletCleanedDateAndTime) {
			this.toiletCleanedDateAndTime = toiletCleanedDateAndTime;
		}

		public int getMaxNumberOfVisits() {
			return maxNumberOfVisits;
		}

		public void setMaxNumberOfVisits(int maxNumberOfVisits) {
			this.maxNumberOfVisits = maxNumberOfVisits;
		}
		public String getToiletLastEnterDateAndTime() {
			return toiletLastEnterDateAndTime;
		}

		public void setToiletLastEnterDateAndTime(String toiletLastEnterDateAndTime) {
			this.toiletLastEnterDateAndTime = toiletLastEnterDateAndTime;
		}

		public int getMinNumberOfVisits() {
			return minNumberOfVisits;
		}

		public void setMinNumberOfVisits(int minNumberOfVisits) {
			this.minNumberOfVisits = minNumberOfVisits;
		}
	}
}