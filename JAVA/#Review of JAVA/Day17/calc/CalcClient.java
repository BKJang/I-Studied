package calc;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/*
 * 	서버쪽으로 접속해서 
 * 	어떤 패턴의 문자열형태로  요청을 보내고,
 * 	응답을 받고 화면에 찍을꺼다.
 * 
 * 
 */

public class CalcClient {
	public static void main(String[] args) {
		try {
			Scanner cin = new Scanner(System.in);
			
			System.out.print("server ip : ");
			String ip = cin.nextLine();
			System.out.print("연결시도중 ...");
			Socket s = new Socket(ip, 8888);
			System.out.println("성공!");
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

			System.out.println("서버쪽으로 보낸 요청 : " +req);
			System.out.println("서버쪽에서 받은 응답 : " +resp);
			//============================================================
			
		}catch(Exception e) {
			System.out.println("E.."+e);
			System.out.println("실패");
		}
	}
}











