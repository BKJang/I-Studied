package IntegerSum;

public class IntegerCalcTest {
	public static void main(String[] args) {
		System.out.println("�Է��� ������ ������ ���� �������� �Է��ϼ���(�������� ����)");

		IntegerCalc qs = new IntegerCalc();//��ü ����

		try{
			//NumSum�� ��ȯ�� ��� ���� ����
			int result = qs.result();
			System.out.println("�Է��� ���� �� : " + result);//����� ���
		}
		catch(IntegernumException e){//Exception�� �ɸ��ٸ� �������� Exeption class�� �̵�
			e.printStackTrace();
		}catch(IntegersumException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}