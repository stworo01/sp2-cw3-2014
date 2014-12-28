package stworo01;

/**
 * Software and Programming 2 Coursework 3 A class that simulates customer for
 * use in the elevator simulation.
 * 
 * @author stefan Tworogal
 * @version 28/12/2014
 */
public class Customer {
	// instance variables
	private int ID;
	private int currentFloor;
	private int destination;

	/**
	 * Constructs a instance of class customer. Takes parameters for the
	 * customers ID, their current florr and destination.
	 * 
	 * @param iD
	 * @param currentFloor
	 * @param destination
	 */
	public Customer(int iD, int currentFloor, int destination) {
		ID = iD;
		this.currentFloor = currentFloor;
		this.destination = destination;

	}

	/**
	 * Method that returns the customer ID
	 * 
	 * @return iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * Method that sets the customer ID
	 * 
	 * @param iD
	 * 
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * Method that returns the customer start location.
	 * 
	 * @return currentFloor
	 */
	public int getCurrentFloor() {
		return currentFloor;
	}

	/**
	 * Method that sets the customers start location
	 * 
	 * @param currentFloor
	 * 
	 */
	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	/**
	 * Method that returns the ciustomer destination.
	 * 
	 * @return destination
	 */
	public int getDestination() {
		return destination;
	}

	/**
	 * Method that sets the customers destination
	 * 
	 * @param destination
	 * 
	 */
	public void setDestination(int destination) {
		this.destination = destination;
	}

}
