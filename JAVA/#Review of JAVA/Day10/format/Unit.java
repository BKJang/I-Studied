package format;

//==========================================
// �߻�Ŭ���� - ������ Ȱ���� ���� Ʋ��Ƶ� ���� 
public abstract class Unit {
	String name;
	int x;
	public Unit(String name){
		this.name = name;
		this.x =0;
	}
	public void move(int x) {
		this.x =x;
	}
	public abstract boolean possible(int t);
	public abstract String info(); 
}
// �ʵ嵵 ������ �ְ�, �ϼ��� �޼��嵵 ������ �հ�
// �̿ϼ��޼��嵵 ������ �ִ� Ŭ����
// ��ü������ �ȵ� # 