
public class Basic04 {
	public static void main(String[] args){
		//������ ��������� �Ǵ� ��Ŀ� ���� ũ�� �� ������ �з��� ��
		//����������Ÿ��(�⺻, ����) primitive data
		//����������Ÿ��(����, ���۷���) reference type - �迭�� �� �迭
	
	int a=11, b=11, c=13; 
	System.out.println(a==b);//== : ���������� �����Ͱ� ���� ���ΰ�
	System.out.println(a==c);
	
	int[] i = {1, 2, 3};
	int[] j = {1, 2, 3};
	System.out.println(i[0] == j[0]);
	System.out.println(i[1] == j[1]);
	System.out.println(i[2] == j[2]);
	System.out.println(i == j);
	}
}
