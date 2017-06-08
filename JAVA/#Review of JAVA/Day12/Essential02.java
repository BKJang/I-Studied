// 포맷계열에서 Date형
import java.text.*;
import java.util.Date;

public class Essential02 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat();	// 기본생성
		
		String m =sdf.format( System.currentTimeMillis() );		// Date, 정수형 
		System.out.println(m);
		Date d = new Date();
			int n = d.getYear();
			System.out.println(n);
			System.out.println(d);	// Date 객체 출력 ==> toString()
		String mm = sdf.format(d);	// Date 객체를 SimpleDateFormat 이라는 애와 연동해서 뽑아내서
			System.out.println(mm);	// 출력
			
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM월dd일 / YYYY년");
		// y 년 ,M 월  d 일  H 시간 , m 분 s 초
		String mmm =sdf2.format(d);
		System.out.println(mmm);
		
		
	}
}
