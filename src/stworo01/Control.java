package stworo01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class that sets up the elevator simulation and carries out two elevator
 * strategies,
 * 
 * @author stefan Tworogal
 * @version 28/12/2014
 */
public class Control {
	/**
	 * main method gets user input for number of floors and number of custoemr
	 * for Building, Elevator and Customer classes.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int floorCount = 0;
		int floorCount2 = 0;
		Scanner input = new Scanner(System.in);

		// Get user input for number of floors and number of customers
		System.out.println("Welcome to the elevator simulator");
		System.out
				.println("Please enter the number of floors for the simulator");
		int floors = input.nextInt();
		System.out
				.println("Please enter the number of customers for the simulator");
		int numberOfCustomers = input.nextInt();
		Building hotel = new Building(floors, numberOfCustomers);

		// populate customer list with random current floor and destination.
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		for (int i = 0; i < hotel.getNumberOfCustomers(); i++) {
			int id = i + 100;
			int range = (hotel.getNumberOfFloors() - 0) + 1;
			int currentFloor = (int) (Math.random() * range);
			if (currentFloor == 13) { // deal with no floor 13.
				currentFloor++;
			}
			int destination = (int) (Math.random() * range);
			if (destination == 13) { // deal with no floor 13.
				destination++;
			}
			Customer person = new Customer(id, currentFloor, destination);
			customerList.add(person);
		}

		/*
		 * Simple strategy each customer is taken to their destination, then
		 * elevator travels to next customer and takes them to their desination
		 * this is continued until all customers are at their destinations.
		 */

		for (int i = 0; i < hotel.getNumberOfCustomers(); i++) {
			Customer tempCustomer = customerList.get(i);
			// get elevator to next customer current location.
			while (tempCustomer.getCurrentFloor() != hotel.getOne()
					.getCurrentFloor()) {
				if (tempCustomer.getCurrentFloor() < hotel.getOne()
						.getCurrentFloor()) {
					hotel.getOne().setDirectionUp(false);
					hotel.getOne().move();
					floorCount++;
				}
				if (tempCustomer.getCurrentFloor() > hotel.getOne()
						.getCurrentFloor()) {
					hotel.getOne().setDirectionUp(true);
					hotel.getOne().move();
					floorCount++;
				}
			}
			// Take customer to destination
			while (tempCustomer.getDestination() != hotel.getOne()
					.getCurrentFloor()) {

				if (tempCustomer.getDestination() > hotel.getOne()
						.getCurrentFloor()) {
					hotel.getOne().setDirectionUp(true);
					hotel.getOne().move();
					floorCount++;
				}
				if (tempCustomer.getDestination() < hotel.getOne()
						.getCurrentFloor()) {
					hotel.getOne().setDirectionUp(false);
					hotel.getOne().move();
					floorCount++;
				}
				if (tempCustomer.getDestination() == hotel.getOne()
						.getCurrentFloor()) {
					break;
				}
			}
			System.out.println("Customer " + tempCustomer.getID()
					+ " is at destination");

		}
		System.out.println("Number of floors travelled for scheme 1 is "
				+ floorCount);

		/*
		 * Strategy 2: The elevator gets the destination from the customer takes
		 * the customer to the required floor, then returns to the ground floor
		 * and gets the next customer.
		 */
		for (int i = 0; i < hotel.getNumberOfCustomers(); i++) {
			Customer tempCustomer = customerList.get(i);
			while (tempCustomer.getDestination() > hotel.getOne()
					.getCurrentFloor()) {
				hotel.getOne().setDirectionUp(true);
				hotel.getOne().move();
				floorCount2++;
			}
			while (tempCustomer.getDestination() < hotel.getOne()
					.getCurrentFloor()) {
				hotel.getOne().setDirectionUp(false);
				hotel.getOne().move();
				floorCount2++;
			}
			if (tempCustomer.getDestination() == hotel.getOne()
					.getCurrentFloor()) {
				hotel.getOne().setDirectionUp(false);
				// take elevator to ground floor
				while (hotel.getOne().getCurrentFloor() > 0) {
					hotel.getOne().move();
					floorCount2++;
				}
			}
			System.out.println("Customer " + tempCustomer.getID()
					+ " is at destination");
		}
		System.out.println("Number of floors travelled for scheme 2 is "
				+ floorCount2);

		// simple analysis
		if (floorCount > floorCount2) {
			int total = floorCount - floorCount2;
			System.out.println("Scheme 1 travels to " + total
					+ " more floors than scheme 2");
		} else {
			int total = floorCount2 - floorCount;
			System.out.println("Scheme 2 travels to " + total
					+ " more floors than scheme 1");
		}
		input.close();
	}

}
