
public class Expert01 {
	public static void main(String[] args) {
		//이미 설계가 끝난 클래스를 원형으로 잡고, 추가/변경시킨 파생클래스를 설계할 수 있다.(상속 = 확장)
		
		//상속관계에서 발생하는 일이 있다.(다형성이란..)
		//하나의 new가 일어나면서 instance 생성이 될텐데, 
		//실제 그 인스턴스(=객체)는 여러 인스턴스의 복합체이다.
	
		new Korean(); //이 안에는 여러가지 형태가 있다.
		new Japanese();
		
		//이게 프로그램적으로 어떤 작업이 되냐는 건데..
		Human h = new Asian(); //h에 연결시킬 수 있는 Human 속성이 있는 객체라면 전부 가능
		System.out.println(h.getClass()); //모든 instance가 갖게되는 기본
		Korean k = new Korean();
		Asian a = new Korean();
		System.out.println(a.getClass());
		//American e = new Korean(); //American 과 Korean은 아예 다른 파트라서 객체 생성이 안됨
		System.out.println(a.info()); //오버라이드가 되있다면, 실제 instance 메서드가 작동함
		//원래 Human 클래스에 있던게 "인간"이었지만 메서드명은 같으므로 덮어씌워진것임
		//그래서 출력은 "한국인"이 된 것
		//인스턴스 연결을 어떤타입으로 받아두었던, 실제 메서드가 작동
		
		// a.rank(); //대신 일을꺼라 생각하는 메서드만 호출;
		
	}
}
