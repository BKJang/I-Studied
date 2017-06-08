// java.text. �� Format �迭�� Ŭ������ 
// Format�� ��°� �ᱹ �� ���� ����� ���� ��.
import java.text.*;

public class Essential01 {
	public static void main(String[] args) {
		// new Format();
		// ��ġ�������͸� ���������� ���ڿ��� ������ִ� ����� ������ �ִ� Ŭ����
		DecimalFormat df = new DecimalFormat();	// �⺻������  #,###.###
			// ������ ���� ���� 3�ڸ����� , �Ҽ��δ� 3�ڸ������� ���´�.
			// String format(long)   ,  String format(double)
			
		String m1 = df.format(1313313);
		String m2 = df.format(1313313.9787);
		System.out.println(m1);
		System.out.println(m2);
		// ���ϵ� ������ ���� , #(0����) �̳� 0(����ִ°���0)������ �غ��ô�.
		DecimalFormat df2 = new DecimalFormat("#.###");	// �Ҽ��θ� 3°¥������ ǥ��
		String m3 =	df2.format(1313313.9);
		System.out.println(m3);
		
		DecimalFormat df3 = new DecimalFormat("#.000");	// �Ҽ��θ� 3°¥������ ǥ��
		String m4 =	df3.format(1313313.9);
		System.out.println(m4);
		
		DecimalFormat df4 = new DecimalFormat("0000");
		String m5 =df4.format(45.323223);
		System.out.println(m5);
	}
}





