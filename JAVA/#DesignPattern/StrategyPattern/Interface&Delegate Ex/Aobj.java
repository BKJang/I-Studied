package StrategyPattern;

public class Aobj {
	
	Ainterface ainterface;
	
	public Aobj() {
		ainterface = new AintfaceImpl();
	}
	
	public void funcAA(){
		
		// �ٸ� ��ü�� ����� ���� ����ϴ� ��(Delegate)
		ainterface.funcA();
		ainterface.funcA();
		
		// System.out.println("AAA");
		// System.out.println("AAA");
		
		
		// ~ ����� �ʿ��մϴ�. �������ּ���.
	}
}
