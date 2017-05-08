
public class Basic03 {
	public static void main(String[] args) {
		//반복처리를 일으키는 while, do-while
			//계속 처리할껀지 아닌지 판단식만 설정해주면 되지만 - 생략불가
		//for
		//판단식외에 추가로 설정이 가능(반복 시작전 처리할 일, 매 반복마다 처리할 일)
			//각 요소 구분은 [;]으로 - 생략가능
	
		int exp = 0;
		//for(시작시 할일 ; 테스트 조건 ; 매반복시 처리할일
		for(System.out.println("START") ; exp<100 ; System.out.println("헿")){
			int g = (int)(Math.random()*10+2);
			System.out.println(g);
			exp += g;
		}//for문 종료
		System.out.println("EXP = " + exp);
	}
}
