import java.io.*;
import java.util.*;
public class InputOutputEx02 {
	public static void main(String[] args) {
		//���Ͽ� ��� ���ѵ� ��ü�� ���α׷����� �ٽ� Ȱ���Ҳ���.
		try{
			ObjectInputStream ois =
			new ObjectInputStream(new FileInputStream("d:/datas.dat")); //Ex01���� �����ߴ� �� ���ϸ��� �ۼ��� �ض�.
			
		
			Object o = ois.readObject(); //��ü ���� ���´�.
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
