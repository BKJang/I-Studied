package review;
import java.awt.Frame;

import javax.swing.JOptionPane;
public class CircleTest {
	public static void main(String[] args) {
		//instance of ����
		//Object o = new Frame();
			//System.out.println(o instanceof Object);//o��ü�� Object�� �Ӽ��� �ֳ�?
			
		Circle c1 = new Circle(1.4, 2, 6);
		Circle c2 = new Circle(1.4, 2, 6);
		System.out.println(c1==c2);//��°� : false
		
		boolean r = c1.equals(c2);// ��ü������ ��
		System.out.println(r);
		System.out.println(c1.toString());
		
		String s1 = JOptionPane.showInputDialog("������?");
		String s2 =JOptionPane.showInputDialog("���� x?");
		String s3 =JOptionPane.showInputDialog("���� y?");//�Է�â�� ���� �Է��ϸ� String���� �ۿ� �ȹ޾���
		//==> �ν��Ͻ� ���� ����س� �ʿ伺.
		
		Circle c3 = new Circle(Double.parseDouble(s1), Integer.parseInt(s2), Integer.parseInt(s3));
		//Circle c1 = new Circle(1.4, 2, 6); �̰Ͱ� �Ȱ��� ����..
		//���� ���Ű����� d1=Double.parseDouble(s1)ó�� ���� ������ �س��°� ���� �� �ִ�.
		System.out.println(c3);
		
	}
}
