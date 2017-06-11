// java.util 소속의 클래스.. 컬렉션 이라고 불리우는 클래스들.
	// 객체값 저장 용도로 설계가 된 클래스들
import data.*;

public class Essential01 {
	public static void main(String[] args) {
		// Ball 객체가 많이 생성되게 된다고 가정...
		// 이런 Ball 객체들을 체계적으로 묶어서 처리하고 싶다면..
		// 배열이란게 있기 때문에.. 배열을 사용해도 된다.
		
		// 배열의 장점 ==> 만들면서 데이터를 세팅을 시켜둘수 있다.
		// 배열의 단점 ==> 유한개의 처리.
		
		// 정확하게 몇개를 세트로 만들껀지 일단 결정이 되야되고, 
		// 배열의 처리개수가 정해지면.. 결정된거 이상의 개수는 처리 불가
		
		
		// 데이터를 설정하면서 묶어도 되고
		Ball[] bs = { new Ball(), new Ball(),new Ball(),new Ball(),new Ball()};	 
		
		// 일단은 개수만 정해놓고..
		Ball[] bss = new Ball[5];
			bss[0] = new Ball();	// 나중에 세팅을 해도 됨.
		System.out.println( bss[1] );
		
		
		// 그래서 데이터가 몇개가 발생을 하던, 다 모아둘수 있는 클래스를 제공을 한다.  (컬렉션)
	}
}



