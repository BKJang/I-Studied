
public class App01 {
	public static void main(String[] args) {
		// Hitter2��� �ְ� �Ʒ��� ���� ó���� �� �� �ְ� ����
		Hitter2 h = new Hitter2();
			h.init("�蹮ȣ", 33, 134, 56, 1);
			
			double d = h.average();
			
			System.out.println("d==" +d);
			
			String m = h.info();
			System.out.println(m);
			
			h.add(4, 2);
			System.out.println(h.info());
			
		Hitter2 h2 = new Hitter2();
			h2.init("������", 28, 99, 35, 4);
			System.out.println(h2.info());
			double dd = h2.average();
			System.out.println(dd);
	}
}
