package app;
import java.util.*;

class Player {
	String name;
	String team;
	public Player(String n, String t) {
		name = n;
		team = t;
	}
}

//=============================================================================
public class ExtractEx {
	public static void main(String[] args) {
		Player[] all = new Player[] {
			new Player("���쵧","�λ�"), new Player("��Ŀ", "NC"), new Player("�豤��","SK" ), 
			new Player("�����", "�λ�" ), new Player("����Ʈ", "�λ�")
		};
		System.out.println( all.length );
		//===========================================================================
		// �� �������� �������ֳ�.
		Set<String> e = new TreeSet<String>();//���׸� �޼���
		
		for(int i=0; i<all.length; i++) {
			e.add(all[i].team);
		}
		System.out.println("�� : " +e.size() +"�� ��!");
		Object[] t1 = e.toArray();	// ������ �ִ� ��Ҹ� Object[]�迭�� ��ȯ
		String[] t2 = new String[e.size()];
			e.toArray(t2);
		
		System.out.println(t2[0]);
		
		//============================================================================
		
	}
}





 