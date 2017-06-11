import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import javax.management.relation.RoleList;

import data.Ball;

// 데이터 저장용도의 클래스 (컬렉션) - 제공되는 클래스들은 수십가지가 넘는다.
	// 그 클래스들은 그룹이 지어진다. (대표 인터페이스들이 몇가지가 있고, 그걸 구현시켜둔 방식이라서) 
// 자주 쓰이는 계열(그룹)
	// List 계열 - 차례대로 저장을 해주고, 중복데이터도 다 처리를 해준다.
	// Set 계열 - 해당클래스가 처리하고 하는 방식대로 알아서 정렬, 중복데이터도 다 걸러낸다.
	// Map 계열 - 데이터저장을 이름(키)을 붙여서 저장시키고, 이름을 통해서 재확보를 할수 있다.

public class Essential02 {
	public static void main(String[] args) {
		// List .. 
		// 실제 구현클래스 - Vector, ArrayList, LinkedList 등등
		List v = new Vector();	// 
		List ar = new ArrayList();		//이걸 주로 쓰게 됨  ★ <--- 
		List li = new LinkedList();
		List rl = new RoleList();		// ctrl+shift+o : 스마트 import
		List st = new Stack();
		// =====================================================================
		// int  size()   ==> 저장개수
		// boolean add(Object) ==> 저장시키는 (기본이 맨마지막요소로)
		// void add(int , Obejct) ==> (위치를 지정해서 추가, 나머진 자동으로 변화가 일어남)
		System.out.println(st.size());
		
		Ball t = new Ball();
		ar.add(t);
		ar.add(t);
		ar.add( new Ball() );
		ar.add("아무거나");
		ar.add(st);
		System.out.println(ar.size());
		
		// boolean contains(Object )
		boolean f =ar.contains("아무거나!");
		System.out.println(f);
		// Object get(int) ..
//		ar.add(2, new Date());
		Object g = ar.get(2);
		Date dt = (Date)g;
		dt.getTime();
		
		System.out.println(g.getClass());
		// boolean isEmpty() : size가 0이냐 아니냐
		// int indexOf(Object)  : String의 indexOf를 떠올리면
		// int lastIndexOf(Object ) : "
		// Object remove(int ) : 해당 번호를 지우고, 객체값이 튕겨져 나옴. 
		Object o = ar.remove(3);
		System.out.println(ar.size());
		// List subList(int, int)
		
		Object[] all =ar.toArray();
		
	}
}







