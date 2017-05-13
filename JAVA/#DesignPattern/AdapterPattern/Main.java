package AdapterPattern;
/*요구사항
 * 두 수에 대한 다음 연산을 수행하는 객체를 만드시오
 * 1. 수의 두 배의 수를 반환(Float)
 * 2. 수의 반의 수를 반환(Float)
 * 
 * 구현 객체 이름은 Adapter
 * 
 * Math 클래스에 두 배와 절반을 구하는 함수는 이미 구현되어있습니다.
 */
public class Main {
	public static void main(String[] args) {
		
		Adapter adapter = new AdapterImpl();
		Adapter adapter2 = new AdapterImpl02();
		
		System.out.println(adapter.twiceOf(100f));
		System.out.println(adapter.halfOf(80f));
		
		System.out.println(adapter2.twiceOf(100f));
		System.out.println(adapter2.halfOf(80f));

	}
}
