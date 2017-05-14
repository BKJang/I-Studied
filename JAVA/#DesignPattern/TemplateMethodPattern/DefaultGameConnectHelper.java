package TemplateMethodPattern;

public class DefaultGameConnectHelper extends AbstConnectHelper {

	@Override
	protected String doSecurity(String string) {
		System.out.println("디코드된 정보");
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("아이디/암호 확인");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("권한 확인");
		//서버에서 유저이름, 유저의 나이를 알 수 있다
		//나이를 확인하고 시간을 확인한 이후 성인이 아니라면 shutdown(권한이 없는 것으로)
		
		return 0; //게임 마스터가 접속한다고 일단 전제
	}

	@Override
	protected String connection(String info) {
		System.out.println("최종 접속 단계");
		//스레드를 넘겨주거나 접속할 수 있는 주소를 넘겨주든지
		return null;
	}

}
