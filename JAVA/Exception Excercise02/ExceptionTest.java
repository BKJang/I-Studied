public class ExceptionTest{
	public static void main(String[] args) {
		Login l=new MemberLogin();
		
		System.out.println(l.login("12345678", "1234"));
		System.out.println(l.login("1", "1234"));//Exception Ã³¸®
		
		System.out.println("end");
	}
}