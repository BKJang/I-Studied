import javax.swing.JOptionPane;

public class Essential01 {
	public static void main(String[] args) {
		
		String in = JOptionPane.showInputDialog("따라쳐보세요 : 1q2w3e");
		System.out.println(in);
		System.out.println(in == "1q2w3e");
		
		//그렇다면 문자열 비교는??
		System.out.println(in.equals("1q2w3e"));//객체값 비교가 아닌 실제값 비교
		//문자열 관련..
		//String - 문자열도 객체형태로 관리됨.
		char[] ch = {'프', '로', '그', '램'};
		String s1 = new String(ch);
		String s2 = new String("program");//s2객체에 "program"이란 문자열이 들어감
		//String 데이터를 char[] 배열로 한글자씩 가지고 있고, 이걸 토대로 어떤 작업을 할 수 있게
		//기능들이 내장된 객체
		
		//String 데이터 같은 경우는, new가 없이 자동으로 생성되게 해둔 특이 케이스
		String s3 = "프로그램";//객체 생성시new가 필요없음.
		String s4 = "프로그램";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		//==================================
		System.out.println(s1 == s3); // == 값자체가 같냐.(기본형이 아니면 객체값 비교)
		System.out.println(s1 == s2);
		System.out.println(s2 == s4);
		//문자열 비교를 ==하면 100프로 false가 떠야한다. 객체비교이므로
		System.out.println(s3 == s4);//이게 true가 뜨는 이유는
		//new 없이 생성되는 String 객체들은 자동생성되므로 문자열이 따로 관리가 된다.
		//동일 문자열을 다시 안만들고, 한번이라도 생성이 된 객체라면 계속 같은 값을 연결시켜 관리된다.
		
		
	}
	
	
	
}
