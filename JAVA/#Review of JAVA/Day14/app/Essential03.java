package app;

import java.util.*;


public class Essential03 {
	public static void main(String[] args) {
		//ForEach ��� ������ ������ (Enhanced for / ��� for)
		//Iterable �� ������ �÷��� ��ü��, �迭�� �������..
		List<String> li = new ArrayList<String>();
			li.add("����");
			li.add("��̽�����Ʈ");
			li.add("��ũ�帮��Ʈ");
		String m = "������";
		for(String o : li){	//�÷��� ������ List �迭, Set�迭, �迭�� �������
							//���ʴ�� ��� ��ҵ��� �����ؼ� ������ �����ִ� �ݺ�
			System.out.println(o);
		}
		
		Set<Integer> ns = new TreeSet<Integer>();
		for(Integer o : ns){
			System.out.println(o);
		}
		Hero[] ar = {new Hero("����","���ǽ�",1), new Hero("�տ���","�巡�ﺼ",2)};
		for(Hero t : ar){
			System.out.println(t +"/" + t.name);
		}
	}
}
