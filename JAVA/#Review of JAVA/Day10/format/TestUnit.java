package format;

public class TestUnit extends Unit {
	// �⺻������ �����ϱ�. super�̿��ؼ� �ٸ� ������ ȣ��ǰ� ����
	// abstract �κ��� ä���� �ȴ�.
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
