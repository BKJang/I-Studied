package transfer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class FileClient {
	public static void main(String[] args) {
		try {
			System.out.println("���󰡵��غ�");
			Socket s = new Socket("192.168.10.87", 9999);
			System.out.println("���Ἲ����.. " + s);
			InputStream is = s.getInputStream();
			OutputStream os = new FileOutputStream("down.swf");
			while(true) {
				try {
					int n = is.read();	// ����I/O�� �⺻�� �����̱� ������ -1�� �ȶ��.
					os.write(n);
				}catch(Exception e) {
					break;
				}
			}
			System.out.println("�ٿ� �Ϸ�");
			
			
		}catch(Exception e) {
			System.out.println("E.."+ e);
		}
	}
}





