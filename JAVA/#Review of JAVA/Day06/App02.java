
public class App02 {
	public static void main(String[] args) {
		Pitcher p = new Pitcher();
		
		Pitcher p1 = new Pitcher("이제학"); //이름이 설정된 상태로 확보되게 나머진 0.
		
		Pitcher p2 = new Pitcher("해커", 8, 6, 1);//이름,경기수,승수,패수
		
		//가지고 있을 메서드는
		String m = p1.info();
		System.out.println(m);
		
		double wr = p2.rate();
		System.out.println(wr);
		
		p1.add(0); //0, -1, 1 세개중에 하나를 집어넣음
		//0이면 무승부, -1이면 패, 1이면 승
		System.out.println(p1.info()); //게임수만 올라가있으면 됨
		
		
	}
}
