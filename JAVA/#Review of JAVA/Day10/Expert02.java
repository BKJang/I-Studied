import format.*;

public class Expert02 {
	public static void main(String[] args) {
		Compare c = new TestCompare();
		boolean t = c.same(44, 44);
		System.out.println(t);
		
		boolean t2 = c.like(43, 41);		// 두 수의 차이가 5이하라면 트루가 뜨게
		System.out.println(t2);
	}
}
