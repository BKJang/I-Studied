public class NumSumTest {
	
	public static void main(String[] args) {
	
		NumSum ns = new NumSum();//��ü ����
		
		System.out.println("�� ���� ������ �Է��ϼ���");
		
		try{
			int result = ns.readresult();//NumSum�� ��ȯ�� ��� ���� ����
			System.out.println(result);//����� ���
		}
		catch(NumInputException e){//Exception�� �ɸ��ٸ� �������� Exeption class�� �̵�
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		}	
} 
	
