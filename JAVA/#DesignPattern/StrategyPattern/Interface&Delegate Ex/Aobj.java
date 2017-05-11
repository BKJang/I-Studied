package StrategyPattern;

public class Aobj {
	
	Ainterface ainterface;
	
	public Aobj() {
		ainterface = new AintfaceImpl();
	}
	
	public void funcAA(){
		
		// 다른 객체의 기능을 빌려 사용하는 것(Delegate)
		ainterface.funcA();
		ainterface.funcA();
		
		// System.out.println("AAA");
		// System.out.println("AAA");
		
		
		// ~ 기능이 필요합니다. 개발해주세요.
	}
}
