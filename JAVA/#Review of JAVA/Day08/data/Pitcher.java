package data;

public class Pitcher {
	String name; // 이름
	int stamina; // 체력
	// 생성자는 String하나짜리만, (stamina=20) 으로
	public Pitcher(String name) {
		Pitcher.this.name = name;
		stamina = 20;
	}
	// 현재 상태를 문자열로 (name과 stamina를 이용해서 출력 문자열 생성)
	public String status() {
		return "투수 = " + name + ",체력:" + stamina;
	}
	// getter를 만들실분을 만드시고. (패스하실분은 하고)
	// Ball을 생성하는 메서드 2개 .. 오버로드 (매개변수형태만 다르면 중복정의)
	public Ball pitching(int m) {
		// 이게 0이면 stamina -=2 , 1이면 -=4, 2이면 -=4 , 3이면 -=3
		// 체력이 부족하거나, 20퍼센트확률로 실투로 설정되게
		Ball t;
		int[] c = {2, 4, 4, 3};
		if(stamina >= c[m]){
			if(Math.random()<0.2) {
				t= new Ball(m, true);
			}else {
				t= new Ball(m);
			}
		}else {
			t= new Ball(m, true);
		}
		stamina -=  c[m];
		return t;
	}
	public Ball pitching() {
		int r = (int)(Math.random()*4);
		Ball c = pitching(r);
		return c;
	}
	//===================================================================================
	public static void main(String[] args) {
		Pitcher p = new Pitcher("김광현");
		Ball b1 = p.pitching();
		System.out.println(b1.info());
		System.out.println(p.status());
		Ball b2 = p.pitching(0);
		System.out.println(b2.info());
		p.pitching(2);
		p.pitching(1);
		p.pitching(2);
		p.pitching(2);
		Ball b3 = p.pitching(3);
		System.out.println(b3.info());
		System.out.println(p.status());
	}
}















