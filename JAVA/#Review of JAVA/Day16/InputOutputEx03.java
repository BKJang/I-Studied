import java.io.*;
import java.util.*;

class Simple implements Serializable{//직렬화 방법 : 그냥 Serializable 인터페이스를 끌어오면됨
	String s;
	int n;
	Simple(String s, int n){
		this.s =s;
		this.n =n;
	
	}
	public String toString(){
		return "{s="+s+", n="+n+"}";
	}
}

public class InputOutputEx03 {
	public static void main(String[] args) {
		try {
		Simple[] ar = { new Simple("가", 1), new Simple("나" , 2) };
		//================================================================
		//파일명 아무렇게나 설정해서 writeObject를 해보자.
		OutputStream os = new FileOutputStream("d:/datas.dat");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		//ObjectOutputStream을 통해서 출력하고자 하는 객체는 Serializable(직렬화)이 가능해야한다.
		oos.writeObject(ar);
		System.out.println("객체출력완료");
		
		}catch(Exception e){
			System.out.println("E :: " + e);// NotSerializableException..?
		}
	}
}
