
public class Basic01 {
	// main.. ctrl + space.. enter
	public static void main(String[] args) {
		// ������ ����, ������ ���� ������ ���캸�Ұ�
		// �̷� �����͸� ���� �� �� �ִ� �۾���!!
		// ��ġ������ : ��� ������ ����
		System.out.println(10*2);// sysout.. ctrl + space
		
		// ������ ���� �۾��� ��������
		int n1 = 44;
		long n2 = 45L;
		float n3 = 3.444f;
		double n4 = 45634.2;
		System.out.println(n1 *2);
		System.out.println(n2 * 3);
		// ��������� ���� ������ Ÿ�Գ����� ������ �ǰ� �Ǿ��ִ�.
		System.out.println(n1 - n3); // ó���� �ȵǴ°� �´� ��
		// �� ������ ž�̳����� ����� �Ǵ°� ������ 
		// ���α׷� �󿡼� ���� �ٸ� Ÿ���� ��ġ�� ��������ϸ�
		// ������ �� �߿� ���� ū ���·� ��ġ �Ŀ� �۾��� �Ͼ => ������� ���� ������
		// -> �Ƹ�?����: ���� �������� ���α׷��� ���� �ӵ��� �������� ������...?
		
		System.out.println(79/89); //���������� �������� ��� -> ����(��κи� ����)
								   //�׷��� 0�� ����!!
		System.out.println(179/89 * 1.0);
		System.out.println(1.0 * 179 /89); 
		//���� ���������� Ÿ�Ժ��� ������ �ǹǷ� ���� �ٸ��� ����
		
		//��ġ ��� �����߿� (add+, sub-, mul*, div/) + mod% ����(������ ���)
		double vv = 4564.245;
		double z = vv%1.0; //vv�� 1.0���� ������ �� ������
		System.out.println(vv);
		System.out.println(z);
		System.out.println(vv-z);//������ ���� �̿� �Ǽ� ���� �Ҽ��� �κ� ���� �� ����
		
		// �������� ������ ����
		int tot = 456;
		System.out.println(tot / 60);//��
		System.out.println(tot % 60);//������
		
		/*
		 �ش� .class ������ �ִ� ���� ���� javap -v
		 ��) javap -v Basic01
		 */
						
	}
}
