// Object�� toString() / equals()�� �ڹٰ����ڶ�� �������̵带 �ϴ°� �⺻ �ų�.
import java.awt.Rectangle;
import java.awt.Frame;
public class Expert04 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(30, 20, 50, 10);
		Rectangle r2 = new Rectangle(30, 20, 50, 10);
		// toString() ���� ���� �� ��ü�� ������ �ִ� �ʵ尪�� 
		// Ȯ���Ҽ� �մ� ���ڿ��� ������������ �Ϲ������� ����ϰ� ����Ѵ�.
		System.out.println(r1.toString());
		
		Frame f = new Frame("���ڿ�");
		System.out.println(f.toString());
		// equals() ���� ���� �ʵ尪�� ���� ��ġ�ϴ°� �ƴѰ�..
		boolean b = r1 == r2;
		System.out.println(b);
		boolean b2 = r1.equals(r2);
		System.out.println(b2);
		
		// toString() ���� ���� �������̵带 �صθ� �μ����� ȿ������ �߻���.
		System.out.println();
		
	}
}





