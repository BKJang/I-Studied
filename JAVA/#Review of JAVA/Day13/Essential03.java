import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

import data.Ball;

public class Essential03 {
	public static void main(String[] args) {
		// ������ �迭�� ���캸������.. ���ʸ��̶��� ���� �Ѿ��.
		// �÷��� �迭�� Ŭ�������� 1.2 �������� ������ �Ǵ��ǵ�
		// 1.5������ �߰��� ������ �ִ�. [ Generic ] , 
		// compiler ������ ������Ʈ ��Ŭ�� ������Ƽ .. ���� ���� ����
		// ������ ��üŸ���� �����Ҽ� �ִ�.
		Vector<Hero> li = new Vector<Hero>();
		Hero h1 = new Hero();
			li.add(h1);
			li.add(new Hero());
			Hero z =li.get(1);
			
			
		ArrayList<String> ms = new ArrayList<String>();
			ms.add("DSadsa");
			
		LinkedList<Integer> hs = new LinkedList<Integer>();
			hs.add(new Integer(45));
			int m = 43;
			Integer ii = new Integer(m);
			hs.add(ii);
			hs.add(5);
			System.out.println(hs.get(2).getClass());
			
			
	}
	
}
//======================================
class Hero {
	
}