import java.util.*;
/**��ü���� �� ����������(ũ�⸦ ���� �� ����), ������ ��������(DAO) - �ߺ�!!(���߿� �ٲ� �� �ִ�.)*/
public class SetTest {
	public static void main(String[] args) {
		Collection c;
		c = new HashSet(); //�ߺ��� üũ
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