//문법 오류 : 알려줌. 무조건 앞에 꺼 부터 해결,시작 - 종료 다음에 코딩 //들여쓰기 : ctrl + i
//실행 오류 : 비정상 종료. ==> 업무에 따라 경우의 수가 다양하다.(기능 및 비기능적인 요구사항) ex)email입력해주세요 - 1234@naver.com : 있을 수 없음!!
public class ExceptionTest {
	public static void main(String[] args) {
		int num =(int)10.5;//Casting
		System.out.println(args[0]);
		System.out.println("end"); //시작과 끝을 명확히!
	}
}