package simple;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * ����.. �����ڰ� �߻��ϱ� ��ٷȴٰ�
 * �߻��ϰ� ���� ����� ���ڿ� �ְ� �޴�..
 * ������.. ������ ���� �����°Ű�, ������ ���߿� ������ ��
 */
public class SimpleServer {
	public static void main(String[] args) {
		try{
			
			ServerSocket server = new ServerSocket(4444);
			System.out.println("�ý��� # ������ ��ٸ��ϴ�..");
			Socket s = server.accept();
			System.out.println("�ý��� # �����̿� ����Ǿ����ϴ�..");
			
			PrintStream nout = new PrintStream(s.getOutputStream());
			Scanner nin = new Scanner(s.getInputStream());
			Scanner cin = new Scanner(System.in);
			
			while(true){
				try{
				System.out.println("from..");
				String get = nin.nextLine();
				System.out.println(get);
				System.out.println("to..");
				String to = cin.nextLine();
				nout.println(to);
				}catch(Exception e){
					System.out.println("�����̿� ������ ������ϴ�.");
					break;
				}
			}
			
			System.out.println("���α׷��� �����մϴ�.");
			
		}catch(Exception e){
			System.out.println("E.." + e);
		}
	}
}
