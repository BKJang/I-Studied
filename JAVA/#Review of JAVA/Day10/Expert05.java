
public class Expert05 {
	public static void main(String[] args) {
		// Wrapper 클래스로 부르는 클래스들.
		// Boolean, Integer, Long, Float, Double, Character 
			// 생성자는 다 두가지씩 가지고 있다, 지네들 기본데이터 or 문자열
		// 용도..? 기본자료형을 객체화 시키는 클래스
		boolean t = true;
		Boolean b1 = new Boolean(true);
		
		Integer i = new Integer(3);	// Wrap
		Integer ii = new Integer("3");	// Wrap
		System.out.println(i == ii);
		System.out.println(i.equals(ii));
		System.out.println(i.toString());
		
		Character c = new Character('ㄷ');	// Wrap

		// unWrap 기능 있음
		int m = i.intValue();
		char z = c.charValue();
		
		// 데이터 처리를 하는데, 객체형태만 처리해주는 클래스가 있다. 그때 사용하게 될거다.
		
		// Wrapper 클래스가 처리해줄수 있는 기능중에 꼭 알아두셔야되는 기능 parsing
		// String ===> 기본형 데이터로 처리해주는 기능  , 
		int n = Integer.parseInt("4324523");
		double zz = Double.parseDouble("333.333");
		Boolean.parseBoolean("");
		// 기본형데이터 ==> String으로 처리해주는기능
		String mz = Integer.toString(43243);
		
		
		
	}
}









