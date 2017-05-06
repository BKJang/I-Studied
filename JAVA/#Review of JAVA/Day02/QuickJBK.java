
public class QuickJBK {
	public static void main(String[] args) {
		String a = args[0];
		String b = args[1];
		String c = args[2];
		
	System.out.println("노트북 퀵 서비스 접수됨");
	System.out.println("물품명 : " + a);
	System.out.println("중량 : " + b);
	System.out.println("거리 : " + c);
	int b1 = Integer.parseInt(b);
	int b2 = b1/2;
	int b3 = b1%2;
	int b4 = (b3 == 0) ? 100*b2 : 100*b2+100; //2kg당 100원
	
	int c1 = Integer.parseInt(c);
	int c2 = c1/100;
	int c3 = c1%100;
	int c4 = (c3 == 0) ? 100*c2 : 100*c2+100; //100m당 100원
	
	System.out.println("퀵비용 : " + (b4*c4) + "원");
	System.out.println(c1<=1000 ? "1시간이내에 도착합니다" : "1시간이후에 도착합니다");
	
	}
}
