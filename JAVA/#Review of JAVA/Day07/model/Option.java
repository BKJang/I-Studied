package model;

public class Option {
	// ������(�þ߼���)
	// �� ������..�ʵ峪 �޼��尰�� ���� �߰������� static�̶��� ������ �� �ִ�.
	// �����ڴ� �ȵ�.
	// �̰� �ȿ���� �ִ°ų�..
	// static �ɷ��ִ� �ֵ���, ���α׷� �󿡼� Option�̶�� �ָ� ����Ϸ����� ��,
	// �� ��, �̸� ������� ���·� ���, �׸��� �ٽ� �ȸ������.
	int n;
	static String s;
	
	Option(){
		
	}
	void show(int k){
		s = "1"; //�Ϲ� �޼���ȿ����� static��� ��� ����
	}
	static int hide(){
		// static �޼���ȿ����� �Ϲݿ�� ��� �Ұ�
		s ="1";
		//n =54; //static �ʵ尡 �ƴϹǷ� static �޼���ȿ����� ��� �Ұ�
		return 0;
	}
	String info(){
		return "["+s+" "+n+"]";
	}
}
