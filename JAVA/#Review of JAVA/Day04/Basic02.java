
public class Basic02 {
	public static void main(String[] args) {
		
		String[] ar = {"����", "��ȭ/����", "����", "��ȭ"};
		//�迭�߿� �������� 2���� ��´�.
		//������ 2���� ���� ��ġ�� �ʵ���!
		int n1 = (int)(Math.random()*4);
		int n2 = (int)(Math.random()*4);
		
		while(n1==n2){
			n1 = (int)(Math.random()*4);
			n2 = (int)(Math.random()*4);
		}
		//�Ǵ��� �ϰ� �۾��� ����
		do{
			n1 = (int)(Math.random()*4);
			n2 = (int)(Math.random()*4);
		}while(n1==n2);
		//�ϴ� �ϰ� �� �Ŀ� �Ǵ��� ����(�ּ��� 1���� ������ �����ؾ��Ѵٰ� �Ǵ� �� ��)
		
		System.out.println("����� ��̴� " + ar[n1] + ", " + ar[n2]);
	}	
}
