import data.SuperPitcher;
import data.Ball;

public class Expert03 {
	public static void main(String[] args) {
		// Pitcher�� �������� ����
		SuperPitcher sp = new SuperPitcher("�豤��", 1);
			//������ �� �ְ� SuperPitcher���ٰ� ������ ����
		
		//���� Pitcher �ȿ��� �̸��̶� ü���� ���ڿ��� ������ִ� ����� �ִ�.
		//�ڽ��ִ°������� �����ؼ� ���ڿ��� ������ִ� ����� �߰�.
		String st = sp.status();
		System.out.println(st);
		//���� Pitcher �ȿ��� �̸��̶� ü���� ���ڿ��� ������ִ� ����� �ִ�.
		//�ڽ��ִ°������� �����ؼ� ���ڿ��� ������ִ� ����� �߰�.
		String m = sp.detailStatus();
		System.out.println(m);
		Ball t = sp.pitching(1);
		System.out.println(sp.detailStatus());
	}
}
