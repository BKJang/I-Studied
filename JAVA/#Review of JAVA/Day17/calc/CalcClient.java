package calc;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/*
 * 	���������� �����ؼ� 
 * 	� ������ ���ڿ����·�  ��û�� ������,
 * 	������ �ް� ȭ�鿡 ��������.
 * 
 * 
 */

public class CalcClient {
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
			//===========================================================
			int n1 =(int)(Math.random()*100)+1;
			int n2 =(int)(Math.random()*100)+1;
			String req;
			if(Math.random()>0.5)
				req = "max#"+n1+"#"+n2;
			else
				req = "min#"+n1+"#"+n2;
			//===========================================================
			nout.println(req);
			String resp = nin.nextLine();

			System.out.println("���������� ���� ��û : " +req);
			System.out.println("�����ʿ��� ���� ���� : " +resp);
			//============================================================
			
		}catch(Exception e) {
			System.out.println("E.."+e);
			System.out.println("����");
		}
	}
}











