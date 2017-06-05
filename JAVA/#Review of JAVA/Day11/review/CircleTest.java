package review;
import java.awt.Frame;

import javax.swing.JOptionPane;
public class CircleTest {
	public static void main(String[] args) {
		//instance of 연산
		//Object o = new Frame();
			//System.out.println(o instanceof Object);//o객체가 Object의 속성이 있냐?
			
		Circle c1 = new Circle(1.4, 2, 6);
		Circle c2 = new Circle(1.4, 2, 6);
		System.out.println(c1==c2);//출력값 : false
		
		boolean r = c1.equals(c2);// 객체끼리의 비교
		System.out.println(r);
		System.out.println(c1.toString());
		
		String s1 = JOptionPane.showInputDialog("반지름?");
		String s2 =JOptionPane.showInputDialog("중점 x?");
		String s3 =JOptionPane.showInputDialog("중점 y?");//입력창을 띄우고 입력하면 String으로 밖에 안받아짐
		//==> 인스턴스 값을 출력해낼 필요성.
		
		Circle c3 = new Circle(Double.parseDouble(s1), Integer.parseInt(s2), Integer.parseInt(s3));
		//Circle c1 = new Circle(1.4, 2, 6); 이것과 똑같은 형식..
		//자주 쓸거같으면 d1=Double.parseDouble(s1)처럼 변수 설정을 해놓는게 편할 수 있다.
		System.out.println(c3);
		
	}
}
