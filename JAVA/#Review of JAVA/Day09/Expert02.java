import notpoly.*;
import poly.PartTime;


public class Expert02 {
	public static void main(String[] args) {
		//방금 살펴본 성지(다형성/polymorphism)을 이용해서 어떻게 응요할 수 있는가?
			//실제 생성될 instanece 값을 해당 타입을 포함서 상위 타입으로도
			//받아서 연결 가능
			//연결시켜둔 타입으로 호출 할 수 있는걸 사용을 하더라도, 실제 instance메서드가 작동됨
			//호출이 안되는 부분도 존재함(원래 타입이 없던 추가된 메서드 같은 경우)
		
		//1. 여러 객체를 하나의 타입으로 처리가 가능
			//연봉 계산기...
		Employee e = new Employee(2000000);
		PartTime p = new PartTime(6100, 10);
		
		int t1 = Calc.income(e);
		System.out.println(t1);//12개월치의 급여
		int t2 = Calc.income(p);
		System.out.println(t2);//12개월치의 급여
		
		
		//2. 아직 설계가 되지 않은 객체를 대상으로 처리가 가능
		
	}
}
