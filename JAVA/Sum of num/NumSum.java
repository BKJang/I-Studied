package Study1718;
import java.util.Scanner;

public class NumSum {

	
	public static int readresult() throws NumInputException{
		
		Scanner sc = new Scanner(System.in);//두개의 수를 입력 받는다
		int m = sc.nextInt();
		int n = sc.nextInt();
		int result=0;
		if(m<0 || m>10000){//조건에 대해 Exception 처리
			NumInputException nexcpt = new NumInputException();
			throw nexcpt;
		}
		
		for(int i=m;i<=n;i++){//Exception 처리에 문제가 없다면 연산 처리
			result +=i; 
		}
		
		return result;//연산된 결과 반환
	
	}
	
	

}
	
