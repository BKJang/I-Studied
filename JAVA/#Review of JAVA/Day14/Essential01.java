import java.util.*;

//Map - ������������ �̸�(Ű)�� �ٿ��� �����Ű��, �̸��� ���ؼ� ��Ȯ���� �� �� �ְ� �ص� �׷�


public class Essential01 {
	public static void main(String[] args) {
		ArrayList li = new ArrayList();
		Map map1 = new HashMap();
		Map map2 = new TreeMap();
		Map map3 = new Properties();
		Map map4 = new LinkedHashMap();
		//========================================
		// int size() => ���� ����.
		// booelan isEmpty() => 0�� ����.(����ֳ�)
		
		// ���.. put(K key, V value) : ���� �̸�(Ű ��), �ڰ� ���尴ü ��(������ ������) - �⺻�� Object, Object
		String[] ar1 = new String[]{"����", "����", "����"};
		int[] ar2 = new int[]{11, 55, 2};
		
		// Ű ���� 90%�̻��� String���� ��.
		map1.put("asia", li);
		map1.put("name", ar1);
		map1.put("ages", ar2);
		map1.put(0, new Scanner(System.in) );
		map1.put("title", "�÷���");
		
		System.out.println(map1.size());
		System.out.println(map1.isEmpty());
		
		// Ȯ��.. V get(K key) : Ű ���� �Ű������� �ָ� ==> ������ִ� ��ü�� ��ȯ
		Object o = map1.get("title"); //�ش� Ű�� �����ִ� ��ü�� ������ null�� ����
		if(o==null)
				System.out.println("�ش� Ű�� ���� ��ü ����");
		else
			System.out.println(o.getClass());
		
		
		//boolean containsKey(Object k), boolean containsValue(Object v)
		boolean b1 = map1.containsKey("�÷���");//map1�� key���� "�÷���"�� �����Ƿ� false
		boolean b2 = map1.containsKey("title");//map1�� key���� "title"�� �����Ƿ� true
		boolean b3 = map1.containsValue("�÷���");//map1�� value���� "�÷���"�� �����Ƿ� true
		System.out.println("b1 = " + b1 + " b2 = " + b2 + " b3 = " + b3);
		
		//V remove(Object k)
		//V replace(K key, V value)
		map1.replace("title", "collection");
		map1.put("title", "collection");//������ put�� �ϸ� ��ü�� ��.
		String mz = (String)map1.get("title");
			System.out.println(mz);
		//==============================================
		//keySet().. Ű�� Set���� ���������.
			
			Set keys = map1.keySet();//Ű���� Set���� �������
			System.out.println(keys.toString());//���� �ִ� Ű������ ���.
	}
}
