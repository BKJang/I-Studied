package data;

public class Ball {
	int type;
	boolean mistake;
	// �⺻������ 0,false�� �����ǰ�
	public Ball() {
		this(0, false);
	}
	// type�� �����޴� ������ (mistake=false)
	public Ball(int type) {
		this(type, false);
	}
	// type�� mistake�� �����޴� ������
	public Ball(int type, boolean mistake){
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
	// ����� ����������� �׽�Ʈ
	
	public static void main(String[] args) {
		Ball b1 = new Ball();
		System.out.println(b1.info());
		Ball b2 = new Ball(3);
		System.out.println(b2.info());
		
		Ball b3 = new Ball(0, true);
		System.out.println(b3.info());
		
		int t =b3.getType();
		boolean b = b3.getMistake();
		
	}
	
}













