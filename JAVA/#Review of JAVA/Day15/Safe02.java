import java.util.*;

public class Safe02 {
	public static void main(String[] args) {		
		
		int a = (int)(Math.random()*90)+10;//1.������ �����͸� �ϳ� �������� #(���ڸ��� ����)
		System.out.println(a);
		
		System.out.println("����Է�: ");//2.�� ������ �����͸� ����� �ϸ鼭 ��� �Է��϶�� ���� ���
		
		Scanner sc = new Scanner(System.in);//3.Scanner Ȥ�� JOptionPane �� �߿� �ϳ��� �̿��ؼ� �Է��� ó���ϰ�
		String b = sc.nextLine();
		
		System.out.println("�Է¹��� ��ġ : " + b);//4.�Է¹��� ��ġ�� �ѹ� ����ϰ�
		
		String rst =null;
		try{
			if(a%(Integer.parseInt(b))==0)//5.�� ��ġ�� ��������Ͱ� �´°��� �ƴ���
			rst = "����";
			
			else
			rst = "����";
			
		}catch(NumberFormatException e){//catch���ٰ� ���ܸ� ��� ���� ���� �Է�
			System.out.println("!!");
		}catch(ArithmeticException e){
			System.out.println("~~");
		}catch(Exception e){// Exception�̶�� �ɸ� �� ������ �Ѵ�... ��Ȳ�� ó���� ����.
			System.out.println("����");
		}
		System.out.println(rst);
		
		//�ϴٺ���.. Exception���� �߻��ϴ� ��Ȳ�� ��������
		//������ ó���� ������ ������ �� Exception��ü���� JVM���� Ÿ�� ���� �Ǿ��ְ�
		//������ �귯���� �Ǹ� ������ ����� �̾����� �ȴ�.
		//�̷� �͵��� ���Ƴ�����.. Exception handling(����ó��)
		
		
	}
}
