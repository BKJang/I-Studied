
public class Basic06 {
	public static void main(String[] args) {
		String[] ar = {"박스", "3", "17"};
		// ar의 모든 데이터를 String으로 인식한다.
		//String r = (ar[2]<1000)? "이내": "이후";
		 //String --> int로 변환하는 법을 알아야함
		int a = Integer.parseInt(ar[2]);
		System.out.println("a=="+ a);
	}
}
