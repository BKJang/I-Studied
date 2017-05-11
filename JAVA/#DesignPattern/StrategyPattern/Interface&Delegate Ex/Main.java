package StrategyPattern;

public class Main {
	
	public static void main(String[] args){
		Ainterface ainterface = new AintfaceImpl();
		
		//기능을 사용할 수 있는 통로 제공
		ainterface.funcA();
		
		//Delegate 
		Aobj aObj = new Aobj();
		aObj.funcAA();
	}
}