import javax.swing.JOptionPane;

public class Essential01 {
	public static void main(String[] args) {
		
		String in = JOptionPane.showInputDialog("�����ĺ����� : 1q2w3e");
		System.out.println(in);
		System.out.println(in == "1q2w3e");
		
		//�׷��ٸ� ���ڿ� �񱳴�??
		System.out.println(in.equals("1q2w3e"));//��ü�� �񱳰� �ƴ� ������ ��
		//���ڿ� ����..
		//String - ���ڿ��� ��ü���·� ������.
		char[] ch = {'��', '��', '��', '��'};
		String s1 = new String(ch);
		String s2 = new String("program");//s2��ü�� "program"�̶� ���ڿ��� ��
		//String �����͸� char[] �迭�� �ѱ��ھ� ������ �ְ�, �̰� ���� � �۾��� �� �� �ְ�
		//��ɵ��� ����� ��ü
		
		//String ������ ���� ����, new�� ���� �ڵ����� �����ǰ� �ص� Ư�� ���̽�
		String s3 = "���α׷�";//��ü ������new�� �ʿ����.
		String s4 = "���α׷�";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		//==================================
		System.out.println(s1 == s3); // == ����ü�� ����.(�⺻���� �ƴϸ� ��ü�� ��)
		System.out.println(s1 == s2);
		System.out.println(s2 == s4);
		//���ڿ� �񱳸� ==�ϸ� 100���� false�� �����Ѵ�. ��ü���̹Ƿ�
		System.out.println(s3 == s4);//�̰� true�� �ߴ� ������
		//new ���� �����Ǵ� String ��ü���� �ڵ������ǹǷ� ���ڿ��� ���� ������ �ȴ�.
		//���� ���ڿ��� �ٽ� �ȸ����, �ѹ��̶� ������ �� ��ü��� ��� ���� ���� ������� �����ȴ�.
		
		
	}
	
	
	
}
