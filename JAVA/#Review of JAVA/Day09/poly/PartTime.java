package poly;

// ���� ������� ���� Ŭ�������� extends �ɰ�
public class PartTime extends Person {
	int hourWage;
	int hour;
	public PartTime(int hw, int h) {
		hourWage = hw;
		hour = h;
	}
	// �������̵� ���·� �����.
	public int calc() {
		int t = hourWage*hour*20;
		return t;
	}
}
