
public class Basic02 {
	public static void main(String[] args) {
		// ��ġ�� �����Ͱ� �ƴԿ��� �ұ��ϰ� + ������ ó���Ǵ� �����Ͱ� ����
		// ���ڿ� .. String
		String s = "java" + "prgram";
		String ss = s + "!!!";
		System.out.println(ss);
		
		// ���ڿ����� ��� �����Ͱ� �� ��������.
		int n = 4;
		int nn = 5;
		String sss = ss + n;
		System.out.println(sss); // �� ��ġ�� ���Խ�Ų ���ڿ��� �������
		System.out.println(sss+nn);
		
		System.out.println("n�� ���� " + n + "�Դϴ�.");
	}
}
