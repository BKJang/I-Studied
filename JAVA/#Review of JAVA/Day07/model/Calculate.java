package model;
// static-method
// 클래스 설계를 하다보면, 기능들만 가진 형태로 설계가 될 때도 있다.
// 일반 필드를 사용안하는..
// 그럴 때 사용을 빠르게 하는 효과가 발생함
public class Calculate {
	//
	public static int max(int a, int b){
		return a>b ? a : b;
	}
	public static int max(int a, int b, int c){
		int temp = max(a,b);
		return max(temp, c);
	}
	public static double max(double c, double d){
		return c>d ? c : d;
	}
}
