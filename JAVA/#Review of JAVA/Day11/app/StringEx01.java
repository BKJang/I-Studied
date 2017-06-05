package app;

import javax.swing.JOptionPane;

public class StringEx01 {
	public static void main(String[] args) {
		
		String ans = "programming";
		String s1 = JOptionPane.showInputDialog("영문자 하나 입력");
		//입력을 받고, 입력문자는 하나만!!
		
		//여러글자일땐 오류입니다.
		
		//그게 아니라면 분석을 해서..
		//해당 문자가 몇번째 칸에 있었는지 다 출력을 해달라.
		System.out.println(s1.length());
		int z = ans.length();//글자 수
		
		if(s1.length() != 1){
			System.out.println("오류입니다!");
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
		
