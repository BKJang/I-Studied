import java.io.*;
import java.util.*;
public class InputOutputEx01 {
	public static void main(String[] args) {
		// 파일을 대상으로 출력을 할껀데, 바이트,문자열 외에 다른 데이터를 출력해보자.
		try {
			OutputStream os = new FileOutputStream("d:/datas.dat");
				// 여기까지라면.. 바이트값 출력만 가능
			// 이걸 → PrintWriter or PrintStream을 쓰게되면 문자열형태의 출력
			// 이걸 → ObjectOutputStream 으로 바꿀꺼다.
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			int[] ar = {42,42,4523,543,6,45,6};
			oos.writeObject(ar);
			
			ArrayList<String> li = new ArrayList<String>();
				li.add("캡틴아메리카");
				li.add("아이언맨");
				li.add("토르");
				li.add("헐크");
			
			oos.writeObject(li);
			
		}catch(Exception e) {
			System.out.println("E..."+e);
		}
		
		System.out.println("END!!");
	}
}
