package format;

// Ű���尡 �ٸ���, interface �� extends�� implements ��� Ű���带 ���
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
// �ϼ�Ŭ���� / �߻�Ŭ���� / �������̽� ��� �� �����Ҽ� ����.
// Math , Integer, Frame, WindowAdapter ��� �ڹٿ��� �������ִ� �ֵ鵵 3���߿� �ϳ���.
// �ϼ�Ŭ������ �����ϴ� ���� = ��ϵ��� ó���Ҽ� �ְ� �̸� ���谡 �� �صΰ� ������ �����. 
// �߻�Ŭ����,�������̽��� �����ϴ� ����  = ???????????????












