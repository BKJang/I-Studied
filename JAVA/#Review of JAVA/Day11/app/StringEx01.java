package app;

import javax.swing.JOptionPane;

public class StringEx01 {
	public static void main(String[] args) {
		
		String ans = "programming";
		String s1 = JOptionPane.showInputDialog("������ �ϳ� �Է�");
		//�Է��� �ް�, �Է¹��ڴ� �ϳ���!!
		
		//���������϶� �����Դϴ�.
		
		//�װ� �ƴ϶�� �м��� �ؼ�..
		//�ش� ���ڰ� ���° ĭ�� �־����� �� ����� �ش޶�.
		System.out.println(s1.length());
		int z = ans.length();//���� ��
		
		if(s1.length() != 1){
			System.out.println("�����Դϴ�!");
		}else{
			int b = 0;
			while (true){
				int find = ans.indexOf(s1, b);
				if(find == -1){
					break;
				}
				System.out.println("found!! " + find);
				b=find +1;
			}
		
		}
	}
}
		
