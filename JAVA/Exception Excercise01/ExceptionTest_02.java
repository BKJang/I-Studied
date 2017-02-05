//실행오류는 아래서부터 검토!!
public class ExceptionTest_02 {
	public static void main(String[] args) {
		// int num = Integer.parseInt("A1234"); //NumberFormatException : RuntimeException:NonCheckedException(굳이 VM이 체크하지 않는 Exception)
		int num = Integer.parseInt("1234");
		new String();
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {//CheckedException(NonCheckedException을 제외한 나머지 Exception)
			e.printStackTrace();
		}
		System.out.println("End");
	}
}
//Core Library는 주로 checked가 많지만 이외는 NonChecked가 많다. 왜냐하면 FrameWork와 서버가 있기 때문.