import java.awt.*;
import java.awt.event.*;
//=====================================================
//실제 이 구조를 잡아서 자바에서 어떤 형태로 제공이 되나.



//=====================================================
public class Expert05 {
	public static void main(String[] args) {
		Frame f = new Frame("다형성");
		f.setVisible(true);
			//x버튼을 누른다거나 그런 뻘짓을 할 때, 먼가 작동되게 하고 싶으면
			//Game 클래스 같이 비어있는 클래스를 설계해두고, 그 클래스를 extends를 걸고
			//설계해서 연동시켜달라고 한다.
		WindowAdapter wa = new Test();
		f.addWindowListener(wa); //Test 객체로 안받아들이고 WindowAdapter를 받아들임.
		//WindowAdapter에 있는 메서드로 받아들임.
	}
}

class Test extends WindowAdapter{
	public void windowClosing(WindowEvent e ){
		System.out.println("!!!!!");
	}
	
}
