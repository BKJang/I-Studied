import data.SuperPitcher;
import data.Ball;

public class Expert03 {
	public static void main(String[] args) {
		// Pitcher를 수정하지 말고
		SuperPitcher sp = new SuperPitcher("김광현", 1);
			//생성될 수 있게 SuperPitcher에다가 생성자 구현
		
		//원래 Pitcher 안에는 이름이랑 체력을 문자열로 만들어주는 기능이 있다.
		//자신있는공까지도 포함해서 문자열로 만들어주는 기능을 추가.
		String st = sp.status();
		System.out.println(st);
		//원래 Pitcher 안에는 이름이랑 체력을 문자열로 만들어주는 기능이 있다.
		//자신있는공까지도 포함해서 문자열로 만들어주는 기능을 추가.
		String m = sp.detailStatus();
		System.out.println(m);
		Ball t = sp.pitching(1);
		System.out.println(sp.detailStatus());
	}
}
