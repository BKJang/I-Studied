
public class App02 {
	public static void main(String[] args) {
		int time = (int)(Math.random() * 1200);;
		
		System.out.println("Time = " + time + "��");
		//�������, �񱳿����� ��� ��� true, false ������� ����
		
		// �� ��ġ�� 600 �̻��ΰ�?
		boolean t1 = time >= 600;
		System.out.println("�ð��� 600�̻��ΰ�? : " + t1);
		// ��Ȯ�ϰ� �ð����� ���������� true, false
		boolean t2 = (time % 60) == 0;
		System.out.println("�� �¾ƶ������°�? " + t2);
		// �ð� ������ ���߱� ���ؼ� �� �ʿ��� ��?
		int t3 = 60 - time % 60; //�ȳ���
		System.out.println("�ð� ������ ���߱� ���ؼ� �� �ʿ��� ��? " + (t3==60 ? 0 : t3) +"��");
		//10�д����� ���߱� ���� �� �ʿ��� ��?
		int t4 = t3 % 10;
		System.out.println("10�д������ ? " + t4 + "��");
		//�̻���� �����(10�д� 500��)
		int p2 = (t3==0) ? 0 : 500;
		int pay = (time/10*500) + p2;
		System.out.println("������ ����� ? " + pay + "��");
				
	}
}
