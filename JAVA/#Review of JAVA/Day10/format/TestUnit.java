package format;

public class TestUnit extends Unit {
	// 기본생성자 없으니까. super이용해서 다른 생성자 호출되게 유도
	// abstract 부분을 채워야 된다.
	public TestUnit(String n) {
		super(n);
	}

	public boolean possible(int t) {
		if (t > 0)
			return true;
		else
			return false;
	}

	public String info() {
		return "{name=" + name + ",x=" + x + "}";
	}
}
