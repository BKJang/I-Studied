import java.awt.Rectangle; //다른 곳에 작성된 

public class Advance02 {
	public static void main(String[] args) {
		//필요한 일을 처리할 수 있게 설계를 할 때,
		//필드, 메서드 외에 추가적으로 더 설정할 수 있는게 있다.
		//개념을 살펴보기 위해서, 하나를 좀 살펴보자.
		Rectangle r1 = new Rectangle();
		r1.x = 4;
		r1.y = 10;
		r1.width = 40;
		r1.height = 70;
	double e = r1.getMaxX();
	System.out.println("E==" +e);
	r1.translate(5, 20);//각 x,y값에 더해짐
	System.out.println(r1.x + "/" + r1.y);
	System.out.println(r1.getMaxX());
	
	r1.setBounds(45, 10, 10, 20);//값 변경
	String m = r1.toString();
	System.out.println(m);
	//==============================================
	Rectangle r2 = new Rectangle(10, 20, 50, 90);
	System.out.println(r2.toString());
	
	Rectangle r3 = new Rectangle(50, 70);
	System.out.println(r3.toString());//출력해볼것!
	//생성자체를 다양한 방법으로 할수 있게 유도가 가능
	//생성과 동시에 어떤 작업이 일어나게 설정이 가능
	//이런 일을 담당하는게 생성자(Constructor)
	}
}
