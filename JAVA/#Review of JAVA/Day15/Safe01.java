import java.net.URL;
public class Safe01 {
	public static void main(String[] args) {
		// 이때까지 해봤던 몇가지 프로그램(처리과정) 들은 안정성이 매우 떨어졌다.
		// 예를 들어서, 
		// 정수형 문자열일꺼라고 기대하고, parseInt를 했는데, 정수형 데이터가 아니였다던지..
		// 객체 캐스팅(변환) 작업을 했는데, 해당 객체 타입이 아닌 상황이라던가..
		/* 문자열 substring을 해서 쓰는데, 없는칸을 접근하더라도 터지고,
		String pass = "q";
		pass.substring(0, 2);
		*/
		//
		//자바 프로그램 가동되면서 처리되는 작업 중에 Exception 이라는 객체가 있는데
		//이 Exception객체가 자바가상머신(JVM)에 들어가게 됐을 때, JVM이 터지게 설계가 되어있어서 그렇다.
		
		//Integer.parseInt("dsadsa");
		NumberFormatException nfe = new NumberFormatException();
		System.out.println("===");
		throw nfe;
	}
}
