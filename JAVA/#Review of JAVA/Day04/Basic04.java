
public class Basic04 {
	public static void main(String[] args) {
		//while - 횟수에 의미가 크게 없음
		//for 처리는 일정횟수만큼의 반복처리를 하고자 할 때
		//for 반복처리는.. 반복들어가기전에 할일, 테스트조건 , 매반복마다 처리할일
		//3개가 설정 가능하다는 장점이 있음
		//일정횟수만큼의 반복처리가 용이함.
		
		for(int a=1; a<=5 ; a+=1){//for에서 선언된 변수는 반복문이 끝난 이후에는 접근이 불가
			double e = Math.random();
			System.out.println("E==" +e);
		}	
	}
}
