package TemplateMethodPattern;
/*요구 사항
 *1.신작 게임의 접속을 구현
 *- requestConnection(String str) : String
 *
 *2.유저가 게임 접속시 다음을 고려
 *- 보안 과정 : 보안 과련 부분을 처리
 *	--doSecurity(String string) : String
 *
 *- 인증 과정 : username과 password가 일치하는지 확인
 *	--autentication(String id, String password) : boolean
 *
 *- 권한 과정 : 접속자가 유료회원인지 무료회원인지 게임 마스터인지 확인
 *	--authorization(String userName) : int
 *
 *- 접속 과정 : 접속자에게 커넥션 정보를 넘겨준다.
 *	--connection(String info) : String
 *
 * 강화된 보안 부분
 * -보안 부분이 정부정책에 의해서 강화되었다.
 * -여가부에서 밤 10시 이후에 접속이 제한되도록 한다.
 */
public class Application {
	public static void main(String[] args) {
		AbstConnectHelper helper = new DefaultGameConnectHelper();
		
		helper.requestConnection("아이디/암호 등 접속 정보");
		
		
	}
}
