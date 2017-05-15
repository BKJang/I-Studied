package data;

// 추가분만 더 설계해서 사용하는게 가능 - 동시에 여러개는 안되고.
// 상속이라고 부르는 개념
	// 실제 설계되는 클래스를  자식클래스 ,서브클래스, 하위클래스
	// 원본이 되는 클래스를 부모클래스, 슈퍼클래스, 상위클래스
// 이걸 할때 주의점들이 있다. 
	// 1. 아무거나 다 되는건 아니고, 원본이 final 클래스가 아니여야 된다.
	// 2. 하위 클래스의 상위쪽의 모든 멤버(필드,메서드)를 쓸수 있는건 아니다.
		// 제한에 막히는건 어쩔수 없다.
	// 3. 부모부분이 만들어질 때 기본생성자를 통해서 슈퍼부분이 만들어지게 되있어서
		// 원본에 기본생성자가 없다면 다른 생성자를 호출할 수 있게 유도를 해야된다.
public class SpeedBall extends Ball {
	int speed;
	public SpeedBall(int t, boolean f, int s) {
		this.type = t;	// type..?
		mistake = f;	// mistake..?
		speed = s;
	}
	public String detailInfo() {
		return info()+"/구속:"+speed;
	}
}
