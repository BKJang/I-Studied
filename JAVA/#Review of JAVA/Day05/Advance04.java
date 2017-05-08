
public class Advance04 {
	public static void main(String[] args) {
		double a = rate(169, 65);
		System.out.println("a == " + a);
		
		String s = channel(9);
		System.out.println(s);
		System.out.println( channel(11) );
		double e = power(3, 4);
		System.out.println(e);	// 81.0
		System.out.println(power(2, -2));	// 0.25
	}

	// 이때까지 데이터처리 해본것중에 몇개만 메서드로 설계하자.
	// 1) 신장,체중에 따른 신체지수 계산#
	// 어떤이름으로 만들껀지(rate),
	// 필요한데이터는 먼가(int 신장, int체중), 발생시킬 결과물(double 신체지수)
	static double rate(int c, int k) {	// day04#Basic03
		double r = 0.0;
		return r;
	}
	// 2) 번호에 따른 채널문자열 계산
	// 어떤이름으로 만들꺼지 (channel)
	// 필요한 데이터 (int 채널번호) , 발생시킬 결과물 String 
	static String channel(int ch) {	// day04#Basic04
		String m="UNDEFINED";	// 5SBS,7KBS2,9MBC,11KBS1 이거만 처리
		return m;
	}
	// 3) 제곱값 계산
	// 어떤이름으로 만들껀지 (power)
	// 필요한 데이터 (int 숫자, int 회수)  발생시킬 결과물 double
	static double power(int a, int b) {	// day05#App02
		double r=0.0;
		return r;
	}
	
}







