package format;

// 키워드가 다르다, interface 는 extends가 implements 라는 키워드를 사용
public class TestCompare implements Compare {
	public boolean same(int a, int b) {
		if (a == b)
			return true;
		else
			return false;
	}

	public boolean like(int a, int b) {
		int t = a - b;
		t = t > 0 ? t : -t;
		if (t <= 5)
			return true;
		else
			return false;
	}
}
//====================================================================
// 완성클래스 / 추상클래스 / 인터페이스 라는 걸 설계할수 있음.
// Math , Integer, Frame, WindowAdapter 등등 자바에서 제공해주는 애들도 3개중에 하나임.
// 완성클래스로 제공하는 이유 = 어떤일들을 처리할수 있게 미리 설계가 다 해두고 가져다 쓰라고. 
// 추상클래스,인터페이스로 제공하는 이유  = ???????????????












