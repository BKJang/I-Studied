import java.util.Scanner;

public class IntegerCalc {
	
		
		public static int result() throws IntegernumException, IntegersumException, IntegerException{
			Scanner sc = new Scanner(System.in);
			int input1 = sc.nextInt();
			String input3 = sc.nextLine();
			String input2 = sc.nextLine();
			int result = 0;
			
			if(input1<0 || input1>10000){//�Է��� ������ ������ ���� Exception ó��
				IntegernumException intex = new IntegernumException();
				throw intex;
			}
			
			
			String[] intArr2 = input2.split(" ");	
			if(intArr2.length>input1){//�Է¹ޱ�� �� ���� ������ ���� Exception ó��
				IntegersumException intsex = new IntegersumException();
				throw intsex;
			}
			if(intArr2.length<input1){
				for(int i=0;i<intArr2.length;i++){
					
					int a = Integer.parseInt(intArr2[i]);
					if(Math.abs(a)>=100){
						IntegerException inex = new IntegerException();
						throw inex;//���� ������ ���밪�� ���� Exception ó��
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
						throw inex;//���� ������ ���밪�� ���� Exception ó��
					}
					System.out.println(a);
					
					result += a;	
					}
			}
			return result;
		}
		
		
}