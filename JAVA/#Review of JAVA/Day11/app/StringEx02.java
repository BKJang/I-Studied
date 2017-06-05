package app;
import javax.swing.JOptionPane;

public class StringEx02 {
	public static void main(String[] args) {
		String menu = "지원되는메뉴\n→덧셈#정수#정수\n→sub#정수#정수";
		String in = JOptionPane.showInputDialog(menu);
		
		String[] stri = in.split("#");//입력되는 값을 #을 기준으로 split
		
		int a1 = Integer.parseInt(stri[1]);//정수1(String 값 -> int값으로)
		int a2 = Integer.parseInt(stri[2]);//정수2(String 값 -> int값으로)
		
		if(stri[0].equals("덧셈")){
			System.out.println(a1+a2);
		}else if(stri[0].equals("sub")){
			System.out.println(a1-a2);
		}else{
			System.out.println("오류입니다");
		}
	}
}
