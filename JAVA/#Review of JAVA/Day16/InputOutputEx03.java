import java.io.*;
import java.util.*;

class Simple implements Serializable{//����ȭ ��� : �׳� Serializable �������̽��� ��������
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
		Simple[] ar = { new Simple("��", 1), new Simple("��" , 2) };
		//================================================================
		//���ϸ� �ƹ����Գ� �����ؼ� writeObject�� �غ���.
		OutputStream os = new FileOutputStream("d:/datas.dat");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		//ObjectOutputStream�� ���ؼ� ����ϰ��� �ϴ� ��ü�� Serializable(����ȭ)�� �����ؾ��Ѵ�.
		oos.writeObject(ar);
		System.out.println("��ü��¿Ϸ�");
		
		}catch(Exception e){
			System.out.println("E :: " + e);// NotSerializableException..?
		}
	}
}
