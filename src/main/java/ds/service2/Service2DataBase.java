package ds.service2;

import java.util.ArrayList;

public class Service2DataBase {
	public static ArrayList<Desk> myDesks = new ArrayList<>();

	public ArrayList<Desk> getMyDesks() {
		return myDesks;
	}

	public static class Desk {
		// class variable:
		int deskNumber, deskHeight;
		String roomName;
		int minDeskHeight = 50, maxDeskHeight = 145;
		int chairHeight;
		int minChairHeight = 40, maxChairHeight = 125;

		// Constructor with parameters and using setter method that includes validation
		// for height:
		public Desk(String roomName, int deskNumber, int deskHeight, int chairHeight)
				throws IllegalDeskHeightException,IllegalChairHeightException {
			this.setRoomName(roomName);
			this.setDeskNumber(deskNumber);
			this.setDeskHeight(deskHeight);
			this.setChairHeight(deskHeight);
		}

		public int getDeskNumber() {
			return deskNumber;
		}

		public void setDeskNumber(int deskNumber) {
			this.deskNumber = deskNumber;
		}

		public int getDeskHeight() {
			return deskHeight;
		}

		public void setDeskHeight(int deskHeight) throws IllegalDeskHeightException {
			// check for the min and max heigth
			if (deskHeight >= minDeskHeight && deskHeight <= maxDeskHeight) {
				this.deskHeight = deskHeight;
			} else {
				// throw custom exception
				throw new IllegalDeskHeightException(this.minDeskHeight, this.maxDeskHeight);
			}

		}

		public String getRoomName() {
			return roomName;
		}

		public void setRoomName(String roomName) {
			this.roomName = roomName;
		}

		public int getMinDeskHeight() {
			return minDeskHeight;
		}

		public void setMinDeskHeight(int minDeskHeight) {
			this.minDeskHeight = minDeskHeight;
		}

		public int getMaxDeskHeight() {
			return maxDeskHeight;
		}

		public void setMaxDeskHeight(int maxDeskHeight) {
			this.maxDeskHeight = maxDeskHeight;
		}

		public int getChairHeight() {
			return chairHeight;
		}

		public void setChairHeight(int chairHeight) throws IllegalChairHeightException {
			// check for the min and max heigth
			if (chairHeight >= minChairHeight && chairHeight <= maxChairHeight) {
				this.chairHeight = chairHeight;
			} else {
				// throw custom exception
				throw new IllegalChairHeightException(this.minChairHeight, this.maxChairHeight);
			}
		}
	}
}
