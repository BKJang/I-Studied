import java.lang.Math;
import java.lang.Object;

public class Expert03 {
	public static void main(String[] args) {
		// �ʼ�Ŭ���� .. 
			// API (Ŭ���� ����) ��� �� ���캸�鼭.. www.sun.com
		 	// download �� java for developers �� java APIs �� java SE 8 ��
		
		// java.lang.��Ű�� �Ҽ��� Ŭ��������� ���캸��.
			// �� �Ҽ��� Ŭ�������� �⺻ import ó�� �Ǿ��ִ�.
		Math.random(); 
		// 1. Object �� Ŭ���� - ��� Ŭ������ �θ� �Ǵ� �⺻ Ŭ���� .
			// extends �� �Ȱɰ� ���谡 ���� ������ �ڵ� extends�� �ɸ��� ������.
			// Object �� ������ �ִ� �޼���� � ��ü�� �� ������ �ۿ� ����,
			// Object Ÿ�Կ��� ��� ��ü�� ������ �����ϴ�.
		Object o = new Object(	);
		// �Ŭ������ �����ϴ� ������ �ۿ� ���� �޼��� �� 
		// �ΰ��� �޼��� ������ ����� �صμž� �ȴ�. �������̵� ��õ�ϴ�
			// public String toString() : � ���·�?? 
			// public boolean equals(Object obj) : ����·� ?
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








