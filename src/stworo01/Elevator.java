/**
 * 
 */
package stworo01;

/**
 * @author stefan01
 *
 */
public class Elevator {
	// instance variables
	private int numberOfFloors;
	private int currentFloor;
	private boolean isDirectionUp;

	// constructor
	public Elevator(int numberOfFloors) {
		this.numberOfFloors = 0;
		this.currentFloor = 0;
		this.isDirectionUp = true;
	}

	/**
	 * @return the numberOfFloors
	 */
	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	/**
	 * @param numberOfFloors
	 *            the numberOfFloors to set
	 */
	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
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
	 * @return the isDirectionUp
	 */
	public boolean isDirectionUp() {
		return isDirectionUp;
	}

	/**
	 * @param isDirectionUp
	 *            the isDirectionUp to set
	 */
	public void setDirectionUp(boolean isDirectionUp) {
		this.isDirectionUp = isDirectionUp;
	}

	public void move() {
		if (isDirectionUp) {
			currentFloor++;
		} else {
			currentFloor--;
		}
	}
	
	
	
	

}
