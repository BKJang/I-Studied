import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

public class InputOutputEx04 {//���� �ε�
	public static void main(String[] args) {
		Simple[] all = null; //java.io.FileNotFoundException:

		try{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/simpleobj.oos"));
			
			all = (Simple[])ois.readObject(); //������ȭ
			for(Simple m : all){
				System.out.println(m);
			}
		}catch(Exception e){
			System.out.println("E ::" + e);
		}
		//===============================================================
		
	}
}
