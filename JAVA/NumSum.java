package Study1718;
import java.util.Scanner;

public class NumSum {

	
	public static int readresult() throws NumInputException{
		
		Scanner sc = new Scanner(System.in);//�ΰ��� ���� �Է� �޴´�
		int m = sc.nextInt();
		int n = sc.nextInt();
		int result=0;
		if(m<0 || m>10000){//���ǿ� ���� Exception ó��
			NumInputException nexcpt = new NumInputException();
			throw nexcpt;
		}
		
		for(int i=m;i<=n;i++){//Exception ó���� ������ ���ٸ� ���� ó��
			result +=i; 
		}
		
		return result;//����� ��� ��ȯ
	
	}
	
	

}
	
