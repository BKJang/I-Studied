// Object의 toString() / equals()는 자바개발자라면 오버라이드를 하는게 기본 매너.
import java.awt.Rectangle;
import java.awt.Frame;
public class Expert04 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(30, 20, 50, 10);
		Rectangle r2 = new Rectangle(30, 20, 50, 10);
		// toString() 같은 경우는 그 객체가 가지고 있는 필드값을 
		// 확인할수 잇는 문자열이 만들어질꺼라고 일반적으로 기대하고 사용한다.
		System.out.println(r1.toString());
		
		Frame f = new Frame("문자열");
		System.out.println(f.toString());
		// equals() 같은 경우는 필드값이 전부 일치하는가 아닌가..
		boolean b = r1 == r2;
		System.out.println(b);
		boolean b2 = r1.equals(r2);
		System.out.println(b2);
		
		// toString() 같은 경우는 오버라이드를 해두면 부수적인 효과들이 발생함.
		System.out.println();
		
	}
}





