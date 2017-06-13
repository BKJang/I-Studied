import java.util.*;

public class Essential02 {
	public static void main(String[] args) {
		//1.5버전 때 추가
		//Auto Boxing, UnBoxing이 제공된다.
		//기본형데이터 →  Wrapper class 객체 형태로 자동 바뀐다.
		//Wrapper class 객체 → 기본형 데이터로 바뀐다.
		int k = 5;
		Integer i = k; //자동 랩핑 ,오토박싱/ 자동으로 객체가 됨
		
		int kk = i; //자동 언랩핑, 오토언박싱/ 자동으로 변수값이 됨
		
		Object o = 5;
		System.out.println(o.getClass());

		Map<String, Integer> zocbo = new HashMap<String, Integer>();
			zocbo.put("광땡", 500);
			zocbo.put("알리", 400);
			
			int n = zocbo.get("광땡");
			System.out.println("N==" + n);
			
	}
}
