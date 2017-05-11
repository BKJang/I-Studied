package model;//같은 패키지에 Visible이 있기 때문에 다 쓸 수가 있는 것
			  //다른 패키지에 같은 내용을 입력하면 오류 뜸.

public class Advance01 {
	public static void main(String[] args) {
		new Visible();
		Visible s = new Visible(3, "시야");
		System.out.println(s.num);
		s.str = "메롱";
		s.show(11);
		s.hide("!!");
	}
}
