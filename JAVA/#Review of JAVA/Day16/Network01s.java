import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Network01s {
	public static void main(String[] args) { //접속을 받는 쪽의 소스
		Socket soc = null;
		try{
			//접속 받아주는 용도의 소켓(개방할 포트 설정)
			//이게 Exception이 안뜨면 이쪽포트를 사용해서 프로그램을 만들어내는데 성공
			
			ServerSocket server = new ServerSocket(7979);//클라이언트쪽에서 7979로 포트연결을 시도했기 때문에.
			System.out.println("개방성공");//포트의 범위가 넘어간다거나, 다른 프로세스 중에서 사용중이면 못 연다.
										   // BindException이 발생
			
			soc = server.accept(); //접속이 발생할때까지 대기가 걸리면서 있다가 어디선가 new Socket에 의해
							 //연결을 시도하게 되면..그 때 풀리면서..걔하고 연결된 소켓을 만들어낸다.
			System.out.println(soc.toString());
			
			// 이 소켓 객체가 확보되고 나면.. 통신을 할 수가 있는 상태가 됨
			// 그 객체가 가지고 있는 인/아웃을 얻어내서
			InputStream is = soc.getInputStream(); //연결된 상대방의 아웃과 연결
			OutputStream os = soc.getOutputStream(); //연결된 상대방의 인과 연결
			System.out.println("인/아웃 확보됨!");
			Scanner sc = new Scanner(is);
			String got = sc.nextLine();
			System.out.println("got == " + got);
			
		}catch(Exception e){
			System.out.println("E :: " + e);
		}
	}
}
