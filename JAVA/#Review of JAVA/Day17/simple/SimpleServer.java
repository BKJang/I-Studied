package simple;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * 목적.. 접속자가 발생하길 기다렸다가
 * 발생하고 나면 상대방과 문자열 주고 받는..
 * 순서는.. 상대방이 먼저 보내는거고, 서버가 나중에 보내는 것
 */
public class SimpleServer {
	public static void main(String[] args) {
		try{
			
			ServerSocket server = new ServerSocket(4444);
			System.out.println("시스템 # 상대방을 기다립니다..");
			Socket s = server.accept();
			System.out.println("시스템 # 낯선이와 연결되었습니다..");
			
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
					System.out.println("낯선이와 연결이 끊겼습니다.");
					break;
				}
			}
			
			System.out.println("프로그램을 종료합니다.");
			
		}catch(Exception e){
			System.out.println("E.." + e);
		}
	}
}
