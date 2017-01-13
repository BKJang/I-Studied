import java.util.Scanner;

public class IntegerCalc {
	
		
		public static int result() throws IntegernumException, IntegersumException, IntegerException{
			Scanner sc = new Scanner(System.in);
			int input1 = sc.nextInt();
			String input3 = sc.nextLine();
			String input2 = sc.nextLine();
			int result = 0;
			
			if(input1<0 || input1>10000){//입력할 정수의 개수에 대한 Exception 처리
				IntegernumException intex = new IntegernumException();
				throw intex;
			}
			
			
			String[] intArr2 = input2.split(" ");	
			if(intArr2.length>input1){//입력받기로 한 수의 개수에 대한 Exception 처리
				IntegersumException intsex = new IntegersumException();
				throw intsex;
			}
			if(intArr2.length<input1){
				for(int i=0;i<intArr2.length;i++){
					
					int a = Integer.parseInt(intArr2[i]);
					if(Math.abs(a)>=100){
						IntegerException inex = new IntegerException();
						throw inex;//계산될 정수의 절대값에 대한 Exception 처리
					}
					
					result += a;
				}
					int num=(input1-intArr2.length);
					result += num;
					
			}else{
				for(int i=0;i<intArr2.length;i++){
					int a = Integer.parseInt(intArr2[i]);
					if(Math.abs(a)>=100){
						IntegerException inex = new IntegerException();
						throw inex;//계산될 정수의 절대값에 대한 Exception 처리
					}
					System.out.println(a);
					
					result += a;	
					}
			}
			return result;
		}
		
		
}