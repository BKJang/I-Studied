package poly;

// 실제 만들어진 하위 클래스들을 extends 걸고
public class PartTime extends Person {
	int hourWage;
	int hour;
	public PartTime(int hw, int h) {
		hourWage = hw;
		hour = h;
	}
	// 오버라이드 형태로 만들면.
	public int calc() {
		int t = hourWage*hour*20;
		return t;
	}
}
