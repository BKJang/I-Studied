import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Network01C {
	public static void main(String[] args) {//연결하는쪽의 소스
		
		// InputOutput을 계속 할꺼다. 바이트기반/문자기반/객체기반]
		
		// 대신 타겟팅을 바꿀거다. 네트워크로..
		try{
			// 네트워크 연결을 담당하는 클래스가 있다. 넷 상의 다른 컴퓨터와 1:1로 연결을 해주는.
			// java.net.Socket이란 클래스
			Socket soc = null;//Socket 객체를 연결을 시도하는 쪽(클라이언트)과 받아주는 쪽(서버)에서 만들어내는 방법이 다름.
			
			//연결하는 쪽에서는 객체 생성을 하면 됨
			soc = new Socket("192.168.10.87", 7979); // 목적지의 ip(String으로)와 해당 ip의 어떤 포트(int로) 로 접근 할껀가..
				//생성성공하면 연결됨.(1~65535) Connection refused: connect에러 == 연결이 막혀있어서 거부당함.

			
			// 이 소켓 객체가 확보되고 나면.. 통신을 할 수가 있는 상태가 됨
			// 그 객체가 가지고 있는 인/아웃을 얻어내서
			InputStream is = soc.getInputStream(); //연결된 상대방의 아웃과 연결
			OutputStream os = soc.getOutputStream(); //연결된 상대방의 인과 연결
			System.out.println("인/아웃 확보됨!");
			
			PrintWriter pw = new PrintWriter(os);
			pw.println("안녕하세요!!");
			pw.flush();
			
			Thread.sleep(1000);//정보를 서버에 주기만하기때문에 끊길 수 있다. 그래서 이것을 쓴 것
			
			
		}catch(Exception e){
			System.out.println("E :: " + e);
		}
	}
}
