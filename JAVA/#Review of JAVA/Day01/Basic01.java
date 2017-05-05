
public class Basic01 {
	public static void main(String[] args){
		//프로그램이란건 데이터 확보 및 연산작업이 주목적이 되는데
		//자바프로그램에서 숙지해야되는 데이터의 종류를 일단 살펴보자.
		
		//논리데이터 true,false
		//수치 크기 비교 같은걸 진행하게 될 때 발생하게되는 데이터
		System.out.println(10>7);
		
		//수치데이터
		//정수
		System.out.println(7777777); //일반형의 정수(-21억 ~ 21억)
		System.out.println(10000000000000L); //확장형의 정수
		System.out.println(109500L*23849371L); //결과값이 확장형의 정수
		//실수
		System.out.println(10.333 / 3.22); //일반형의 실수 -8byte
		System.out.println(10.333f / 3.22f); //축약형의 실수 -4byte
		
		//문자데이터(한글자) : 홀따옴표..한글자는 전부 처리 가능 -2byte
		System.out.println('다');
		System.out.println('★');
		
		//문자열 데이터(한글자 이상) : 쌍따옴표
		System.out.println("문자열 데이터");
	}
}
