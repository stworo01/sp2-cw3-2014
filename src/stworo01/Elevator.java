package stworo01;

/**
 * Software and Programming 2 Coursework 3 A class that simulates the Elevator
 * for the Building
 * 
 * @author stefan Tworogal
 * @version 28/12/2014
 */
public class Elevator {
	// instance variables
	private int numberOfFloors;
	private int currentFloor;
	private boolean isDirectionUp;

	/**
	 * Constructs a instance of Class Elevator. It takes input numberOfFloors
	 * and sets the current floor to 0 and isDirectionUp to true.
	 * 
	 * @param numberOfFloors
	 */
	public Elevator(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
		this.currentFloor = 0;
		this.isDirectionUp = true;
	}

	/**
	 * Method returns the number of floors that the elevator operates on.
	 * 
	 * @return numberOfFloors
	 */
	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	/**
	 * Method sets the number of floors that the elevator operates on.
	 * 
	 * @param numberOfFloors
	 *            `
	 */
	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

	/**
	 * Method returns the current floor of the elevator.
	 * 
	 * @return currentFloor
	 */
	public int getCurrentFloor() {
		return currentFloor;
	}

	/**
	 * Method sets the current floor of the elevator.
	 * 
	 * @param currentFloor
	 * 
	 */
	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	/**
	 * Method return the boolean value for isDirectionUp, which is used to
	 * control the direction of the elevator.
	 * 
	 * @return isDirectionUp
	 */
	public boolean isDirectionUp() {
		return isDirectionUp;
	}

	/**
	 * Method that sets the boolean variable isDirectionUp
	 * 
	 * @param isDirectionUp
	 * 
	 */
	public void setDirectionUp(boolean isDirectionUp) {
		this.isDirectionUp = isDirectionUp;
	}

	/**
	 * Method that controls the movement of the elevator. It increments current
	 * floor up or down, dependent of the value of isDirectionUp.
	 */
	public void move() {
		if (isDirectionUp) {
			this.currentFloor++;
		} else {
			this.currentFloor--;
		}
	}

}
