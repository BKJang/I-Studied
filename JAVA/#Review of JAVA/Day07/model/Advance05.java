package model;
//static ����..
public class Advance05 {
	public static void main(String[] args) {
		// �̸� ��������ٴ°�..
		// Ŭ���� ����� �Ͼ�� �� �� ������.
		// static �ֵ��� ������ ���ϰ� ������ ��(new�� �ʿ����)
		Option.s = "����";
		Option.hide();
		
		Option n1 = new Option();
			System.out.println(n1.s);
			n1.n=44;
		Option n2 = new Option();
			System.out.println(n2.s);
			n2.n=11;
		System.out.println(n1.info());
		System.out.println(n2.info());
		// �̰ɷ� ���� ȿ��?
		// �޼��忡 static�� �ٿ��� ��� ȿ��..
		// �ʵ忡 static�� �ٿ��� ��� ȿ��..
	}
	
}
