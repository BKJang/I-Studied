// ���˰迭���� Date��
import java.text.*;
import java.util.Date;

public class Essential02 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat();	// �⺻����
		
		String m =sdf.format( System.currentTimeMillis() );		// Date, ������ 
		System.out.println(m);
		Date d = new Date();
			int n = d.getYear();
			System.out.println(n);
			System.out.println(d);	// Date ��ü ��� ==> toString()
		String mm = sdf.format(d);	// Date ��ü�� SimpleDateFormat �̶�� �ֿ� �����ؼ� �̾Ƴ���
			System.out.println(mm);	// ���
			
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM��dd�� / YYYY��");
		// y �� ,M ��  d ��  H �ð� , m �� s ��
		String mmm =sdf2.format(d);
		System.out.println(mmm);
		
		
	}
}
