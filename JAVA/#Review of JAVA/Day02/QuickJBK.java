
public class QuickJBK {
	public static void main(String[] args) {
		String a = args[0];
		String b = args[1];
		String c = args[2];
		
	System.out.println("��Ʈ�� �� ���� ������");
	System.out.println("��ǰ�� : " + a);
	System.out.println("�߷� : " + b);
	System.out.println("�Ÿ� : " + c);
	int b1 = Integer.parseInt(b);
	int b2 = b1/2;
	int b3 = b1%2;
	int b4 = (b3 == 0) ? 100*b2 : 100*b2+100; //2kg�� 100��
	
	int c1 = Integer.parseInt(c);
	int c2 = c1/100;
	int c3 = c1%100;
	int c4 = (c3 == 0) ? 100*c2 : 100*c2+100; //100m�� 100��
	
	System.out.println("����� : " + (b4*c4) + "��");
	System.out.println(c1<=1000 ? "1�ð��̳��� �����մϴ�" : "1�ð����Ŀ� �����մϴ�");
	
	}
}
