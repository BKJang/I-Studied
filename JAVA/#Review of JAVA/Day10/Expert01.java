import format.TestUnit;
import format.Unit;

public class Expert01 {
	public static void main(String[] args) {
		Unit u = new TestUnit("�׽�Ʈ");	// null ������ , �ƹ��͵� ������ �ȵ��ִ� ��Ȳ
		 
		// ������ �ȵ��ִ� ��Ȳ���� Ÿ�� ���� �����ϸ� ������ �߻�.
		int t = -3;
		if(u.possible(t)) {
			u.move(t);
			System.out.println(u.info());
		}else {
			System.out.println("�̵� �Ұ���!");
		}
		
	}
}
