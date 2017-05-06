
public class Basic03 {
	public static void main(String[] args) {
		//다른 작업들도 살펴보자
		//캐스팅(형변환)이라는 것도 할 수 있음
			//다른 데이터로 인식시키는.. 살펴봤던 애들 중에는 수치데이터 사이에서만 가능
		//ex)
		int a = 45;
		float f = 32.222f;
		boolean b = true;
		String z = "안녕";
		
		// (인식시킬 데이터 타입) 타겟 => 해당타입의 데이로 인식이 됨
		System.out.println( (double)a );
		System.out.println( (double)f );
		System.out.println( (int)f );
		/*
		수치데이터가 아닌 boolean이나 String으로 수치데이터를 형변환할 수 없음
		System.out.println( (boolean)f );
		System.out.println( (int)z );
		*/
		
		//캐스팅을 이용한 작업 중 자주 이용하는 처리가 랜덤 정수
		System.out.println(Math.random() ); // => 0.0<1.0 실수(double) 데이터
		double r = Math.random();
		System.out.println(r*10); // r*10 => 0.0<10.0의 실수
		System.out.println( (int)r * 10); // => 0<10의 정수 but 값:0
		
		System.out.println( (int)(r*10) ); // 0<10의 정수
		//0~9 까지의 정수형 데이터 확보 가능
	}
}
