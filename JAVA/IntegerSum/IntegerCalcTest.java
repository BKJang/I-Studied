public class IntegerCalcTest {
	public static void main(String[] args) {
	System.out.println("�Է��� ������ ������ ���� �������� �Է��ϼ���(�������� ����)");
	
	IntegerCalc qs = new IntegerCalc();//��ü ����
	
	
	
	try{
		//NumSum�� ��ȯ�� ��� ���� ����
		int result = qs.result();
			System.out.println(result);//����� ���
		}
		catch(IntegernumException e){//Exception�� �ɸ��ٸ� �������� Exeption class�� �̵�
			System.out.println(e.getMessage());
		}catch(IntegersumException e){
			System.out.println(e.getMessage());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
			
}

