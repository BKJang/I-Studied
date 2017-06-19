package transfer;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *	접속자에게 특정파일을 전송하는 서버 
 *	포트는 9999  
 */
public class FileServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9999);
			System.out.println("정상가동준비끝");
		
			Socket s = server.accept();
			System.out.println("연결발생함.. " + s);
			
			InputStream is = new FileInputStream("d:/target.swf");
			OutputStream os = s.getOutputStream();
			
			while(true) {
				int n = is.read();
				if(n==-1)
					break;
				os.write(n);
			}
			
			System.out.print("전송완료..! 대기");
			os.flush();
			for(int i=0;i<5; i++) {
				Thread.sleep(200);
				System.out.print(".");
			}
			
			System.out.println("끝..!");
			
		}catch(Exception e) {
			System.out.println("E.."+ e);
		}
	}
}
