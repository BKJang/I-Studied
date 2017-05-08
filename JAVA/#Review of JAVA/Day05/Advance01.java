
public class Advance01 {
	public static void main(String[] args) {
		// 프로그램이란건 데이터 관리&연산 (분기처리,반복처리)
		// 이 과정자체를 효율적으로 처리하기 위한 노력들이 있었고,
		// 결과물이 절차지향방식의 처리, 객체지향방식의 처리
		// 하나의 문제상황을 만들어 보자.
		// 주차요금정산프로그램을 만들어낸다고 가정
		String no ="31오9135";	// 차량번호
		int used = 76;	// 주차시간(분)
		// 이 차량의 주차요금을 계산
		int fee;
		if(used <=10) {
			fee = 0;
		}else if(used <= 60 ) {
			fee = 3000;
		}else {
			fee = 3000;
			int over = used - 60;
			while(over > 0 ){
				fee += 500;
				over -= 15;
			}
		}
		System.out.println(no+"/ 주차시간:"+used+"/요금:"+fee);
		// 처리해야될 데이터가 더 있고, 그 데이터도 같은 처리를 해야되는 상황을 연출
		String no2 ="41허1145";
		int used2 = (int)(Math.random()*80);
		int fee2;
		if(used2 <=10) {
			fee2 = 0;
		}else if(used2 <= 60 ) {
			fee2 = 3000;
		}else {
			fee2 = 3000;
			int over = used2 - 60;
			while(over > 0 ){
				fee2 += 500;
				over -= 15;
			}
		}
		System.out.println(no2+"/ 주차시간:"+used2+"/요금:"+fee2);
	}
}
//=============================================================================================



