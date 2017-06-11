package app;

import java.util.*;
//===========================================================================
class Nation {
	String name;	// 국가명
	String city;	// 수도명
	String area;	// 대륙명
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
		Nation t = new Nation("한국", "서울", "아시아");
			datas.add(t);		
		//=================================================================
		String[] ar = new String[] {//입력 시킬 데이터 배열을 String에 넣어둠.
			"일본#도쿄#아시아",
			"캐나나#오타와#아메리카"
				
		};
		for(int i =0; i<ar.length; i++){
			String[] sar = ar[i].split("#");
			Nation temp = new Nation(sar[0], sar[1], sar[2]);
			datas.add(temp);
		}
		System.out.println(datas.size());
		
		Set<String> area = new TreeSet<String>();//중복되는 데이터를 제외하면서 정렬
		for(int i=0; i<datas.size(); i++){
			area.add(datas.get(i).area);
			
			
		}System.out.println("대륙의 개수 : " + area.size());
		
		
	}
}













