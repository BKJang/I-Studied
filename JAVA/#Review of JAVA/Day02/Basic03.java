
public class Basic03 {
	public static void main(String[] args) {
		//�ٸ� �۾��鵵 ���캸��
		//ĳ����(����ȯ)�̶�� �͵� �� �� ����
			//�ٸ� �����ͷ� �νĽ�Ű��.. ����ô� �ֵ� �߿��� ��ġ������ ���̿����� ����
		//ex)
		int a = 45;
		float f = 32.222f;
		boolean b = true;
		String z = "�ȳ�";
		
		// (�νĽ�ų ������ Ÿ��) Ÿ�� => �ش�Ÿ���� ���̷� �ν��� ��
		System.out.println( (double)a );
		System.out.println( (double)f );
		System.out.println( (int)f );
		/*
		��ġ�����Ͱ� �ƴ� boolean�̳� String���� ��ġ�����͸� ����ȯ�� �� ����
		System.out.println( (boolean)f );
		System.out.println( (int)z );
		*/
		
		//ĳ������ �̿��� �۾� �� ���� �̿��ϴ� ó���� ���� ����
		System.out.println(Math.random() ); // => 0.0<1.0 �Ǽ�(double) ������
		double r = Math.random();
		System.out.println(r*10); // r*10 => 0.0<10.0�� �Ǽ�
		System.out.println( (int)r * 10); // => 0<10�� ���� but ��:0
		
		System.out.println( (int)(r*10) ); // 0<10�� ����
		//0~9 ������ ������ ������ Ȯ�� ����
	}
}
