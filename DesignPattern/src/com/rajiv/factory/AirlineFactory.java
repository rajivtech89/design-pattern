package com.rajiv.factory;

public class AirlineFactory {

	public static Airline createAirlineObject(AirlineType type) {

		switch (type) {
		case AirIndiaAirline:
			return new AirIndiaAirline();
		case LufthansaAirline:
			return new LufthansaAirline();
		case EmiratesAirline:
			return new EmiratesAirline();
		default:
			return null;
		}
	}
}
