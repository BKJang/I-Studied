
public class Basic02 {
	public static void main(String[] args){
		//변수
		//data type : 자료형
		//variable type : 변수명
//===========================================================
			//변수의 작명룰
			//1. 숫자로 시작할수 없다
			//2. 중복되는 이름 사용 불가
			//3. 의미있는 단어(예약어) 사용 불가 - 문법상으로 이미 사용중인 단어
//===========================================================
		boolean a;//true or false 데이터
			a=false;//저장할때는 = 사용 
		int b; //일반형 정수 L붙은 정수 사용 불가
			b=30;
		long c;//확장형 정수
			c=1000000000000000L;
		float d; // 축약 실수
			d=3.5667567568f;
		double e; // 일반 실수
			e=3.534325;
		char f; //문자
			f='☆';
		String g; //문자열
			g="자바JAVA";
			
		System.out.println(a);
		System.out.println(b*30);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
}
