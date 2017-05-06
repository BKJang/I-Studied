
public class Basic04 {
	public static void main(String[] args) {
		// if ~ else의 변형
		
		int cm = 179;
		int kg = 73;
		double m = cm / 100.0;
		// 이 두 데이터를 토대로, 신체질량지수(BMI) 계산
		// BMI = kg / m*m
		System.out.println("키 : " + cm + " 몸무게 : " + kg);
		double BMI = kg / (m*m);
		BMI -= BMI % 0.01;//최대 소수점 2째자리 까지 출력
		System.out.println("신체질량지수 : " + BMI);
		double diet = 23 * m * m;
		double diet2;
		//if문 시작
		if(BMI>=23){
			diet2 = kg - diet;
			diet2 -= diet2 % 0.01;//최대 소수점 2째자리 까지 출력 
			System.out.println("감량 지수 : " + diet2);
		}else if(BMI<=18.5){
			diet2 = diet - kg;
			diet2 -= diet2 % 0.01;
			System.out.println("증량 지수 : " + diet2);
		}else{
			diet2 = 0;
			System.out.println("증/감량 지수 : " + diet2);
		}//if문 종료
	}
}
