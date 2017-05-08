
public class Basic02 {
	public static void main(String[] args) {
		
		String[] ar = {"뉴스", "만화/웹툰", "게임", "영화"};
		//배열중에 랜덤으로 2개를 찍는다.
		//하지만 2개의 수가 겹치지 않도록!
		int n1 = (int)(Math.random()*4);
		int n2 = (int)(Math.random()*4);
		
		while(n1==n2){
			n1 = (int)(Math.random()*4);
			n2 = (int)(Math.random()*4);
		}
		//판단을 하고 작업을 시작
		do{
			n1 = (int)(Math.random()*4);
			n2 = (int)(Math.random()*4);
		}while(n1==n2);
		//일단 하고 난 후에 판단을 시작(최소한 1번은 무조건 실행해야한다고 판단 될 때)
		
		System.out.println("당신의 취미는 " + ar[n1] + ", " + ar[n2]);
	}	
}
