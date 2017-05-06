
public class Basic01 {
	public static void main(String[] args) {
		//데이터를 변수를 통한 관리 및 데이터를 토대로 한 연산까지 해보았고
		
		//조건(3항 연산자)
		//작업 자체를 지시하기보다는 데이터를 뽑아다 쓰는 용도
		int a = 33;
		String m = a%2==0 ? "even" : "odd"; // 데이터를 확보
		//작업지시는 아니다.
		
		//상황에 따라 작업지시 - if ~ else
		int time = 130; //이용시간
		int cost; //요금
		int mileage; //마일리지
		
		// 이용시간 2시간 이하일 때, 아닐 때
		// 2시간 이하는 30분당 천원
		// 그 이상은 20분당 900원
		// 마일리지 계산식도 다름 : 2시간 이하는 5분당 1점
		// 2시간 이상은 4분당 1점
	
		if(time<=120){
			int c = time%30==0 ? time/30 : time/30 + 1;
			cost = c *1000;
			int m1 = time%5==0 ? time/5 : time/5 + 1;
			mileage = m1;
		}else{
			int c1 = time%20==0 ? time/20 : time/20 +1;
			int m2 = time%4==0 ? time/4 : time/4 +1;
			cost = c1 * 900;
		    mileage = m2;
		}
		
		System.out.println(time + "에 해당하는 요금 : " + cost );
		System.out.println(time + "에 따른 포인트 : " + mileage);
	}
}
	
