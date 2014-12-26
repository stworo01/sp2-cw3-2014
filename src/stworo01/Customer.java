package stworo01;

/**
 * @author stefan Tworogal
 *
 */
public class Customer {
	// instance variables
	private int ID;
	private int currentFloor;
	private int destination;
	private boolean inElevator;
	private boolean finished;

	// constructor
	public Customer(int iD, int currentFloor, int destination) {
		ID = iD;
		this.currentFloor = currentFloor;
		this.destination = destination;
		this.inElevator = false;
		this.finished = false;
	}

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @param iD
	 *            the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * @return the currentFloor
	 */
	public int getCurrentFloor() {
		return currentFloor;
	}

	/**
	 * @param currentFloor
	 *            the currentFloor to set
	 */
	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	/**
	 * @return the destination
	 */
	public int getDestination() {
		return destination;
	}

	/**
	 * @param destination
	 *            the destination to set
	 */
	public void setDestination(int destination) {
		this.destination = destination;
	}

	/**
	 * @return the inElevator
	 */
	public boolean isInElevator() {
		return inElevator;
	}

	/**
	 * @param inElevator
	 *            the inElevator to set
	 */
	public void setInElevator(boolean inElevator) {
		this.inElevator = inElevator;
	}

	/**
	 * @return the finished
	 */
	public boolean isFinished() {
		return finished;
	}

	/**
	 * @param finished
	 *            the finished to set
	 */
	public void setFinished(boolean finished) {
		this.finished = finished;
	}

}
