
public class App01 {
	public static void main(String[] args) {
		
		String[] names = {"����", "����", "����", "���", "���"};
		String[] jobs = {"���ΰ�", "�����ΰ�", "������", "����", "������"};
		String[] attr = {"��", "�ҼӼ�", "���Ӽ�"};
		
		int r1 = (int)(Math.random() *5);//0~4
		int r2 = (int)(Math.random() *5);//0~4
		int r3 = (int)(Math.random() *3);//0~2
		
		
		System.out.println("�̸�: " + names[r1]);
		System.out.println("����: " + jobs[r2]);
		System.out.println("�Ӽ�: " + attr[r3]);
		int r4 = 11 + (int)(Math.random() *9); //11 ~ 19
		System.out.println("���� : " + r4);
		
	//-10 ~ 10 : (int)(Math.random() *21) -10
	}
}
