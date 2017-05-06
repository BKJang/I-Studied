
public class Basic01 {
	// main.. ctrl + space.. enter
	public static void main(String[] args) {
		// 데이터 종류, 변수를 통한 관리를 살펴보았고
		// 이런 데이터를 토대로 할 수 있는 작업들!!
		// 수치데이터 : 산술 연산이 제공
		System.out.println(10*2);// sysout.. ctrl + space
		
		// 변수를 통한 작업도 마찬가지
		int n1 = 44;
		long n2 = 45L;
		float n3 = 3.444f;
		double n4 = 45634.2;
		System.out.println(n1 *2);
		System.out.println(n2 * 3);
		// 산술연산은 같은 데이터 타입끼리만 진행이 되게 되어있다.
		System.out.println(n1 - n3); // 처리가 안되는게 맞는 것
		// 각 데이터 탑이끼리만 계산이 되는게 맞지만 
		// 프로그램 상에서 서로 다른 타입의 수치를 계산진행하면
		// 섞어진 값 중에 가장 큰 형태로 일치 후에 작업이 일어남 => 결과물은 실제 값으로
		// -> 아마?추측: 값이 많아지면 프로그램의 연산 속도가 느려지지 않을까...?
		
		System.out.println(79/89); //정수데이터 나누기의 결과 -> 정수(몫부분만 나옴)
								   //그래서 0이 나옴!!
		System.out.println(179/89 * 1.0);
		System.out.println(1.0 * 179 /89); 
		//같은 연산이지만 타입별로 연산이 되므로 값이 다르게 나옴
		
		//수치 산술 연산중에 (add+, sub-, mul*, div/) + mod% 연산(나머지 계산)
		double vv = 4564.245;
		double z = vv%1.0; //vv를 1.0으로 나눴을 때 나머지
		System.out.println(vv);
		System.out.println(z);
		System.out.println(vv-z);//나머지 연산 이용 실수 값의 소수점 부분 날릴 수 있음
		
		// 정수간의 나머지 연산
		int tot = 456;
		System.out.println(tot / 60);//몫
		System.out.println(tot % 60);//나머지
		
		/*
		 해당 .class 파일이 있는 곳에 가서 javap -v
		 예) javap -v Basic01
		 */
						
	}
}
