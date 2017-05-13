package AdapterPattern;
/*�䱸����
 * �� ���� ���� ���� ������ �����ϴ� ��ü�� ����ÿ�
 * 1. ���� �� ���� ���� ��ȯ(Float)
 * 2. ���� ���� ���� ��ȯ(Float)
 * 
 * ���� ��ü �̸��� Adapter
 * 
 * Math Ŭ������ �� ��� ������ ���ϴ� �Լ��� �̹� �����Ǿ��ֽ��ϴ�.
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
