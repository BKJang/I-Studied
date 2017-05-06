
public class App02 {
	public static void main(String[] args) {
		int time = (int)(Math.random() * 1200);;
		
		System.out.println("Time = " + time + "분");
		//산술연산, 비교연산을 섞어서 몇가지 true, false 결과물을 얻어보자
		
		// 이 수치가 600 이상인가?
		boolean t1 = time >= 600;
		System.out.println("시간이 600이상인가? : " + t1);
		// 정확하게 시간으로 떨어지는지 true, false
		boolean t2 = (time % 60) == 0;
		System.out.println("딱 맞아떨어지는가? " + t2);
		// 시간 단위로 맞추기 위해서 더 필요한 분?
		int t3 = 60 - time % 60; //안나옴
		System.out.println("시간 단위로 맞추기 위해서 더 필요한 분? " + (t3==60 ? 0 : t3) +"분");
		//10분단위로 맞추기 위해 더 필요한 분?
		int t4 = t3 % 10;
		System.out.println("10분단위라면 ? " + t4 + "분");
		//이사람의 사용요금(10분당 500원)
		int p2 = (t3==0) ? 0 : 500;
		int pay = (time/10*500) + p2;
		System.out.println("지불할 요금은 ? " + pay + "원");
				
	}
}
