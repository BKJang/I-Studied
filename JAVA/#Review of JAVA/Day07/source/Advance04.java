package source;

import java.util.Date; //개방,폐쇄를 잘 시켜 둠.

public class Advance04 {
	public static void main(String[] args) {
		Date d1 = new Date(456484631564L);//long 수치를 집어넣을 수 있음
		// 생성하면서 들어온 수치를, 1970년 1월 1일 00:00:00 GMT로 부터 흘러간
		// milli second라고 인식
		// 그걸 토대로 날짜를 만들어줌.
		
		String m = d1.toString();
		System.out.println(m);
		
		long t = System.currentTimeMillis();//작동시켰을때의 시간
		System.out.println(t);
		Date d2 = new Date(t);//현재 시간을 넣으면 오늘 날짜가 나옴
		System.out.println(d2.toString());
		Date d3 = new Date();//기본생성을 하면 알아서 처리해줌
		System.out.println(d3.toString());
		
		
		//이 안에 만들면서 전달되는 데이터 세팅이 될텐데, 필드명이 무엇인지 확인할 길이 없다.
		//생성과 동시에 년,월,일,시,분,초가 다 분석이 끝남.필드를 오픈시켰다면,
		//수치는 바껴있는데 분석결과는 같을 수 있다. 따라서 차단을 걸어둠.
		d3.setTime(1000L*60*60*24);//하루가 지나감
		//차단되어 있기 때문에 이런식으로 변경 가능
		//Advance03에 나오는 p1.win이 안될 때, setter를 사용하는 이유와 같다.
		
		System.out.println(d3.toString());
	}
}
