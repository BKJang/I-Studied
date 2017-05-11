package source;

import model.Pitcher;

public class Advance03 {
	public static void main(String[] args) {
		Pitcher p1 = new Pitcher("보우덴", 8, 6, 1);
		System.out.println(p1.info());
		//p1.win = 94; //Pitcher에서 필드는 제한작용으로 public을 없앰.
		System.out.println(p1.info());
		System.out.println(p1.currentWin());
		p1.changeWin(4);
		System.out.println(p1.info());
	}
}
