import java.util.*;
/**객체들을 비 연속적으로(크기를 정할 수 없다), 관리는 업무에서(DAO) - 중복!!(나중에 바뀔 수 있다.)*/
public class SetTest {
	public static void main(String[] args) {
		Collection c;
		c = new HashSet(); //중복성 체크
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
		
		System.out.println(c);
	}
}