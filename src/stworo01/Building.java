package stworo01;

/**
 * Software and Programming 2
 * Coursework 3
 * A class that simulates a building with a elevator and a number of customers.
 * @author stefan Tworogal
 * @version 28/12/2014
 */
public class Building {
	// instance variables
	private int numberOfFloors;
	private int numberOfCustomers;
	private Elevator elevator;
	
	/**
	 * Constructs an instance of class Building
	 */
	public Building(int numberOfFloors, int numberOfCustomers) {
		super();
		this.numberOfFloors = numberOfFloors;
		this.numberOfCustomers = numberOfCustomers;
		this.setElevator(new Elevator(numberOfFloors));
	}

	/**
	 * Method returns the number of floors in the building
	 * @return numberOfFloors
	 */
	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	/**
	 * method sets the number of floors in the building
	 * @param numberOfFloors
	 *           
	 */
	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

	/**
	 * Method returns the number of customers in the building
	 * @return numberOfCustomers
	 */
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	/**
	 * Method sets the number of customers in the building
	 * @param numberOfCustomers
	 *            
	 */
	public void setNumberOfCustomers(int numberOfCustomers) {
		this.numberOfCustomers = numberOfCustomers;
	}
	/**
	 * Method that returns the Elevator object related to the building
	 * @return elevator
	 */
	public Elevator getOne() {
		return elevator;
	}
	/** 
	 * Method sets Elevator Object to current elevator
	 * @param elevator
	 */
	public void setElevator(Elevator elevator) {
		this.elevator = elevator;
	}

}
