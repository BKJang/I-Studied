package IntegerSum;
import java.util.Scanner;
public class IntegerCalc {

	public static int result() throws IntegernumException, IntegersumException, IntegerException{
		Scanner sc = new Scanner(System.in);
		String Intnum = sc.nextLine();
		int Intnumber = Integer.parseInt(Intnum);
		String Intsum = sc.nextLine();
		
		int result = 0;

		if(Intnumber<0 || Intnumber>10000){//입력할 정수의 개수에 대한 Exception 처리
			throw new IntegernumException("입력할 정수의 개수는 1부터 10000까지입니다.");
		}

		String[] intArr2 = Intsum.split(" ");	
		if(intArr2.length>Intnumber || intArr2.length<Intnumber){//입력받기로 한 수의 개수에 대한 Exception 처리
			throw new IntegersumException("입력받기로 한 정수의 개수와 입력한 정수의 개수가 일치하지 않습니다.");

		}
		if(intArr2.length==Intnumber){
			{
				for(int i=0;i<intArr2.length;i++){
					int a = Integer.parseInt(intArr2[i]);
					if(Math.abs(a)>=100){
						throw new IntegerException("계산될 정수의 절대값은 100보다 작거나 같아야 합니다.");//계산될 정수의 절대값에 대한 Exception 처리
					}
					System.out.println(a);
					result += a;	
				}
			}
		}
		return result;
	}
}