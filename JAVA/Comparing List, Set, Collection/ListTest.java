package test;
import java.util.*;
/**
 ��ü���� �� ����������(ũ�⸦ ���� �� ����), ������ ��������(DAO) - ����!!(���߿� �ٲ� �� �ִ�.)*/
public class ListTest {
	public static void main(String[] args) {
		Collection c;
		c = new ArrayList();
		System.out.println(c.add("hello"));
		System.out.println(c.add(new String("hello")));
		System.out.println(c.add(1234)); //jdk 5.0���� ����
		System.out.println(c.add(new Integer(1234))); //�̰� ����
		System.out.println(c.add(new Login("userid", "userpasswd")));//School.Login@2a139a55�� ��µǴµ�, �̴� �ּҰ��� ��ȯ�ϱ� �����̴�. ��, toString �ʿ�
		System.out.println(c.add("hello"));
		System.out.println(c.add(new String("hello")));
		System.out.println(c.add(1234)); //jdk 5.0���� ����
		System.out.println(c.add(new Integer(1234))); //�̰� ����
		System.out.println(c.add(new Login("userid", "userpasswd")));
		
		System.out.println(c);
	}
}
