import notpoly.*;
import poly.PartTime;


public class Expert02 {
	public static void main(String[] args) {
		//��� ���캻 ����(������/polymorphism)�� �̿��ؼ� ��� ������ �� �ִ°�?
			//���� ������ instanece ���� �ش� Ÿ���� ���Լ� ���� Ÿ�����ε�
			//�޾Ƽ� ���� ����
			//������ѵ� Ÿ������ ȣ�� �� �� �ִ°� ����� �ϴ���, ���� instance�޼��尡 �۵���
			//ȣ���� �ȵǴ� �κе� ������(���� Ÿ���� ���� �߰��� �޼��� ���� ���)
		
		//1. ���� ��ü�� �ϳ��� Ÿ������ ó���� ����
			//���� ����...
		Employee e = new Employee(2000000);
		PartTime p = new PartTime(6100, 10);
		
		int t1 = Calc.income(e);
		System.out.println(t1);//12����ġ�� �޿�
		int t2 = Calc.income(p);
		System.out.println(t2);//12����ġ�� �޿�
		
		
		//2. ���� ���谡 ���� ���� ��ü�� ������� ó���� ����
		
	}
}
