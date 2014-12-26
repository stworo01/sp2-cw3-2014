package stworo01;

/**
 * 
 * @author stefan Tworogal
 *
 */
public class Building {
	// instance variables
	private int numberOfFloors;
	private int numberOfCustomers;
	private Elevator elevator;

	public Building(int numberOfFloors, int numberOfCustomers) {
		super();
		this.numberOfFloors = numberOfFloors;
		this.numberOfCustomers = numberOfCustomers;
		this.setElevator(new Elevator(numberOfFloors));
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
	 * @return the numberOfCustomers
	 */
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	/**
	 * @param numberOfCustomers
	 *            the numberOfCustomers to set
	 */
	public void setNumberOfCustomers(int numberOfCustomers) {
		this.numberOfCustomers = numberOfCustomers;
	}

	public Elevator getOne() {
		return elevator;
	}

	public void setElevator(Elevator elevator) {
		this.elevator = elevator;
	}

}
