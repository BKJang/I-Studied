package transfer;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *	�����ڿ��� Ư�������� �����ϴ� ���� 
 *	��Ʈ�� 9999  
 */
public class FileServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9999);
			System.out.println("���󰡵��غ�");
		
			Socket s = server.accept();
			System.out.println("����߻���.. " + s);
			
			InputStream is = new FileInputStream("d:/target.swf");
			OutputStream os = s.getOutputStream();
			
			while(true) {
				int n = is.read();
				if(n==-1)
					break;
				os.write(n);
			}
			
			System.out.print("���ۿϷ�..! ���");
			os.flush();
			for(int i=0;i<5; i++) {
				Thread.sleep(200);
				System.out.print(".");
			}
			
			System.out.println("��..!");
			
		}catch(Exception e) {
			System.out.println("E.."+ e);
		}
	}
}
