package notpoly;

public class PartTime {
	int hourWage;
	int hour;
	public PartTime(int hw, int h) {
		hourWage = hw;
		hour = h;
	}
	public int calcWage() {
		int t = hourWage*hour*20;
		return t;
	}
}
