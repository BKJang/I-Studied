import java.awt.Rectangle; //�ٸ� ���� �ۼ��� 

public class Advance02 {
	public static void main(String[] args) {
		//�ʿ��� ���� ó���� �� �ְ� ���踦 �� ��,
		//�ʵ�, �޼��� �ܿ� �߰������� �� ������ �� �ִ°� �ִ�.
		//������ ���캸�� ���ؼ�, �ϳ��� �� ���캸��.
		Rectangle r1 = new Rectangle();
		r1.x = 4;
		r1.y = 10;
		r1.width = 40;
		r1.height = 70;
	double e = r1.getMaxX();
	System.out.println("E==" +e);
	r1.translate(5, 20);//�� x,y���� ������
	System.out.println(r1.x + "/" + r1.y);
	System.out.println(r1.getMaxX());
	
	r1.setBounds(45, 10, 10, 20);//�� ����
	String m = r1.toString();
	System.out.println(m);
	//==============================================
	Rectangle r2 = new Rectangle(10, 20, 50, 90);
	System.out.println(r2.toString());
	
	Rectangle r3 = new Rectangle(50, 70);
	System.out.println(r3.toString());//����غ���!
	//������ü�� �پ��� ������� �Ҽ� �ְ� ������ ����
	//������ ���ÿ� � �۾��� �Ͼ�� ������ ����
	//�̷� ���� ����ϴ°� ������(Constructor)
	}
}
