package source;

import java.util.Date; //����,��⸦ �� ���� ��.

public class Advance04 {
	public static void main(String[] args) {
		Date d1 = new Date(456484631564L);//long ��ġ�� ������� �� ����
		// �����ϸ鼭 ���� ��ġ��, 1970�� 1�� 1�� 00:00:00 GMT�� ���� �귯��
		// milli second��� �ν�
		// �װ� ���� ��¥�� �������.
		
		String m = d1.toString();
		System.out.println(m);
		
		long t = System.currentTimeMillis();//�۵����������� �ð�
		System.out.println(t);
		Date d2 = new Date(t);//���� �ð��� ������ ���� ��¥�� ����
		System.out.println(d2.toString());
		Date d3 = new Date();//�⺻������ �ϸ� �˾Ƽ� ó������
		System.out.println(d3.toString());
		
		
		//�� �ȿ� ����鼭 ���޵Ǵ� ������ ������ ���ٵ�, �ʵ���� �������� Ȯ���� ���� ����.
		//������ ���ÿ� ��,��,��,��,��,�ʰ� �� �м��� ����.�ʵ带 ���½��״ٸ�,
		//��ġ�� �ٲ��ִµ� �м������ ���� �� �ִ�. ���� ������ �ɾ��.
		d3.setTime(1000L*60*60*24);//�Ϸ簡 ������
		//���ܵǾ� �ֱ� ������ �̷������� ���� ����
		//Advance03�� ������ p1.win�� �ȵ� ��, setter�� ����ϴ� ������ ����.
		
		System.out.println(d3.toString());
	}
}
