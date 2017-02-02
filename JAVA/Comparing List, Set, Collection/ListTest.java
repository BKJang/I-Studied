package test;
import java.util.*;
/**
 객체들을 비 연속적으로(크기를 정할 수 없다), 관리는 업무에서(DAO) - 순서!!(나중에 바뀔 수 있다.)*/
public class ListTest {
	public static void main(String[] args) {
		Collection c;
		c = new ArrayList();
		System.out.println(c.add("hello"));
		System.out.println(c.add(new String("hello")));
		System.out.println(c.add(1234)); //jdk 5.0부터 가능
		System.out.println(c.add(new Integer(1234))); //이게 정식
		System.out.println(c.add(new Login("userid", "userpasswd")));//School.Login@2a139a55이 출력되는데, 이는 주소값을 반환하기 때문이다. 즉, toString 필요
		System.out.println(c.add("hello"));
		System.out.println(c.add(new String("hello")));
		System.out.println(c.add(1234)); //jdk 5.0부터 가능
		System.out.println(c.add(new Integer(1234))); //이게 정식
		System.out.println(c.add(new Login("userid", "userpasswd")));
		
		System.out.println(c);
	}
}
