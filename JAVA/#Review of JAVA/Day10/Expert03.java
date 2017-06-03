import java.lang.Math;
import java.lang.Object;

public class Expert03 {
	public static void main(String[] args) {
		// 필수클래스 .. 
			// API (클래스 사전) 라는 걸 살펴보면서.. www.sun.com
		 	// download → java for developers → java APIs → java SE 8 →
		
		// java.lang.패키지 소속의 클래스들부터 살펴보자.
			// 이 소속의 클래스들은 기본 import 처리 되어있다.
		Math.random(); 
		// 1. Object 란 클래스 - 모든 클래스의 부모가 되는 기본 클래스 .
			// extends 를 안걸고 설계가 들어가게 됫을때 자동 extends가 걸리게 되있음.
			// Object 가 가지고 있는 메서드는 어떤 객체던 다 가질수 밖에 없고,
			// Object 타입에는 어떠한 객체던 연결이 가능하다.
		Object o = new Object(	);
		// 어떤클래스를 설계하던 가질수 밖에 없는 메서드 중 
		// 두가지 메서드 정도는 기억을 해두셔야 된다. 오버라이드 추천하는
			// public String toString() : 어떤 형태로?? 
			// public boolean equals(Object obj) : 어떤형태로 ?
		Data d1 = new Data(5, 2);
			System.out.println( d1.toString() );
		Data d2 = new Data(5, 2);
			boolean z = d1.equals(d2);
			System.out.println(z);
		
			System.out.println(d1);
	}
}
//===================================================================================
class Data {
	int x;
	int y;
	Data(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString(){
		return "{x="+x+",y="+y+"}";
	}
	public boolean equals(Object obj) {
		Data t = (Data)obj;
		if(this.x != t.x)
			return false;
		else if(this.y != t.y)
			return false;
		else 
			return true;
	}
}








