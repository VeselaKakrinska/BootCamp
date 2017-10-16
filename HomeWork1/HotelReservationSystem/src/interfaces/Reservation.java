package interfaces;

import utils.Occupacy;

public interface Reservation {
	public Occupacy changeOccupiedStatus ();
	public String makeReservationint( int roomRate, int days);
	public boolean cancelReservation();
	public boolean bookRoom(int roomNummber, int days);	
}
