import java.io.*;
import java.util.*;
public class InputOutputEx02 {
	public static void main(String[] args) {
		//파일에 출력 시켜둔 객체를 프로그램에서 다시 활용할꺼다.
		try{
			ObjectInputStream ois =
			new ObjectInputStream(new FileInputStream("d:/datas.dat")); //Ex01에서 설정했던 그 파일명을 작성을 해라.
			
		
			Object o = ois.readObject(); //객체 값이 나온다.
			System.out.println(o.getClass());
			
			int[] a = (int[])ois.readObject();
			for(int e : a){
				System.out.println("E==" + e);
			}
			
			ArrayList<String> b = (ArrayList<String>) ois.readObject();
			for(String ee : b){
				System.out.println("EE== " + ee);
			}
			
		}catch(Exception e){
			System.out.println("E ::" + e);
		}
	
	}
}
