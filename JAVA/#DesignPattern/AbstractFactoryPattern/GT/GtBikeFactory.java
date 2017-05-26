package GT;

import AbstractFactory.BikeFactory;
import AbstractFactory.Body;
import AbstractFactory.Wheel;

public class GtBikeFactory implements BikeFactory {

	@Override
	public Body createBody() {
		return new GtBody();
	}

	@Override
	public Wheel createWheel() {
		return new GtWheel();
	}

}
