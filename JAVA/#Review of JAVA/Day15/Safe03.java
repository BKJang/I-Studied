import java.io.*;
import java.net.*;

public class Safe03 {
	//���ܶ�� ��ü�� �ְ�, �� ��ü�� � ������ �ϰ� �ְ�,
	//JVM ������ ���� �� ���Ƴ��� ó������ ���캽
	//�̷� ������ �˾ƾ߸� ����� ������ Ŭ�������� �ִ�.
	public static void main(String[] args) {
		System.out.println("Ready");
		try{
			Thread.sleep(3000);// ���� �帧 �Ͻ� ����(���� : ms)
		}catch(InterruptedException e){
			System.out.println("E== "+ e);
		}
		System.out.println("GO!");
		
		//========================================================================================
		File f = new File("d:/test.log");
		try{
			f.createNewFile();//try~catch�� ���� ������ �ƿ� ������ �ȵ�
		}catch(IOException e){
			System.out.println("E== " +e);
		}
		
		//========================================================================================
		try{
		ServerSocket server = new ServerSocket(-445);//try~catch�� ���� ������ �ƿ� ��ü ������ �ȵ�.
		}catch(IOException e){
			System.out.println("E== " +e);
		}
		
		//========================================================================================
		//Exception ó���� �ؾ����� ��밡���� �ֵ��� ���캻�ǵ�,
		//�� �̷��� �Ǿ��ֳ�??, �׸��� � �޼��尡 Exception�� �������� �߻��Ǵ°� ������..
		//�� �ʼ��� ��ƾߵǴ� Exception�� �ֳ�??
		//API�� Ÿ�� ���� ����.. �޼��� ������ ���� �ʼ��� ��ƾ� �Ǵ°� throws��°� �ɷ��ִ�.
		//throws.. ���� ����(���) #�޼��峪 �����ڿ��� ����� �ϵ��� ó�� �߿� Exception�� �߻��� �� �ִٶ�� �ص� ��
		
		
	}
}
