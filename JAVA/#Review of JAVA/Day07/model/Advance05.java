package model;
//static 설명..
public class Advance05 {
	public static void main(String[] args) {
		// 미리 만들어진다는건..
		// 클래스 언급이 일어나게 될 때 생성됨.
		// static 애들은 생성을 안하고 접근이 됨(new가 필요없음)
		Option.s = "마마";
		Option.hide();
		
		Option n1 = new Option();
			System.out.println(n1.s);
			n1.n=44;
		Option n2 = new Option();
			System.out.println(n2.s);
			n2.n=11;
		System.out.println(n1.info());
		System.out.println(n2.info());
		// 이걸로 얻어내는 효과?
		// 메서드에 static을 붙여서 얻는 효과..
		// 필드에 static을 붙여서 얻는 효과..
	}
	
}
