
public class Basic04 {
	public static void main(String[] args) {
		// if ~ else�� ����
		
		int cm = 179;
		int kg = 73;
		double m = cm / 100.0;
		// �� �� �����͸� ����, ��ü��������(BMI) ���
		// BMI = kg / m*m
		System.out.println("Ű : " + cm + " ������ : " + kg);
		double BMI = kg / (m*m);
		BMI -= BMI % 0.01;//�ִ� �Ҽ��� 2°�ڸ� ���� ���
		System.out.println("��ü�������� : " + BMI);
		double diet = 23 * m * m;
		double diet2;
		//if�� ����
		if(BMI>=23){
			diet2 = kg - diet;
			diet2 -= diet2 % 0.01;//�ִ� �Ҽ��� 2°�ڸ� ���� ��� 
			System.out.println("���� ���� : " + diet2);
		}else if(BMI<=18.5){
			diet2 = diet - kg;
			diet2 -= diet2 % 0.01;
			System.out.println("���� ���� : " + diet2);
		}else{
			diet2 = 0;
			System.out.println("��/���� ���� : " + diet2);
		}//if�� ����
	}
}
