
public class App01 {
	public static void main(String[] args) {
		// Hitter2라는 애가 아래와 같은 처리를 할 수 있게 설계
		Hitter2 h = new Hitter2();
			h.init("김문호", 33, 134, 56, 1);
			
			double d = h.average();
			
			System.out.println("d==" +d);
			
			String m = h.info();
			System.out.println(m);
			
			h.add(4, 2);
			System.out.println(h.info());
			
		Hitter2 h2 = new Hitter2();
			h2.init("유한준", 28, 99, 35, 4);
			System.out.println(h2.info());
			double dd = h2.average();
			System.out.println(dd);
	}
}
