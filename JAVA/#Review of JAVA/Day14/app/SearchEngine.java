package app;

import java.util.*;

public class SearchEngine {
	public static void main(String[] args) {
		List<Hero> li = new ArrayList<Hero>();
		Map<String, List<Hero>> map = new TreeMap<String, List<Hero>>();
		map.put("�ִ�", li);
		li.add(new Hero("����", "���ǽ�", 3));
		String word = "����";
		List<Hero> li2 = map.get(word);
		// System.out.println(li2.get(0));
		map.put("����", new ArrayList<Hero>());
		map.get("����").add(new Hero("����", "�ﱹ��", 1));
		Scanner sc = new Scanner(System.in);
		// =================================================================
		while (true) {
			System.out.print("HERO> ");
			String m = sc.nextLine();
			switch (m) {
			case "���":
				System.out.println("SYSTEM# ��Ͻ�ų������ �Է� (���� �̸�#�Ҽ�#���)");
				String in = sc.nextLine();
				String[] sp = in.split("#");
				Hero one = new Hero(sp[0], sp[1], Integer.parseInt(sp[2]));
				System.out.println("SYSTEM# ����� ī�װ� �Է�");
				String cg = sc.nextLine();
				if (map.containsKey(cg) == false) {
					System.out.println("SYSTEM# ī�װ� ������");
					map.put(cg, new ArrayList<Hero>() );
				}
				map.get(cg).add(one);
				break;
			case "�˻�":
				System.out.println("SYSTEM# �˻��� ī�װ� �Է�");
				String sch = sc.nextLine();
				if (map.containsKey(sch)) {
					List<Hero> rst = map.get(sch);
					// rst �� �մ� ���� ���� ���
					for(int i =0 ; i<rst.size(); i++) {
						System.out.println(rst.get(i));
					}
				} else {
					System.out.println("SYSTEM# ���� ī�װ�");
				}
				break;
			default:
				System.out.println("SYSTEM# ��� Ȥ�� �˻��� ����");
			}
		}
	}
}

// ===================================================================
class Hero {
	String name;
	String group;
	int rank;

	// ������ 3��¥�� �߰� �ϳ� ���ֽð�.
	Hero(String n, String g, int r) {
		name = n;
		group = g;
		rank = r;
	}

}
