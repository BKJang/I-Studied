import format.*;

public class Expert02 {
	public static void main(String[] args) {
		Compare c = new TestCompare();
		boolean t = c.same(44, 44);
		System.out.println(t);
		
		boolean t2 = c.like(43, 41);		// �� ���� ���̰� 5���϶�� Ʈ�簡 �߰�
		System.out.println(t2);
	}
}
