
public class Advance04 {
	public static void main(String[] args) {
		double a = rate(169, 65);
		System.out.println("a == " + a);
		
		String s = channel(9);
		System.out.println(s);
		System.out.println( channel(11) );
		double e = power(3, 4);
		System.out.println(e);	// 81.0
		System.out.println(power(2, -2));	// 0.25
	}

	// �̶����� ������ó�� �غ����߿� ��� �޼���� ��������.
	// 1) ����,ü�߿� ���� ��ü���� ���#
	// ��̸����� ���鲫��(rate),
	// �ʿ��ѵ����ʹ� �հ�(int ����, intü��), �߻���ų �����(double ��ü����)
	static double rate(int c, int k) {	// day04#Basic03
		double r = 0.0;
		return r;
	}
	// 2) ��ȣ�� ���� ä�ι��ڿ� ���
	// ��̸����� ���鲨�� (channel)
	// �ʿ��� ������ (int ä�ι�ȣ) , �߻���ų ����� String 
	static String channel(int ch) {	// day04#Basic04
		String m="UNDEFINED";	// 5SBS,7KBS2,9MBC,11KBS1 �̰Ÿ� ó��
		return m;
	}
	// 3) ������ ���
	// ��̸����� ���鲫�� (power)
	// �ʿ��� ������ (int ����, int ȸ��)  �߻���ų ����� double
	static double power(int a, int b) {	// day05#App02
		double r=0.0;
		return r;
	}
	
}







