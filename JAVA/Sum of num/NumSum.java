package SumofNum;

import java.util.Scanner;

public class NumSum {

	
	public int readresult() throws NumInputException{
		
		Scanner sc = new Scanner(System.in);//�ΰ��� ���� �Է� �޴´�
		int m = sc.nextInt();
		int n = sc.nextInt();
		int result=0;
		
		if((m<0 || m>10000) || (n<0 || n>10000)){//���ǿ� ���� Exception ó��
			throw new NumInputException("������ �ԷµǴ� ������ 0���� 10000�����Դϴ�.");
		}
		
		for(int i=m;i<=n;i++){//Exception ó���� ������ ���ٸ� ���� ó��
			result +=i; 
		}
		
		return result;//����� ��� ��ȯ
	}	
}
	
