package app;
import javax.swing.JOptionPane;

public class StringEx02 {
	public static void main(String[] args) {
		String menu = "�����Ǵ¸޴�\n�浡��#����#����\n��sub#����#����";
		String in = JOptionPane.showInputDialog(menu);
		
		String[] stri = in.split("#");//�ԷµǴ� ���� #�� �������� split
		
		int a1 = Integer.parseInt(stri[1]);//����1(String �� -> int������)
		int a2 = Integer.parseInt(stri[2]);//����2(String �� -> int������)
		
		if(stri[0].equals("����")){
			System.out.println(a1+a2);
		}else if(stri[0].equals("sub")){
			System.out.println(a1-a2);
		}else{
			System.out.println("�����Դϴ�");
		}
	}
}
