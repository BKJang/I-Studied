import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import javax.management.relation.RoleList;

import data.Ball;

// ������ ����뵵�� Ŭ���� (�÷���) - �����Ǵ� Ŭ�������� ���ʰ����� �Ѵ´�.
	// �� Ŭ�������� �׷��� ��������. (��ǥ �������̽����� ����� �ְ�, �װ� �������ѵ� ����̶�) 
// ���� ���̴� �迭(�׷�)
	// List �迭 - ���ʴ�� ������ ���ְ�, �ߺ������͵� �� ó���� ���ش�.
	// Set �迭 - �ش�Ŭ������ ó���ϰ� �ϴ� ��Ĵ�� �˾Ƽ� ����, �ߺ������͵� �� �ɷ�����.
	// Map �迭 - ������������ �̸�(Ű)�� �ٿ��� �����Ű��, �̸��� ���ؼ� ��Ȯ���� �Ҽ� �ִ�.

public class Essential02 {
	public static void main(String[] args) {
		// List .. 
		// ���� ����Ŭ���� - Vector, ArrayList, LinkedList ���
		List v = new Vector();	// 
		List ar = new ArrayList();		//�̰� �ַ� ���� ��  �� <--- 
		List li = new LinkedList();
		List rl = new RoleList();		// ctrl+shift+o : ����Ʈ import
		List st = new Stack();
		// =====================================================================
		// int  size()   ==> ���尳��
		// boolean add(Object) ==> �����Ű�� (�⺻�� �Ǹ�������ҷ�)
		// void add(int , Obejct) ==> (��ġ�� �����ؼ� �߰�, ������ �ڵ����� ��ȭ�� �Ͼ)
		System.out.println(st.size());
		
		Ball t = new Ball();
		ar.add(t);
		ar.add(t);
		ar.add( new Ball() );
		ar.add("�ƹ��ų�");
		ar.add(st);
		System.out.println(ar.size());
		
		// boolean contains(Object )
		boolean f =ar.contains("�ƹ��ų�!");
		System.out.println(f);
		// Object get(int) ..
//		ar.add(2, new Date());
		Object g = ar.get(2);
		Date dt = (Date)g;
		dt.getTime();
		
		System.out.println(g.getClass());
		// boolean isEmpty() : size�� 0�̳� �ƴϳ�
		// int indexOf(Object)  : String�� indexOf�� ���ø���
		// int lastIndexOf(Object ) : "
		// Object remove(int ) : �ش� ��ȣ�� �����, ��ü���� ƨ���� ����. 
		Object o = ar.remove(3);
		System.out.println(ar.size());
		// List subList(int, int)
		
		Object[] all =ar.toArray();
		
	}
}







