public class MemberLogin implements Login{

	@Override
	public Member login(String userId, String userPw) 
			throws LoginIDMinLengthException, PasswordDefaultLengthException {
		Member m=null;
		// DBMS, file üũ
		m=new Member(userId, userPw);
		//
		return m;
	}
	
}