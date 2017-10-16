package models.room;

import utils.Occupacy;

public abstract class Room {
	private boolean wiFi;
	private Occupacy occupacy; 
	private int roomRate;
	private int daysBooked = 0;
	private int roomNummber;

	public boolean getWiFi() {
		return this.wiFi;
	}
	
	public Occupacy getOccupacy() {
		return this.occupacy;
	}
	
	public void setOccupacy(Occupacy occupacy) {
		this.occupacy = occupacy;
	}
	
	public int getRoomRate() {
		return this.roomRate;
	}
	
	public void setRoomRate(int roomRate) {
		this.roomRate = roomRate;
	}
	
}
