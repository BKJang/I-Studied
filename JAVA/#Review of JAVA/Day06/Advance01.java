/*
 * �����Ͱ��� - �ڷ��� �����ؼ�
 * ������ó�� - �Լ�ȭ ���Ѽ�
 * 	���α׷��� ���鶧�� �Լ����� ���� �����ΰ� �ʿ��� �� �ҷ��ٰ� �帧�� ����� ����! <-������� �����Ѱ� ��������
 * ��ü�������� �Ѿ���� ������ �ϳ� �߰� �ȴ�.
 * ���ʿ� �ڷ��� ���踦 �� ��, �� �ȿ� �޼������ �Բ� ����
 * 
 * ������ݰ�� ������ �غ��ڸ鼭, Park�� �����ϰ�,
 * �����ð��� ���� ����� ����ϴ� �Լ��� �����ôµ�..�̰� ��ü���������� ó���ϸ�
 */
public class Advance01 {
	public static void main(String[] args) {
		Park2 p = new Park2();
			p.no = "11�� 4965";
			p.use = 79;
			
			int c = p.cost();
			System.out.println("C==" +c);
		Park2 p2 = new Park2();
			p.no = "14�� 1142";
			p.use = 19;
			p2.change("31�� 1234", 19);
			System.out.println(p2.info());
			
			int c2 = p2.cost();
			System.out.println("C2==" + c2);
			
			p2.use +=50;
			System.out.println(p2.use);
			System.out.println(p2.cost());
		}
}
