import java.io.*;
import java.util.*;
public class InputOutputEx01 {
	public static void main(String[] args) {
		// ������ ������� ����� �Ҳ���, ����Ʈ,���ڿ� �ܿ� �ٸ� �����͸� ����غ���.
		try {
			OutputStream os = new FileOutputStream("d:/datas.dat");
				// ����������.. ����Ʈ�� ��¸� ����
			// �̰� �� PrintWriter or PrintStream�� ���ԵǸ� ���ڿ������� ���
			// �̰� �� ObjectOutputStream ���� �ٲܲ���.
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			int[] ar = {42,42,4523,543,6,45,6};
			oos.writeObject(ar);
			
			ArrayList<String> li = new ArrayList<String>();
				li.add("ĸƾ�Ƹ޸�ī");
				li.add("���̾��");
				li.add("�丣");
				li.add("��ũ");
			
			oos.writeObject(li);
			
		}catch(Exception e) {
			System.out.println("E..."+e);
		}
		
		System.out.println("END!!");
	}
}
