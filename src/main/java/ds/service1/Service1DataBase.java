package ds.service1;

import java.util.ArrayList;

public class Service1DataBase {
	protected static ArrayList<RoomName> myRooms = new ArrayList<>();
	
	

	public ArrayList<RoomName> getMyRooms() {
        return myRooms;
    }

	public static class RoomName {
		private String roomName;
		private double currentHumidity, currentTempInCelcius;
		private double desiredHumidity,desiredTempInCelcius;
		
		//Constructor
		public RoomName(String roomName, double currentHumidity, double currentTempInCelcius) {
            this.roomName = roomName;
            this.currentHumidity = currentHumidity;
            this.currentTempInCelcius = currentTempInCelcius;
            //default values of desired levels, user can also change it in grpc desiredSettingHVAC
            this.desiredHumidity = 55;
            this.desiredTempInCelcius = 21;
        }
		public String getRoomName() {
            return roomName;
        }

        public double getCurrentHumidity() {
            return currentHumidity;
        }

        public double getCurrentTempInCelcius() {
            return currentTempInCelcius;
        }
        public void setCurrentHumidity(double currentHumidity) {
            this.currentHumidity = currentHumidity;
        }

        public void setCurrentTempInCelcius(double currentTempInCelcius) {
            this.currentTempInCelcius = currentHumidity;
        }
        public double getDesiredHumidity() {
            return desiredHumidity;
        }

        public double getDesiredTempInCelcius() {
            return desiredTempInCelcius;
        }

        public void setDesiredHumidity(double desiredHumidity) {
            this.desiredHumidity = desiredHumidity;
        }

        public void setDesiredTempInCelcius(double desiredTempInCelcius) {
            this.desiredTempInCelcius = desiredTempInCelcius;
        }
	}

}
