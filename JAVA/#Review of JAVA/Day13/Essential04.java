import java.util.*;

// Set �迭 - �ش�Ŭ������ ó���ϰ� �ϴ� ��Ĵ�� �˾Ƽ� ����, 
		// �ߺ� ��ü�� �� �ɷ�����. (�������)
		// Ư�� ��� �ϳ��� ������ ���� �޼��尡 ����.

public class Essential04 {
	public static void main(String[] args) {
		// ���� ������ Ŭ�������� �� ���� �ִ�.
		Set hs = new HashSet();	// hashCode �� ���ϸ鼭 ����
		Set lhs = new LinkedHashSet();	// ������ �����Ǵ� Set
		Set ts = new TreeSet();	// compareTo �� ���ϸ鼭 ����
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
