
public class Basic01 {
	public static void main(String[] args) {
		// 데이터 관리, 연산, 분기 처리.. 살펴보았고
		// 반복처리
		//====================================================
		// 검증조건을 짜고, 그게 맞는 동안 같은 작업을 여러번 시킬 수 있음.
		
		int exp=0;
		//기본형태가 while
		/*※ 반복처리에 자주 쓰이는 상황이
		 * 반복처리중에 특정상황이 있었는가
		 * 몇번 발생했는가.. 이런 처리가 자주 일어남
		 * 예를 들어, gain 값이 16이 발생한 적 있었는가
		 * 10이상의 데이터가 총 몇개가 있었는가
		 */
		boolean f = false;
		int c = 0; // 반복문으로 16이 몇번 돌았는지 계산 가능하다.(만들어볼것!)
		
		while(exp<100){//현 경험치가 100이 넘어가는 순간 종료
		int gain = (int)(Math.random()*15)+2;// 획득 경험치 출력
		if(gain==16)//gain 값이 16이 있었는가
			f = true;
		
		System.out.println("Gain = " + gain);
		exp += gain; //기존 경험치 + 획득 경험치
		System.out.println("Current EXP : " +exp);
		}//반복문 종료
		
		//====================================================
		System.out.println("16이 있었는가 ? " + f);//gain 값에 16이 있었는가?
		String id = "jp30219";
		//변수타입이 String일때, 현재 세팅된 문자열의 정보를 몇가지 알아낼 수가 있다.
		
		int n = id.length();// 문자열의 길이(몇 글자인지)
		System.out.println("문자열의 길이 : " + n);
		
		String sid = id.substring(0, 4);//0번 부터 3번까지의 문자열(0<= id <4), 초과하면 퍼짐
		System.out.println(sid);
	}
}
