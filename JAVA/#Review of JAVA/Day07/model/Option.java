package model;

public class Option {
	// 제한자(시야설정)
	// 와 별개로..필드나 메서드같은 경우는 추가적으로 static이란걸 설정할 수 있다.
	// 생성자는 안됨.
	// 이건 어떤효과를 주는거냐..
	// static 걸려있는 애들은, 프로그램 상에서 Option이라는 애를 사용하려고할 때,
	// 그 때, 미리 만들어진 상태로 대기, 그리고 다시 안만들어짐.
	int n;
	static String s;
	
	Option(){
		
	}
	void show(int k){
		s = "1"; //일반 메서드안에서는 static요소 사용 가능
	}
	static int hide(){
		// static 메서드안에서는 일반요소 사용 불가
		s ="1";
		//n =54; //static 필드가 아니므로 static 메서드안에서는 사용 불가
		return 0;
	}
	String info(){
		return "["+s+" "+n+"]";
	}
}
