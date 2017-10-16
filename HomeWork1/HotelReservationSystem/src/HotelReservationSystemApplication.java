
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import core.Engine;

public class HotelReservationSystemApplication {

	public static void main(String[] args) {
		BasicConfigurator.configure();
		
		Engine engine = new Engine();
		engine.run();

	}
	


}
