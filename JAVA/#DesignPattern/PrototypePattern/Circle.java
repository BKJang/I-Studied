package PrototypePattern;

public class Circle extends Shape{
	private int x, y, r; //(중심값, 반지름)
	

	public Circle(int x, int y, int r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	Circle copy() throws CloneNotSupportedException {
		Circle circle = (Circle) clone();
		/* 만약, 색깔 등등의 여러 속성이 들어가게 되면 복잡해진다.
		 * clone이라는 함수를 통해 효율적으로 가능하다.(복잡한 인스턴스를 쉽게 생성)
		 */
		circle.x += 1;
		circle.y += 1;
		return circle;
	}
}
