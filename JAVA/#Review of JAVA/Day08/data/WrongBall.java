package data;

// �̷��Ե� �Ҽ� �ְ�����..
public class WrongBall {
	int type;
	boolean mistake;
	int speed;
	// �⺻������ 0,false�� �����ǰ�
	public WrongBall() {
		this(0, false);
	}
	// type�� �����޴� ������ (mistake=false)
	public WrongBall(int type) {
		this(type, false);
	}
	// type�� mistake�� �����޴� ������
	public WrongBall(int type, boolean mistake){
		this.type = type;
		this.mistake = mistake;
	}
	// �� �ʵ庰 getter �߰�(�� ���� ��Ű��)
	public int getType() {
		return type;
	}
	public boolean getMistake() {
		return mistake;
	}
	// ���ڿ�String ������ִ� �޼��� �߰�
	public String info() {
		// 0 : �н�Ʈ�� , 1 : Ŀ�� , 2 : �����̴� 3 : ü������
		String[] strs = {"�н�Ʈ��", "Ŀ��", "�����̴�", "ü������"};
		String rst = mistake ? "(����)" : "";
		
		return "���� = " +strs[type] + rst;
	}
	// ����� ���������
}
