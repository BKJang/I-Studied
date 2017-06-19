package obj;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SearchServer {
	public static void main(String[] args) {
		
		Hero[] ani = {new Hero("루피", "원피스", "애니"), new Hero("상디", "원피스", "애니") };
		Hero[] his = {new Hero("유비", "삼국지", "역사"), new Hero("제갈량", "삼국지", "역사")};
		
		try{
			ServerSocket server = new ServerSocket(54321);
			System.out.println("시스템 # 상대방을 기다립니다..");
			Socket s = server.accept();
			System.out.println("시스템 # 낯선이와 연결되었습니다..");
			
			ObjectOutputStream nout = new ObjectOutputStream(s.getOutputStream());
			ObjectInputStream nin = new ObjectInputStream(s.getInputStream());
			
			String st = (String)nin.readObject();//들어온 정보를 String으로 바꿈
	
			if(Math.random()>0.5){
				nout.writeObject(ani);
			}else{
				nout.writeObject(his);
			}
			
			Thread.sleep(1000);
			
		
		}catch(Exception e){
			System.out.println("E.." + e);
		}
	}
}
