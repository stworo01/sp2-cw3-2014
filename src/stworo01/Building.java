/**
 * 
 */
package stworo01;

/**
 * @author stefan01
 *
 */
public class Building {
	// instance variables
			private int numberOfFloors;
			private int numberOfCustomers;
			private Elevator one;

			public Building(int numberOfFloors, int numberOfCustomers) {
				super();
				this.numberOfFloors = numberOfFloors;
				this.numberOfCustomers = numberOfCustomers;
				this.setOne(new Elevator(numberOfFloors));
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
				return one;
			}
			public void setOne(Elevator one) {
				this.one = one;
			}



}
