package core;

import java.util.Scanner;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Engine {

	public Scanner scanner;

	static {
		init();
	}
	private final static Logger logger = Logger.getLogger(Engine.class);

	public void run() {

		// Logger logger = Logger.getLogger(Engine.class);
		logger.info("this is a sample log message.");

		scanner = new Scanner(System.in);
		// PropertyConfigurator.configure("log4j.xml");

		System.out.println("Wellcome! Please choose the nummber of some of the following options:"
				+ "1. Indicate the room type that needs to be booked"
				+ "2. Indicate the occupancy (single/double) in that category.");

		String decision = scanner.nextLine();

		switch (decision) {
		case "1":
			System.out.println("What kind of room do you want?");
			break;
		case "2":
			System.out.println("Do you need single or double room?");
			break;
		default:
			System.out.println("Please choose from the following options.");
		}
	}

	private static void init() {
		PropertyConfigurator.configure("log4j.xml");
	}
}
