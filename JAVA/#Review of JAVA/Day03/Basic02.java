
public class Basic02 {
	public static void main(String[] args) {
		// ī�� ���� ���
		// �������� 1~10������ ���� 2���� �����ϰ�
		// �� �μ��� ��� �װ� ī�� �ѹ����̶�� ����
		// ���� ��� (���� ���� ���ڸ�.. �� ���� * 10�� ������(7,7->70)
		// �ٸ� ���ڸ�.. �� �������� 1�� �ڸ��� ���� (1, 7 -> 8)
		
		int a = (int)(Math.random()*10)+1;
		int b = (int)(Math.random()*10)+1;
		int score;
		//if�� ����
		if(a==b){
			score=a;
		}else{
			int c = a+b<10 ? a+b : a+b-10;//(a+b-10 == (a+b)%10)
			score = c;
			
		}//if�� ����
		//if~else�� �̿��ؼ� � ó���� �ϴµ�
		//ó���ؾߵ� �۾��� �ϳ��̸� {}�����Ͽ��� �ȴ�.
		System.out.println("ī��1 : " + a);
		System.out.println("ī��2 : " + b);
		System.out.println("������ : " + score);
	}
	
}
