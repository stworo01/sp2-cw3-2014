package stworo01;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the elevator simulator");
		System.out.println("Please enter the number of floors for the simulator");
		int floors = input.nextInt();
		Building hotel = new Building(floors, 2);

		// System.out.println("Please enter the number of Customers for the simulator");
		System.out.println("Elevator is at floor "
				+ hotel.getOne().getCurrentFloor());
		
		while ((hotel.getNumberOfFloors() >= hotel.getOne().getCurrentFloor()) 
				&& hotel.getOne().getCurrentFloor() >= 0) {
			
			if (hotel.getOne().getCurrentFloor() == hotel.getNumberOfFloors()) {
				hotel.getOne().setDirectionUp(false);
				hotel.getOne().move();
				System.out.println("moving to Floor "+hotel.getOne().getCurrentFloor());	
				
			} else {
			
			hotel.getOne().move();
			System.out.println("moving to Floor "+hotel.getOne().getCurrentFloor());	
			}
			input.close();

		}

	}

}
