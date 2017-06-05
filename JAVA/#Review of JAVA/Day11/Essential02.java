
public class Essential02 {
	public static void main(String[] args) {
		// 문자열 비교 - equls / equalsIgnorCase
		String s1 = "java";
		boolean b = s1.equalsIgnoreCase("JAVA");
		System.out.println(b);
		//int compareTo / compareToIgnoreCase
		String n1 = "유비";
		int d = n1.compareTo("관우"); //정렬잡을 수 있게끔. 두 문자열의 차이
		int d2 = n1.compareTo("장비");
		//주체가 작으면 음수, 크면 양수
		System.out.println(d);
		System.out.println(d2);
		
		//문자열 자체의 분석
		//int length() : 길이
		//int indexOf(String), int indexOf(String, int)
		//int lastIndexOf(String), int lastIndexOf(String, int)
		int z = s1.length();//글자 수
		System.out.println(z);
		
		String mail = "jp302119@naver.com";
		int z1 = mail.indexOf("1");//문자열이 몇번째에 있는지 8번째에 있으면 7이뜸
		//찾는 문자열이 없으면 -1이 뜸
		int z2 = mail.lastIndexOf("na", 20);//거꾸로 찾아내는것
		System.out.println(z1);
		System.out.println(z2);
		
		//문자열 분리 String[] split(String) : 구분자로 쓰이는 문자는 안되는 것도 있다.
		String msg = "등록#자바#프로그램언어";
		String[] ar = msg.split("#");//특정 문자열을 기준으로 문자열을 분리
		//등록/자바/프로그램언어
		System.out.println(ar[2]);
		
		//문자열 추출 String substring(int), String substring(int, int)
		String data = "가나다라마바사";
		String sd1 = data.substring(2);//그 칸부터 끝까지
		String sd2 = data.substring(4, 6);//그칸부터 뒤칸앞까지
		System.out.println(sd1);
		System.out.println(sd2);
	}
}
