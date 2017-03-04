public interface Login {
	/**로그인
	 *- 입력 : 아이디, 비밀번호
	 *- 출력 : boolean or void-예외 or Name or 회원정보==> No 예외 클래스 */
	Member login(String userId, String userPw) throws
	   LoginIDMinLengthException, PasswordDefaultLengthException;
}