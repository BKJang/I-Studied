//��������� �Ʒ������� ����!!
public class ExceptionTest_02 {
	public static void main(String[] args) {
		// int num = Integer.parseInt("A1234"); //NumberFormatException : RuntimeException:NonCheckedException(���� VM�� üũ���� �ʴ� Exception)
		int num = Integer.parseInt("1234");
		new String();
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {//CheckedException(NonCheckedException�� ������ ������ Exception)
			e.printStackTrace();
		}
		System.out.println("End");
	}
}
//Core Library�� �ַ� checked�� ������ �ܴ̿� NonChecked�� ����. �ֳ��ϸ� FrameWork�� ������ �ֱ� ����.