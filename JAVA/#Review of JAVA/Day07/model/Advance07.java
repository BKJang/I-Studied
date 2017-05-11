package model;

public class Advance07 {
	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Marine m3 = new Marine();
		m1.hp -= 10;
		m2.upgrade++;
		
		System.out.println(m1.info());
		System.out.println(m2.info());
		System.out.println(m3.info());
		
		new Marine();//√ ±‚»≠
		m2.upgrade++;
		System.out.println(m1.info());
		System.out.println(m2.info());
		System.out.println(m3.info());
		
	}
}
