package app;

import java.util.*;

public class SearchEngine {
	public static void main(String[] args) {
		List<Hero> li = new ArrayList<Hero>();
		Map<String, List<Hero>> map = new TreeMap<String, List<Hero>>();
		map.put("애니", li);
		li.add(new Hero("루피", "원피스", 3));
		String word = "역사";
		List<Hero> li2 = map.get(word);
		// System.out.println(li2.get(0));
		map.put("역사", new ArrayList<Hero>());
		map.get("역사").add(new Hero("관우", "삼국지", 1));
		Scanner sc = new Scanner(System.in);
		// =================================================================
		while (true) {
			System.out.print("HERO> ");
			String m = sc.nextLine();
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
					for(int i =0 ; i<rst.size(); i++) {
						System.out.println(rst.get(i));
					}
				} else {
					System.out.println("SYSTEM# 없는 카테고리");
				}
				break;
			default:
				System.out.println("SYSTEM# 등록 혹은 검색만 가능");
			}
		}
	}
}

// ===================================================================
class Hero {
	String name;
	String group;
	int rank;

	// 생성자 3개짜리 추가 하나 해주시고.
	Hero(String n, String g, int r) {
		name = n;
		group = g;
		rank = r;
	}

}
