// java.text. 의 Format 계열의 클래스들 
// Format을 잡는건 결국 다 말을 만들어 내는 것.
import java.text.*;

public class Essential01 {
	public static void main(String[] args) {
		// new Format();
		// 수치형데이터를 일정형태의 문자열로 만들어주는 기능을 가지고 있는 클래스
		DecimalFormat df = new DecimalFormat();	// 기본생성은  #,###.###
			// 정수부 같은 경우는 3자리마다 , 소수부는 3자리까지만 나온다.
			// String format(long)   ,  String format(double)
			
		String m1 = df.format(1313313);
		String m2 = df.format(1313313.9787);
		System.out.println(m1);
		System.out.println(m2);
		// 패턴도 설정이 가능 , #(0생략) 이나 0(비어있는값도0)설정만 해봅시다.
		DecimalFormat df2 = new DecimalFormat("#.###");	// 소수부만 3째짜리까지 표현
		String m3 =	df2.format(1313313.9);
		System.out.println(m3);
		
		DecimalFormat df3 = new DecimalFormat("#.000");	// 소수부만 3째짜리까지 표현
		String m4 =	df3.format(1313313.9);
		System.out.println(m4);
		
		DecimalFormat df4 = new DecimalFormat("0000");
		String m5 =df4.format(45.323223);
		System.out.println(m5);
	}
}





