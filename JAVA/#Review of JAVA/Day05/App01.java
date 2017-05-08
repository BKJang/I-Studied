public class App01 {
	public static void main(String[] args) {
		// new Hitter();
		// System.out.println(new Hitter());
		Hitter one = new Hitter();
			one.name = "김문호";
			one.game = 33;
			one.tot = 134;
			one.hit = 68;
			one.hr = 1;
		Hitter two;
			two = new Hitter();
			two.name = "양의지";
			two.game = 32;
			two.tot = 110;
			two.hit = 45;
			two.hr = 7;
		Hitter t = two;
		System.out.println(t.name+"/"+t.game+"/"+t.tot);	
	}
	// 타율 계산.. 처리를 메서드로 구현하고, 사용하게.. 설계
	// 이름, 필요한데이터형, 발생데이터 
	
	
	
}
