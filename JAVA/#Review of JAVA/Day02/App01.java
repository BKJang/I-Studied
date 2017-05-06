
public class App01 {
	public static void main(String[] args) {
		
		String[] names = {"루피", "나미", "조로", "우솝", "상디"};
		String[] jobs = {"고무인간", "번개인간", "검투사", "새총", "발차기"};
		String[] attr = {"고무", "불속성", "땅속성"};
		
		int r1 = (int)(Math.random() *5);//0~4
		int r2 = (int)(Math.random() *5);//0~4
		int r3 = (int)(Math.random() *3);//0~2
		
		
		System.out.println("이름: " + names[r1]);
		System.out.println("직업: " + jobs[r2]);
		System.out.println("속성: " + attr[r3]);
		int r4 = 11 + (int)(Math.random() *9); //11 ~ 19
		System.out.println("나이 : " + r4);
		
	//-10 ~ 10 : (int)(Math.random() *21) -10
	}
}
