
public class Basic01 {
	public static void main(String[] args) {
		//�����͸� ������ ���� ���� �� �����͸� ���� �� ������� �غ��Ұ�
		
		//����(3�� ������)
		//�۾� ��ü�� �����ϱ⺸�ٴ� �����͸� �̾ƴ� ���� �뵵
		int a = 33;
		String m = a%2==0 ? "even" : "odd"; // �����͸� Ȯ��
		//�۾����ô� �ƴϴ�.
		
		//��Ȳ�� ���� �۾����� - if ~ else
		int time = 130; //�̿�ð�
		int cost; //���
		int mileage; //���ϸ���
		
		// �̿�ð� 2�ð� ������ ��, �ƴ� ��
		// 2�ð� ���ϴ� 30�д� õ��
		// �� �̻��� 20�д� 900��
		// ���ϸ��� ���ĵ� �ٸ� : 2�ð� ���ϴ� 5�д� 1��
		// 2�ð� �̻��� 4�д� 1��
	
		if(time<=120){
			int c = time%30==0 ? time/30 : time/30 + 1;
			cost = c *1000;
			int m1 = time%5==0 ? time/5 : time/5 + 1;
			mileage = m1;
		}else{
			int c1 = time%20==0 ? time/20 : time/20 +1;
			int m2 = time%4==0 ? time/4 : time/4 +1;
			cost = c1 * 900;
		    mileage = m2;
		}
		
		System.out.println(time + "�� �ش��ϴ� ��� : " + cost );
		System.out.println(time + "�� ���� ����Ʈ : " + mileage);
	}
}
	
