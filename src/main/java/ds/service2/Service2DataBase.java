package ds.service2;

import java.util.HashMap;

import ds.service1.IllegalDeskHeightException;

public class Service2DataBase {

	public static class Desk {
		int deskNumber, deskHeight;
		String roomName;
		int minDeskHeight = 50, maxDeskHeight = 145;

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
				//throw custom exception
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

	}
}
