package app;

import java.util.*;
//===========================================================================
class Nation {
	String name;	// ������
	String city;	// ������
	String area;	// �����
	Nation(String n, String c, String a) {
		name = n;
		city = c;
		area = a;
	}
}
//========================================================================
public class ManagementEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Nation> datas = new ArrayList<Nation>();
		//================================================================
		Nation t = new Nation("�ѱ�", "����", "�ƽþ�");
			datas.add(t);		
		//=================================================================
		String[] ar = new String[] {//�Է� ��ų ������ �迭�� String�� �־��.
			"�Ϻ�#����#�ƽþ�",
			"ĳ����#��Ÿ��#�Ƹ޸�ī"
				
		};
		for(int i =0; i<ar.length; i++){
			String[] sar = ar[i].split("#");
			Nation temp = new Nation(sar[0], sar[1], sar[2]);
			datas.add(temp);
		}
		System.out.println(datas.size());
		
		Set<String> area = new TreeSet<String>();//�ߺ��Ǵ� �����͸� �����ϸ鼭 ����
		for(int i=0; i<datas.size(); i++){
			area.add(datas.get(i).area);
			
			
		}System.out.println("����� ���� : " + area.size());
		
		
	}
}













