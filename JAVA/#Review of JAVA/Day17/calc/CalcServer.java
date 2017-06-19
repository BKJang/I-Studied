package calc;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CalcServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8888);
			System.out.println("정상가동준비끝");
			Socket s = server.accept();
			System.out.println("연결발생함.. " + s);
			
			PrintStream nout = new PrintStream(s.getOutputStream());
			Scanner nin = new Scanner(s.getInputStream());
			
			String resp = nin.nextLine();
			String[] arr = resp.split("#");
			String req = "결과#";
			
			if (arr[0].equals("max")) {
				req += Integer.parseInt(arr[1]) > Integer.parseInt(arr[2]) ? arr[1] : arr[2] ;
				
			} else if (arr[0].equals("min"))  {
				req += Integer.parseInt(arr[1]) < Integer.parseInt(arr[2]) ? arr[1] : arr[2] ;
				
			} else {
				req += "알수 없음";
			}
			nout.println(req);
			
			Thread.sleep(1000);
			
		}catch(Exception e) {
			System.out.println("E.." +e);
		}
	}
}
