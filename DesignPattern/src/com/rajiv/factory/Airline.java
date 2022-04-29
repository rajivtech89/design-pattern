package com.rajiv.factory;

public abstract class Airline {
	String country;
	String flights;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFlights() {
		return flights;
	}

	public void setFlights(String flights) {
		this.flights = flights;
	}

	public void showAilrineDetails() {
		System.out.println("Airline belong to " + getCountry());
		System.out.println("Airline having flighst " + getFlights());
	}

}
