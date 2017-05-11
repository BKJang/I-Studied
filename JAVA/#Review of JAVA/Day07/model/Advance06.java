package model;

public class Advance06 {
	public static void main(String[] args) {
		Calculate c = new Calculate();
		c.max(4, 1);
		c.max(4.41, 94.45);
		
		Calculate.max(1121, 156);//메서드에 static을 쓰면 다음과 같이 사용이 편해짐.
		Calculate.max(4.41, 894.23);
	}
	
}
