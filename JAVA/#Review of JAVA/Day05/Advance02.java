
public class Advance02 {
	public static void main(String[] args) {
		// 데이터 관리 측면에서 변화  
		// 데이터를 묶어서 처리할수 있게 설계 # class 라는 키워드를 사용.
		// 사용법?  - new 라는 키워드 
		new Park();	// Park (String no/int use 이걸 가지고 있는)가 만들어짐.
			// 결과물이 머냐..? ==>  접근값이 발생
		System.out.println( new Park() );	// 인스턴스(=실제제품/실체화) 생성	
		System.out.println( new Park() );	// 
		System.out.println( new Park() );
		// 만들어진 애를 사용하기 위해서. 이 값을 받아두면 됨 . 변수타입을 설계해둔 이름
		Park p;	// 이거 자체가 Park를 생성한건 아님..!
		Park d1 = new Park();
			// d1을 통해서 접근해서 사용
			d1.no ="31오9441";
			d1.use = 156;
		System.out.println(d1.no+","+d1.use);	
			
		Park d2 = new Park();
			d2.no ="31오9441";	
			d2.use = 156;
		System.out.println(d2.no+","+d2.use);	
		//==========================================
		System.out.println(d1.no == d2.no);
		System.out.println(d1.use == d2.use);
		System.out.println(d1 == d2);
		
		Park t = d2;	// Park instacne값을 처리할 변수. 이미 만들어진 값도 받을수 있다.	
		System.out.println(t.no+","+t.use);	
		t.no ="11후1234";
		t.use =12;
		System.out.println("==============================");
		System.out.println(t.no+","+t.use);	
		System.out.println(d1.no+","+d1.use);	
		
		System.out.println("d1==" +d1);
		Movie k = new Movie();
		
		
		
	}
}
