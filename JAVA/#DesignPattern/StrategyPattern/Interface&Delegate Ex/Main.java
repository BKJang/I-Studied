package StrategyPattern;

public class Main {
	
	public static void main(String[] args){
		Ainterface ainterface = new AintfaceImpl();
		
		//����� ����� �� �ִ� ��� ����
		ainterface.funcA();
		
		//Delegate 
		Aobj aObj = new Aobj();
		aObj.funcAA();
	}
}