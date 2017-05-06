
public class Basic02 {
	public static void main(String[] args) {
		// 수치형 데이터가 아님에도 불구하고 + 연산이 처리되는 데이터가 있음
		// 문자열 .. String
		String s = "java" + "prgram";
		String ss = s + "!!!";
		System.out.println(ss);
		
		// 문자열에는 모든 데이터가 다 더해진다.
		int n = 4;
		int nn = 5;
		String sss = ss + n;
		System.out.println(sss); // 그 수치를 포함시킨 문자열이 만들어짐
		System.out.println(sss+nn);
		
		System.out.println("n의 값은 " + n + "입니다.");
	}
}
