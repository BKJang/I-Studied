public class App01 {
	public static void main(String[] args) {
		// new Hitter();
		// System.out.println(new Hitter());
		Hitter one = new Hitter();
			one.name = "�蹮ȣ";
			one.game = 33;
			one.tot = 134;
			one.hit = 68;
			one.hr = 1;
		Hitter two;
			two = new Hitter();
			two.name = "������";
			two.game = 32;
			two.tot = 110;
			two.hit = 45;
			two.hr = 7;
		Hitter t = two;
		System.out.println(t.name+"/"+t.game+"/"+t.tot);	
	}
	// Ÿ�� ���.. ó���� �޼���� �����ϰ�, ����ϰ�.. ����
	// �̸�, �ʿ��ѵ�������, �߻������� 
	
	
	
}
