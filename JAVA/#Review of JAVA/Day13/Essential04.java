import java.util.*;

// Set 계열 - 해당클래스가 처리하고 하는 방식대로 알아서 정렬, 
		// 중복 객체를 다 걸러낸다. (저장안함)
		// 특정 요소 하나를 가지고 오는 메서드가 없음.

public class Essential04 {
	public static void main(String[] args) {
		// 실제 구현된 클래스들은 꽤 많이 있다.
		Set hs = new HashSet();	// hashCode 를 비교하면서 정렬
		Set lhs = new LinkedHashSet();	// 순서가 유지되는 Set
		Set ts = new TreeSet();	// compareTo 를 비교하면서 정렬
		// =====================================================
		// boolean isEmpty()
		System.out.println(hs.isEmpty());
		System.out.println(ts.isEmpty());
		System.out.println(lhs.isEmpty());
		// boolean add(E e)
		String t = "chopper";
		String m = "luffy";
		ts.add("zoro");
		ts.add("nami");
		ts.add(m);
		ts.add(m);
		ts.add(m);
		ts.add(m);
		ts.add(m);
		ts.add("luffy");
		// boolean size();	
		System.out.println(ts.size());
		// boolean contains(E e)
		boolean f = ts.contains(m);
		System.out.println(f);
		// boolean remove(Object o)
		System.out.println( ts.toString() );
		
		// Object[] toArray()
		
	}
}
