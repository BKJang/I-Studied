package app;

import java.util.*;


public class Essential03 {
	public static void main(String[] args) {
		//ForEach 라는 문법을 만들어둠 (Enhanced for / 향사 for)
		//Iterable 이 가능한 컬렉션 객체나, 배열을 대상으로..
		List<String> li = new ArrayList<String>();
			li.add("벡터");
			li.add("어레이스리스트");
			li.add("링크드리스트");
		String m = "데이터";
		for(String o : li){	//컬렉션 구조의 List 계열, Set계열, 배열을 대상으로
							//차례대로 모든 요소들을 설정해서 끝까지 돌려주는 반복
			System.out.println(o);
		}
		
		Set<Integer> ns = new TreeSet<Integer>();
		for(Integer o : ns){
			System.out.println(o);
		}
		Hero[] ar = {new Hero("루피","원피스",1), new Hero("손오공","드래곤볼",2)};
		for(Hero t : ar){
			System.out.println(t +"/" + t.name);
		}
	}
}
