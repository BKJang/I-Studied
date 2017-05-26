package Windows02;

import AbstractFactory02.Button;

public class WinButton implements Button {

	@Override
	public void click() {
		System.out.println("윈도우 클릭");
	}

}
