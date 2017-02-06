package SumofNum;

import java.util.Scanner;

public class NumSum {

	
	public int readresult() throws NumInputException{
		
		Scanner sc = new Scanner(System.in);//두개의 수를 입력 받는다
		int m = sc.nextInt();
		int n = sc.nextInt();
		int result=0;
		
		if((m<0 || m>10000) || (n<0 || n>10000)){//조건에 대해 Exception 처리
			throw new NumInputException("각각의 입력되는 정수는 0부터 10000까지입니다.");
		}
		
		for(int i=m;i<=n;i++){//Exception 처리에 문제가 없다면 연산 처리
			result +=i; 
		}
		
		return result;//연산된 결과 반환
	}	
}
	
