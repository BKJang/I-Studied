package obj;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SerachClient {
	public static void main(String[] args) {
		try{
			Scanner cin = new Scanner(System.in);
			System.out.println("시스템 # 서버 아이피 : ");
			String ip = cin.nextLine();
			
			Socket s = new Socket(ip, 54321);
			System.out.println("시스템 # 연결 성공!");
			
			ObjectOutputStream nout = new ObjectOutputStream(s.getOutputStream());
			ObjectInputStream nin = new ObjectInputStream(s.getInputStream());
			
			String req = cin.nextLine();
			nout.writeObject(req);
			
			Hero[] team = (Hero[])nin.readObject();
			
			for(Hero t : team){
				System.out.println("→" + t);
			}
		}catch(Exception e){
			System.out.println("E.." + e);
		}
	}
}
