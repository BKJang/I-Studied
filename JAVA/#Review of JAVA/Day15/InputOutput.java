//Input(입력), Output(출력) 기준이 되는건 프로그램
import java.io.*;
// io 패키지에 있는 클래스를 사용하면
//키보드 모니터가 아닌 곳으로도 입출력이 가능해진다.
//문자열기반의 입출력 외의 것도 가능해진다.

//거의 다 사용되는 클래스 생성이나 메서드들이 거의 다 throws IOException이 걸려있다.
//IOException을 처리해야지만 사용할 수 있다.

public class InputOutput {//IO..
	public static void main(String[] args) {
		//Input을 할 수 있는 곳은 여러 곳이 있다.
		//어디로부터 입력을 받을건지에 따라서..만들거나 확보해야되는 Input이 다르다.
		
		//키보드로부터 입력받을 수 있는 InputStream은 System.in이라고 확보가 되어있다.
		//InputStream is = System.in;
		
		//자기 시스템상의 파일로부터 입력받을려면, FileInputStream이란 걸 사용하면 됨
		
		try{
			InputStream is = new FileInputStream("d:image.jpg");//파일로부터 읽어옴
			//String으로 파일명을 적거나
			//File객체를 생성해서 집어넣어도 됨.
			System.out.println("is 확보 성공");
			//int read(); == 이 수치가 의미하는것. 1바이트 읽어와서 수치화
			int z = is.read();
			
			InputStream iss = new FileInputStream(new File("d:/Simple2.class"));//파일을 다른 문자열 형태나 다른 형태로 인식시키기 위함.
			System.out.println("iss 확보 성공");
			int zz = iss.read();
			System.out.println("zz== " +zz);
			
		}catch(Exception e){
			System.out.println("E :: " +e);
		}
		
	}
}
