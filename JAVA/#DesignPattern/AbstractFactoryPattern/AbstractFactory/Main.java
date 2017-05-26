package AbstractFactory;

import GT.GtBikeFactory;
import Samcheonlee.SamFactory;

//자전거를 생성하는 공장
public class Main {
	public static void main(String[] args) {
		BikeFactory factory = new SamFactory();
		BikeFactory factory2 = new GtBikeFactory();
		
		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();
		
		Body body2 = factory2.createBody();
		Wheel wheel2 = factory2.createWheel();
		
		System.out.println(body.getClass());
		System.out.println(wheel.getClass());
		
		System.out.println(body2.getClass());
		System.out.println(wheel2.getClass());
	}
}
