import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Network01s {
	public static void main(String[] args) { //������ �޴� ���� �ҽ�
		Socket soc = null;
		try{
			//���� �޾��ִ� �뵵�� ����(������ ��Ʈ ����)
			//�̰� Exception�� �ȶ߸� ������Ʈ�� ����ؼ� ���α׷��� �����µ� ����
			
			ServerSocket server = new ServerSocket(7979);//Ŭ���̾�Ʈ�ʿ��� 7979�� ��Ʈ������ �õ��߱� ������.
			System.out.println("���漺��");//��Ʈ�� ������ �Ѿ�ٰų�, �ٸ� ���μ��� �߿��� ������̸� �� ����.
										   // BindException�� �߻�
			
			soc = server.accept(); //������ �߻��Ҷ����� ��Ⱑ �ɸ��鼭 �ִٰ� ��𼱰� new Socket�� ����
							 //������ �õ��ϰ� �Ǹ�..�� �� Ǯ���鼭..���ϰ� ����� ������ ������.
			System.out.println(soc.toString());
			
			// �� ���� ��ü�� Ȯ���ǰ� ����.. ����� �� ���� �ִ� ���°� ��
			// �� ��ü�� ������ �ִ� ��/�ƿ��� ����
			InputStream is = soc.getInputStream(); //����� ������ �ƿ��� ����
			OutputStream os = soc.getOutputStream(); //����� ������ �ΰ� ����
			System.out.println("��/�ƿ� Ȯ����!");
			Scanner sc = new Scanner(is);
			String got = sc.nextLine();
			System.out.println("got == " + got);
			
		}catch(Exception e){
			System.out.println("E :: " + e);
		}
	}
}
