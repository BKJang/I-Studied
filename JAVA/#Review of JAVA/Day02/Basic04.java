
public class Basic04 {
	public static void main(String[] args) {
		// 논리 연산.. 크기비교(수치에서만)나.. 동등빅(타입만 맞으면 다 지원)
		// 크기비교 :  >, >=, <, <=
		// 결과 값은 true, false
		int a = 44;
		int b = 55;
		String s = "안녕";
		boolean r1 = a > b;
		System.out.println(r1);
		
		// 동등비교 : ==, !=
		boolean r2 = s=="안녕";//수치값과 문자값은 비교 불가(타입이 맞아야함)
		System.out.println(r2);
	}
}
