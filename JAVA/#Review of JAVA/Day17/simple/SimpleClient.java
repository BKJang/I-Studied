package simple;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class SimpleClient {
	public static void main(String[] args) {
		
		try {
			Scanner cin = new Scanner(System.in);
			
			System.out.print("server ip : ");
			String ip = cin.nextLine();
			System.out.print("����õ��� ...");
			Socket s = new Socket(ip, 8888);
			System.out.println("����!");
			PrintStream nout = new PrintStream(s.getOutputStream());
			Scanner nin = new Scanner(s.getInputStream());
			Scanner cin1 = new Scanner(System.in);
			
			while(true){
				try{
				System.out.println("to..");
				String to = cin1.nextLine();
				nout.println(to);
				System.out.println("from..");
				String get = nin.nextLine();
				System.out.println(get);
				
				}catch(Exception e){
					System.out.println("�����̿� ������ ������ϴ�.");
					break;
				}
			}
		}catch(Exception e){
			System.out.println("�����̿� ������ ������ϴ�.");
			
		}
	}
}
