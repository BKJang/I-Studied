package Linux02;

import AbstractFactory02.Button;

public class LinuxButton implements Button {

	@Override
	public void click() {
		System.out.println("������ Ŭ��");
	}
}