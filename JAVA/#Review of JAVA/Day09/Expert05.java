import java.awt.*;
import java.awt.event.*;
//=====================================================
//���� �� ������ ��Ƽ� �ڹٿ��� � ���·� ������ �ǳ�.



//=====================================================
public class Expert05 {
	public static void main(String[] args) {
		Frame f = new Frame("������");
		f.setVisible(true);
			//x��ư�� �����ٰų� �׷� ������ �� ��, �հ� �۵��ǰ� �ϰ� ������
			//Game Ŭ���� ���� ����ִ� Ŭ������ �����صΰ�, �� Ŭ������ extends�� �ɰ�
			//�����ؼ� �������Ѵ޶�� �Ѵ�.
		WindowAdapter wa = new Test();
		f.addWindowListener(wa); //Test ��ü�� �ȹ޾Ƶ��̰� WindowAdapter�� �޾Ƶ���.
		//WindowAdapter�� �ִ� �޼���� �޾Ƶ���.
	}
}

class Test extends WindowAdapter{
	public void windowClosing(WindowEvent e ){
		System.out.println("!!!!!");
	}
	
}
