/*Template Method Pattern : 알고리즘 구조를 메소드에 정의하고
 *하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 재정의하는
 *
 *구현하려는 알고리즘이 일정한 프로세스가 있다
 *구현하려는 알고리즘이 변경가능성이 있다
 *
 *1. 알고리즘을 여러 단계로 나눈다
 *2. 나눠진 알고리즘의 단계를 메소드로 선언
 *3. 알고리즘을 수행할 템플릿 메소드를 만든다
 *4. 하위 클래스에 나눠진 메소드들을 구현
 */
package TemplateMethodPattern;

public abstract class AbstConnectHelper {
	
	//외부로부터의 접속이기 떄문에 외부로 드러나서는 안된다.(but 하위클래스에서 사용가능하도록 : private가 안됨)
	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);
	
	//템플릿 메소드
	public String requestConnection(String encodedInfo){
		
		//보안 과정 - 암호화된 문자열을 디코딩
		String decodedInfo = doSecurity(encodedInfo);
		
		//반환된 것을 가지고 아이디, 암호를 할당
		String id = "aaa";
		String password = "abc";
		
		if(!authentication(id, password)){
			throw new Error("아이디나 암호가 정확하지 않습니다.");
		}
		
		
		String userName = "JBK";
		int key =  authorization(userName);
		
		switch(key){
		case -1 :
			throw new Error("shutdown제에 의한 접속 불가");
			//강화된 알고리즘에 의한 유지보수(편리)
			
		case 0 :
			System.out.println("게임 마스터");
			break;
		
		case 1 :
			System.out.println("유료 회원");
			break;
		
		case 2 :
			System.out.println("무료 회원");
			break;
		
		case 3 :
			System.out.println("권한 없음");
			break;
		
		default ://기타상황
			break;
			
		}
		return connection(decodedInfo);
	}
}
