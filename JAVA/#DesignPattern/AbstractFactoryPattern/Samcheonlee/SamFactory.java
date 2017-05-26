package Samcheonlee;

import AbstractFactory.BikeFactory;
import AbstractFactory.Body;
import AbstractFactory.Wheel;

public class SamFactory implements BikeFactory {

	@Override
	public Body createBody() {
		return new SamBody();
	}

	@Override
	public Wheel createWheel() {
		return new SamWheel();
	}

}
