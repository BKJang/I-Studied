package model;

public class Advance06 {
	public static void main(String[] args) {
		Calculate c = new Calculate();
		c.max(4, 1);
		c.max(4.41, 94.45);
		
		Calculate.max(1121, 156);//�޼��忡 static�� ���� ������ ���� ����� ������.
		Calculate.max(4.41, 894.23);
	}
	
}
