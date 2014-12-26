package stworo01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author stefan Tworogal
 *
 */
public class Control {

	public static void main(String[] args) {
		int floorCount = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the elevator simulator");
		System.out
				.println("Please enter the number of floors for the simulator");
		int floors = input.nextInt();
		System.out
				.println("Please enter the number of customers for the simulator");
		int numberOfCustomers = input.nextInt();
		Building hotel = new Building(floors, numberOfCustomers);

		/*
		 * Simple strategy each customer is taken to their destination, then
		 * elevator travels to next customer and tekes them to their desination
		 * this is continued until all customers are at their destinations.
		 */
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		for (int i = 0; i < hotel.getNumberOfCustomers(); i++) {
			int id = i + 100;
			int range = (hotel.getNumberOfFloors() - 0) + 1;
			int currentFloor = (int) (Math.random() * range);
			int destination = (int) (Math.random() * range);
			Customer person = new Customer(id, currentFloor, destination);
			customerList.add(person);
		}
		for (int i = 0; i < hotel.getNumberOfCustomers(); i++) {
			Customer tempCustomer = customerList.get(i);

			while (tempCustomer.getDestination() != hotel.getOne()
					.getCurrentFloor()) {
				if (tempCustomer.getDestination() == hotel.getOne()
						.getCurrentFloor()) {
					break;
				}
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
		System.out.println(floorCount + " floor travelled ");

		input.close();

	}

}
