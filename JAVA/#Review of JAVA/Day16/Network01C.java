import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Network01C {
	public static void main(String[] args) {//�����ϴ����� �ҽ�
		
		// InputOutput�� ��� �Ҳ���. ����Ʈ���/���ڱ��/��ü���]
		
		// ��� Ÿ������ �ٲܰŴ�. ��Ʈ��ũ��..
		try{
			// ��Ʈ��ũ ������ ����ϴ� Ŭ������ �ִ�. �� ���� �ٸ� ��ǻ�Ϳ� 1:1�� ������ ���ִ�.
			// java.net.Socket�̶� Ŭ����
			Socket soc = null;//Socket ��ü�� ������ �õ��ϴ� ��(Ŭ���̾�Ʈ)�� �޾��ִ� ��(����)���� ������ ����� �ٸ�.
			
			//�����ϴ� �ʿ����� ��ü ������ �ϸ� ��
			soc = new Socket("192.168.10.87", 7979); // �������� ip(String����)�� �ش� ip�� � ��Ʈ(int��) �� ���� �Ҳ���..
				//���������ϸ� �����.(1~65535) Connection refused: connect���� == ������ �����־ �źδ���.

			
			// �� ���� ��ü�� Ȯ���ǰ� ����.. ����� �� ���� �ִ� ���°� ��
			// �� ��ü�� ������ �ִ� ��/�ƿ��� ����
			InputStream is = soc.getInputStream(); //����� ������ �ƿ��� ����
			OutputStream os = soc.getOutputStream(); //����� ������ �ΰ� ����
			System.out.println("��/�ƿ� Ȯ����!");
			
			PrintWriter pw = new PrintWriter(os);
			pw.println("�ȳ��ϼ���!!");
			pw.flush();
			
			Thread.sleep(1000);//������ ������ �ֱ⸸�ϱ⶧���� ���� �� �ִ�. �׷��� �̰��� �� ��
			
			
		}catch(Exception e){
			System.out.println("E :: " + e);
		}
	}
}
