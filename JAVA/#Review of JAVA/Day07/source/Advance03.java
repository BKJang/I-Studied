package source;

import model.Pitcher;

public class Advance03 {
	public static void main(String[] args) {
		Pitcher p1 = new Pitcher("���쵧", 8, 6, 1);
		System.out.println(p1.info());
		//p1.win = 94; //Pitcher���� �ʵ�� �����ۿ����� public�� ����.
		System.out.println(p1.info());
		System.out.println(p1.currentWin());
		p1.changeWin(4);
		System.out.println(p1.info());
	}
}
