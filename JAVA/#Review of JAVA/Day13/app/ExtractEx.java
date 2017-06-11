package app;
import java.util.*;

class Player {
	String name;
	String team;
	public Player(String n, String t) {
		name = n;
		team = t;
	}
}

//=============================================================================
public class ExtractEx {
	public static void main(String[] args) {
		Player[] all = new Player[] {
			new Player("보우덴","두산"), new Player("해커", "NC"), new Player("김광현","SK" ), 
			new Player("장원준", "두산" ), new Player("니퍼트", "두산")
		};
		System.out.println( all.length );
		//===========================================================================
		// 총 몇팀으로 구성되있냐.
		Set<String> e = new TreeSet<String>();//제네릭 메서드
		
		for(int i=0; i<all.length; i++) {
			e.add(all[i].team);
		}
		System.out.println("총 : " +e.size() +"개 팀!");
		Object[] t1 = e.toArray();	// 가지고 있는 요소를 Object[]배열로 반환
		String[] t2 = new String[e.size()];
			e.toArray(t2);
		
		System.out.println(t2[0]);
		
		//============================================================================
		
	}
}





 