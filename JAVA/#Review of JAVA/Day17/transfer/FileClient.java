package transfer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class FileClient {
	public static void main(String[] args) {
		try {
			System.out.println("정상가동준비끝");
			Socket s = new Socket("192.168.10.87", 9999);
			System.out.println("연결성공함.. " + s);
			InputStream is = s.getInputStream();
			OutputStream os = new FileOutputStream("down.swf");
			while(true) {
				try {
					int n = is.read();	// 소켓I/O도 기본이 무한이기 때문에 -1이 안뜬다.
					os.write(n);
				}catch(Exception e) {
					break;
				}
			}
			System.out.println("다운 완료");
			
			
		}catch(Exception e) {
			System.out.println("E.."+ e);
		}
	}
}





