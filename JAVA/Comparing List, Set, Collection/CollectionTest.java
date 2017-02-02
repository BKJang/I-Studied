import java.util.*;
/**객체들을 비 연속적으로(크기를 정할 수 없다), 관리는 업무에서(DAO) - 중복 or 순서 체크할건지 결정 아직 못했어요*/
public class CollectionTest {
	/**입력 - Collection
	 * 처리
	 * 출력 - 출력해서 줄거에요 아니면 return을 해줄거에요?? Collection으로 return(UI가 없으니까)*/
	static Collection getObject(Collection c){
		Collection result = c;
		
		System.out.println(c.add("hello"));
		System.out.println(c.add(new String("hello")));
		System.out.println(c.add(1234)); 
		System.out.println(c.add(new Integer(1234))); 
		System.out.println(c.add(new Login("userid", "userpasswd")));
		System.out.println(c.add("hello"));
		System.out.println(c.add(new String("hello")));
		System.out.println(c.add(1234)); 
		System.out.println(c.add(new Integer(1234))); 
		System.out.println(c.add(new Login("userid", "userpasswd"))); 
		
		return result;
	}
	public static void main(String[] args) {
		System.out.println(getObject(new ArrayList()));
	 	System.out.println(getObject(new HashSet()));
/*
 * result of print 
true
true
true
true
true
true
true
true
true
[hello, hello, 1234, 1234, loginId=userpasswd, hello, hello, 1234, 1234, loginId=userpasswd]
true
false
true
false
true
false
false
false
false
false
[1234, hello, loginId=userpasswd]
*/
	}
}