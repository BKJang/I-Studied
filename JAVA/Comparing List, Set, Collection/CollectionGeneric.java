import java.util.*;
/**��ü���� �� ����������(ũ�⸦ ���� �� ����), ������ ��������(DAO) - �ߺ� or ���� üũ�Ұ��� ���� ���� ���߾��*/
public class CollectionGeneric {
	/**�Է� - Collection
	 * ó��
	 * ��� - ����ؼ� �ٰſ��� �ƴϸ� return�� ���ٰſ���?? Collection���� return(UI�� �����ϱ�)*/
	static Collection<Login> getObject(Collection<Login> c){
		Collection<Login> result = c;
		
		System.out.println(c.add(new Login("userid", "userpasswd")));
		
		System.out.println(c.add(new Login("userid", "userpasswd")));
		
		
		return result;
	}
	public static void main(String[] args) {
		System.out.println(getObject(new ArrayList<Login>()));
	
		Collection<Login> set = getObject(new HashSet());
		for(Login tmp : set){
			System.out.println(tmp.getLoginId());
		}//foreach => Iterator 
	}
}