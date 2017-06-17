import java.io.*;
import java.net.*;

public class Safe03 {
	//예외라는 객체가 있고, 이 객체가 어떤 역할을 하고 있고,
	//JVM 쪽으로 들어가는 걸 막아내는 처리까지 살펴봄
	//이런 개념을 알아야만 사용이 가능한 클래스들이 있다.
	public static void main(String[] args) {
		System.out.println("Ready");
		try{
			Thread.sleep(3000);// 실행 흐름 일시 정지(단위 : ms)
		}catch(InterruptedException e){
			System.out.println("E== "+ e);
		}
		System.out.println("GO!");
		
		//========================================================================================
		File f = new File("d:/test.log");
		try{
			f.createNewFile();//try~catch를 쓰지 않으면 아예 생성이 안됨
		}catch(IOException e){
			System.out.println("E== " +e);
		}
		
		//========================================================================================
		try{
		ServerSocket server = new ServerSocket(-445);//try~catch를 쓰지 않으면 아예 객체 생성이 안됨.
		}catch(IOException e){
			System.out.println("E== " +e);
		}
		
		//========================================================================================
		//Exception 처리를 해야지만 사용가능한 애들을 살펴본건데,
		//왜 이렇게 되어있냐??, 그리고 어떤 메서드가 Exception이 여러개가 발생되는거 같은데..
		//왜 필수로 잡아야되는 Exception이 있냐??
		//API를 타고 들어가서 보면.. 메서드 원형에 전부 필수로 잡아야 되는건 throws라는게 걸려있다.
		//throws.. 예외 전가(경고) #메서드나 생성자에서 설계된 일들을 처리 중에 Exception이 발생할 수 있다라고 해둔 것
		
		
	}
}
