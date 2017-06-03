import format.TestUnit;
import format.Unit;

public class Expert01 {
	public static void main(String[] args) {
		Unit u = new TestUnit("테스트");	// null 설정은 , 아무것도 연결이 안되있는 사황
		 
		// 연결이 안되있는 상황에서 타고 들어가서 접근하면 문제가 발생.
		int t = -3;
		if(u.possible(t)) {
			u.move(t);
			System.out.println(u.info());
		}else {
			System.out.println("이동 불가능!");
		}
		
	}
}
