//���˰迭�� MessageFormat

import java.text.*;

public class Essential03 {
	public static void main(String[] args) {
		MessageFormat f = new MessageFormat("�ȳ��ϼ���.\"{0}\"��! �ݰ����ϴ�. ���̴� {1}�� �̽ö󱸿�!" ); // �⺻ �����ڴ� ���� ���� ���ڰ� �迭�� ����..
											//�ֵ���ǥ ��½ÿ� \" �̷������� ����ؾ���. Ȧ����ǥ�� ''

		//String[] ar = {"����", "31"};
		Object[] ar = {"����", 31};
		String r = f.format(ar);
		System.out.println(r);
	}
}
