
public class App02 {
	public static void main(String[] args) {
		Pitcher p = new Pitcher();
		
		Pitcher p1 = new Pitcher("������"); //�̸��� ������ ���·� Ȯ���ǰ� ������ 0.
		
		Pitcher p2 = new Pitcher("��Ŀ", 8, 6, 1);//�̸�,����,�¼�,�м�
		
		//������ ���� �޼����
		String m = p1.info();
		System.out.println(m);
		
		double wr = p2.rate();
		System.out.println(wr);
		
		p1.add(0); //0, -1, 1 �����߿� �ϳ��� �������
		//0�̸� ���º�, -1�̸� ��, 1�̸� ��
		System.out.println(p1.info()); //���Ӽ��� �ö������� ��
		
		
	}
}
