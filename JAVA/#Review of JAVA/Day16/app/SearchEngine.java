package app;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.*;

public class SearchEngine {
	public static void main(String[] args) {
		
		Map<String, List<Hero>> map = null;
		
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/engine.oos"));
			map = (Map<String, List<Hero>>)ois.readObject();	// ������ȭ
			System.out.println("���Ϸε� ����!");
		} catch (Exception e) {
		//	System.out.println("E.." + e);
			map = new TreeMap<String, List<Hero>>();
			System.out.println("���Ϸε� ����.(���ų� �ջ��)");
		}
		
		
		Scanner sc = new Scanner(System.in);
		// =================================================================
		while (true) {
			System.out.print("HERO> ");
			String m = sc.nextLine();
			if(m.equals("����"))
				break;
			
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
//					for(int i =0 ; i<rst.size(); i++) {
//						System.out.println(rst.get(i));
//					}
					for(Hero t : rst) {
						System.out.println(t);
					}
				} else {
					System.out.println("SYSTEM# ���� ī�װ�");
				}
				break;
			default:
				System.out.println("SYSTEM# ��� Ȥ�� �˻��� ����");
			}
		}
		
		try {
			OutputStream os = new FileOutputStream("d:/engine.oos");
			ObjectOutputStream oos = new ObjectOutputStream(os);
			// ObjectOuputStream�� ���ؼ� ����ϰ��� �ϴ� ��ü�� Serializable(����ȭ)�� �����ؾߵȴ�.
			oos.writeObject(map);	
			System.out.println("���� �Ϸ�!");
		}catch(Exception e) {
			System.out.println("E..."+e);	// NotSerializableException..?
		}
		
		
		
	}
}

// ===================================================================
class Hero implements Serializable{
	String name;
	String group;
	int rank;

	// ������ 3��¥�� �߰� �ϳ� ���ֽð�.
	Hero(String n, String g, int r) {
		name = n;
		group = g;
		rank = r;
	}
	public String toString(){
		return name+"/"+group+"/"+rank;
	}
}
