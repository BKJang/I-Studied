import java.util.*;
/**��ü���� �� ����������(ũ�⸦ ���� �� ����), ������ ��������(DAO) - �ߺ� or ���� üũ�Ұ��� ���� ���� ���߾��*/
public class CollectionTest {
	/**�Է� - Collection
	 * ó��
	 * ��� - ����ؼ� �ٰſ��� �ƴϸ� return�� ���ٰſ���?? Collection���� return(UI�� �����ϱ�)*/
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