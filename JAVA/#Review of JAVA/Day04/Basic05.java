
public class Basic05 {
	public static void main(String[] args) {
		//for - ������ ȸ����ŭ�� �����۾�
			//���������� ��ġȮ���� �ʿ��� ��.
		for(int i=50 ; i>=20 ; i--){
			System.out.println("i== " + i);
		}
		//=======================================
		//�� ��ȭ�ϴ� ������ ��ġ�� �̾Ƽ� ����ϴ� ���� �⺻���� ��(������)
		int k =(int)(Math.random()*8)+2;
		System.out.println("k==" + k);
		for(int i = 1; i<=9 ; i++){
			System.out.println(k + "x" + i + "=" + k*i);
		}
		//�迭ó���� ��.. �迭 ���ٹ�ȣ�� 0~ ���ʴ�� �����Ǹ鼭 �����Ǳ� ������..
		int[] ar = {1, 4, 12, 4, 24, 124, 5, 14, 2};
		for(int i=0; i<9; i++){
			System.out.println("�迭 "+ i +"��" + "==" + ar[i]);
		}
	}
}
