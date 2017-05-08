
public class Advance03 {
	public static void main(String[] args) {
		// 데이터 처리 측면에서 변화
		// 메서드(=함수)라는걸 통해서 처리되게
		System.out.println( cost(61) );
		int f = cost(11);
		System.out.println("f=="+f);
		Park p = new Park();
			p.use = 11;
		int ff = cost(p.use);
		System.out.println(ff);
	}
	/* 
	  	메서드 설계를 어디다가..?
	 	메서드(함수) == 어떤 데이터를 토대로 처리를 할수 있게 미리 만들어두는 것
	 	설계할수 있는 곳이 몇군대가 있는데, 그중에 한곳이.. main을 가지고 있는 곳에 같이.
	 	만들때 3개는 필수 , 나머진 옵션.
	 	1) 사용될때 이름 - 메서드명
	 	2) 어떤 데이터들을 가지고 작업 할껀지 - 매개변수 형태 
	 	3) 데이터 처리 후 발생시킬 데이터 - 반환형태
	 	예를 들어, 주차 요금 계산시키는 걸 함수화시켜보면..
	 	어떤이름을 붙일껀가.. cost , 
	 	무슨 데이터를 가지고 작업할껀가.. int 시간, 
	 	처리해서 멀 발생시킬껀가 int 요금 
	 	반환형 메서드명(필요한데이터형태 사용할이름)
	*/
	static int cost(int time) {	// 메인에서 직접 사용하게 하려면.. static옵션을 설정
		int fee;
		if(time <=10) {
			fee = 0;
		} else if(time <= 60 ) {
			fee = 3000;
		} else {
			fee = 3000;
			int over = time - 60;
			while(over > 0 ){
				fee += 500;
				over -= 15;
			}
		}
		return fee;	// 데이터 반환 키워드
	}
	
	
	
}



