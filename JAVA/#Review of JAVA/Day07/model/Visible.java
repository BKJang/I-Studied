package model;
//클래스 자체에는 default, public 설정 가능
//default는 다른 패키지에서 쓸 수가 없다.
public class Visible { //public을 붙이면 다른 패키지에서 쓸 수 있다.
//개별적으로 시야라는걸 설정해줄 수 있다.
	//이걸 설정을 안하면, 기본이 같은 패키지에 설계된 애들만 사용이 가능하다.
//JAVA의 시야에는 총 4단계가 있다.
	//1. private - 해당 클래스 안에서만 access가 됨
	//2. default(package) - 생략시 설정되는 기본 단계, 같은 패키지까지 access
	//3. protected - 다른 패키지가 되더라도, 가능성이 있다.
	//4. public - 다른 패키지여도 무조건 access 됨.
	//그걸 통해서 얻어내고자하는 효과가 있음.
	
	
	
//필드 2개
	int num;
	String str;
//생성자 2개
	Visible(){   }//생성자 만들시에 클래스 이름 그대로 만들면 됨.
	Visible(int n, String s){    }
//메서드 2개
	boolean show(int n) {
		return true;
	}
	String hide(String s){
		return "";
	}
}
