package obj;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SearchServer {
	public static void main(String[] args) {
		
		Hero[] ani = {new Hero("����", "���ǽ�", "�ִ�"), new Hero("���", "���ǽ�", "�ִ�") };
		Hero[] his = {new Hero("����", "�ﱹ��", "����"), new Hero("������", "�ﱹ��", "����")};
		
		try{
			ServerSocket server = new ServerSocket(54321);
			System.out.println("�ý��� # ������ ��ٸ��ϴ�..");
			Socket s = server.accept();
			System.out.println("�ý��� # �����̿� ����Ǿ����ϴ�..");
			
			ObjectOutputStream nout = new ObjectOutputStream(s.getOutputStream());
			ObjectInputStream nin = new ObjectInputStream(s.getInputStream());
			
			String st = (String)nin.readObject();//���� ������ String���� �ٲ�
	
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
