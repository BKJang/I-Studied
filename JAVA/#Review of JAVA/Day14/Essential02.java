import java.util.*;

public class Essential02 {
	public static void main(String[] args) {
		//1.5���� �� �߰�
		//Auto Boxing, UnBoxing�� �����ȴ�.
		//�⺻�������� ��  Wrapper class ��ü ���·� �ڵ� �ٲ��.
		//Wrapper class ��ü �� �⺻�� �����ͷ� �ٲ��.
		int k = 5;
		Integer i = k; //�ڵ� ���� ,����ڽ�/ �ڵ����� ��ü�� ��
		
		int kk = i; //�ڵ� ����, �����ڽ�/ �ڵ����� �������� ��
		
		Object o = 5;
		System.out.println(o.getClass());

		Map<String, Integer> zocbo = new HashMap<String, Integer>();
			zocbo.put("����", 500);
			zocbo.put("�˸�", 400);
			
			int n = zocbo.get("����");
			System.out.println("N==" + n);
			
	}
}
