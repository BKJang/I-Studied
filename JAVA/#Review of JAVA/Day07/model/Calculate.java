package model;
// static-method
// Ŭ���� ���踦 �ϴٺ���, ��ɵ鸸 ���� ���·� ���谡 �� ���� �ִ�.
// �Ϲ� �ʵ带 �����ϴ�..
// �׷� �� ����� ������ �ϴ� ȿ���� �߻���
public class Calculate {
	//
	public static int max(int a, int b){
		return a>b ? a : b;
	}
	public static int max(int a, int b, int c){
		int temp = max(a,b);
		return max(temp, c);
	}
	public static double max(double c, double d){
		return c>d ? c : d;
	}
}
