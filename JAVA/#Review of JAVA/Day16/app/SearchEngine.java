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
			map = (Map<String, List<Hero>>)ois.readObject();	// 역직렬화
			System.out.println("파일로딩 성공!");
		} catch (Exception e) {
		//	System.out.println("E.." + e);
			map = new TreeMap<String, List<Hero>>();
			System.out.println("파일로드 실패.(없거나 손상됨)");
		}
		
		
		Scanner sc = new Scanner(System.in);
		// =================================================================
		while (true) {
			System.out.print("HERO> ");
			String m = sc.nextLine();
			if(m.equals("종료"))
				break;
			
			switch (m) {
			case "등록":
				System.out.println("SYSTEM# 등록시킬데이터 입력 (패턴 이름#소속#등급)");
				String in = sc.nextLine();
				String[] sp = in.split("#");
				Hero one = new Hero(sp[0], sp[1], Integer.parseInt(sp[2]));
				System.out.println("SYSTEM# 등록할 카테고리 입력");
				String cg = sc.nextLine();
				if (map.containsKey(cg) == false) {
					System.out.println("SYSTEM# 카테고리 생성됨");
					map.put(cg, new ArrayList<Hero>() );
				}
				map.get(cg).add(one);
				break;
			case "검색":
				System.out.println("SYSTEM# 검색할 카테고리 입력");
				String sch = sc.nextLine();
				if (map.containsKey(sch)) {
					List<Hero> rst = map.get(sch);
					// rst 에 잇는 정보 전부 출력
//					for(int i =0 ; i<rst.size(); i++) {
//						System.out.println(rst.get(i));
//					}
					for(Hero t : rst) {
						System.out.println(t);
					}
				} else {
					System.out.println("SYSTEM# 없는 카테고리");
				}
				break;
			default:
				System.out.println("SYSTEM# 등록 혹은 검색만 가능");
			}
		}
		
		try {
			OutputStream os = new FileOutputStream("d:/engine.oos");
			ObjectOutputStream oos = new ObjectOutputStream(os);
			// ObjectOuputStream을 통해서 출력하고자 하는 객체는 Serializable(직렬화)이 가능해야된다.
			oos.writeObject(map);	
			System.out.println("저장 완료!");
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

	// 생성자 3개짜리 추가 하나 해주시고.
	Hero(String n, String g, int r) {
		name = n;
		group = g;
		rank = r;
	}
	public String toString(){
		return name+"/"+group+"/"+rank;
	}
}
