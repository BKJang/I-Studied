package IntegerSum;
import java.util.Scanner;
public class IntegerCalc {

	public static int result() throws IntegernumException, IntegersumException, IntegerException{
		Scanner sc = new Scanner(System.in);
		String Intnum = sc.nextLine();
		int Intnumber = Integer.parseInt(Intnum);
		String Intsum = sc.nextLine();
		
		int result = 0;

		if(Intnumber<0 || Intnumber>10000){//�Է��� ������ ������ ���� Exception ó��
			throw new IntegernumException("�Է��� ������ ������ 1���� 10000�����Դϴ�.");
		}

		String[] intArr2 = Intsum.split(" ");	
		if(intArr2.length>Intnumber || intArr2.length<Intnumber){//�Է¹ޱ�� �� ���� ������ ���� Exception ó��
			throw new IntegersumException("�Է¹ޱ�� �� ������ ������ �Է��� ������ ������ ��ġ���� �ʽ��ϴ�.");

		}
		if(intArr2.length==Intnumber){
			{
				for(int i=0;i<intArr2.length;i++){
					int a = Integer.parseInt(intArr2[i]);
					if(Math.abs(a)>=100){
						throw new IntegerException("���� ������ ���밪�� 100���� �۰ų� ���ƾ� �մϴ�.");//���� ������ ���밪�� ���� Exception ó��
					}
					System.out.println(a);
					result += a;	
				}
			}
		}
		return result;
	}
}