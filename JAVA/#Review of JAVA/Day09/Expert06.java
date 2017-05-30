import poly.*;
import poly2.*;
import java.awt.event.WindowAdapter;
public class Expert06 {
	public static void main(String[] args) {
		new WindowAdapter();
		new Person();
		new Game();//추상 클래스는 이런 식의 객체 생성이 막힘
		//(만드는 목적이 아닌 틀을 잡아두는 클래스)
		Person p = new PartTime(20, 10);
	}

}
