//PrototypePattern : 생산 비용이 높은 인스턴스를 복사를 통해서 쉽게 생성할 수 있도록 하는 패턴
/* 생산 비용이 높은 경우 : 
 * - 종류가 너무 많아서 클래스로 정리되지 않는 경우
 * - 클래스로부터 인스턴스 생성이 어려운 경우
 */
package PrototypePattern;
/*요구사항
 * 일러스트레이터와 같은 그림 그리기 툴을 개발중입니다.
 * 어떤 모양을 그릴 수 있도록 하고 복사 붙여넣기 기능을 구현해주세요.
 * 복사 후 붙여넣기를 했을 때 겹치지 않도록.
 */
public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle1 = new Circle(1, 1, 3);
		Circle circle2 = circle1.copy();
		
		System.out.println(
				circle1.getX() + ", " +
				circle1.getY() + ", " +
				circle1.getR());
		
		System.out.println(
				circle2.getX() + ", " +
				circle2.getY() + ", " +
				circle2.getR());
	}
}
