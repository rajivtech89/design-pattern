package com.rajiv.factory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Press 1 for AirIndiaAirline ");
		System.out.println("Press 2 for LufthansaAirline ");
		System.out.println("Press 3 for EmiratesAirline ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (input < 0 || input > 3) {
			System.out.println("Invalid input");
		} else {
			Airline obj = AirlineFactory.createAirlineObject(AirlineType.values()[input-1]);
			obj.showAilrineDetails(); 

		}
	}
}
