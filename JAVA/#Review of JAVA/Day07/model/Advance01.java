package model;//���� ��Ű���� Visible�� �ֱ� ������ �� �� ���� �ִ� ��
			  //�ٸ� ��Ű���� ���� ������ �Է��ϸ� ���� ��.

public class Advance01 {
	public static void main(String[] args) {
		new Visible();
		Visible s = new Visible(3, "�þ�");
		System.out.println(s.num);
		s.str = "�޷�";
		s.show(11);
		s.hide("!!");
	}
}
