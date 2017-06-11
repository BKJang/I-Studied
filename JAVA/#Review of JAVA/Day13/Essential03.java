import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

import data.Ball;

public class Essential03 {
	public static void main(String[] args) {
		// 나머지 계열을 살펴보기전에.. 제너릭이란걸 배우고 넘어가자.
		// 컬렉션 계열의 클래스들은 1.2 버전부터 제공이 되던건데
		// 1.5버전때 추가된 문법이 있다. [ Generic ] , 
		// compiler 버전을 프로젝트 우클릭 프로퍼티 .. 들어가면 변경 가능
		// 저장할 객체타입을 지정할수 있다.
		Vector<Hero> li = new Vector<Hero>();
		Hero h1 = new Hero();
			li.add(h1);
			li.add(new Hero());
			Hero z =li.get(1);
			
			
		ArrayList<String> ms = new ArrayList<String>();
			ms.add("DSadsa");
			
		LinkedList<Integer> hs = new LinkedList<Integer>();
			hs.add(new Integer(45));
			int m = 43;
			Integer ii = new Integer(m);
			hs.add(ii);
			hs.add(5);
			System.out.println(hs.get(2).getClass());
			
			
	}
	
}
//======================================
class Hero {
	
}