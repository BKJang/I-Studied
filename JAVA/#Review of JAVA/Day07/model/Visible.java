package model;
//Ŭ���� ��ü���� default, public ���� ����
//default�� �ٸ� ��Ű������ �� ���� ����.
public class Visible { //public�� ���̸� �ٸ� ��Ű������ �� �� �ִ�.
//���������� �þ߶�°� �������� �� �ִ�.
	//�̰� ������ ���ϸ�, �⺻�� ���� ��Ű���� ����� �ֵ鸸 ����� �����ϴ�.
//JAVA�� �þ߿��� �� 4�ܰ谡 �ִ�.
	//1. private - �ش� Ŭ���� �ȿ����� access�� ��
	//2. default(package) - ������ �����Ǵ� �⺻ �ܰ�, ���� ��Ű������ access
	//3. protected - �ٸ� ��Ű���� �Ǵ���, ���ɼ��� �ִ�.
	//4. public - �ٸ� ��Ű������ ������ access ��.
	//�װ� ���ؼ� �������ϴ� ȿ���� ����.
	
	
	
//�ʵ� 2��
	int num;
	String str;
//������ 2��
	Visible(){   }//������ ����ÿ� Ŭ���� �̸� �״�� ����� ��.
	Visible(int n, String s){    }
//�޼��� 2��
	boolean show(int n) {
		return true;
	}
	String hide(String s){
		return "";
	}
}
