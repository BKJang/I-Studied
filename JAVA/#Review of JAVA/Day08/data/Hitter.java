package data;

public class Hitter {
	String name; // 이름
	int tot; // 총 휘두른 회수
	int hit; // 때린 회수
	int favorite; // 좋아하는 구질
	
	// 생성자 추가.. String 생성자, (이름설정, favorite = 0)
	// 생성자 추가 .. String, int 생성자 (이름, favorite 설정되게)
	public Hitter(String name, int fav) {
		this.name = name;
		favorite = fav;
		tot = 0;
		hit = 0;
	}

	public Hitter(String name) {
		this(name, 0);
	}

	// 출력문자열 잡아주는
	// 선수명 좋아하는구질 (0/1/2/3 ==> 문자열로 바꿔서) tot, hit 도 포함
	public String status() {
		String[] strs = { "패스트볼", "커브", "슬라이더", "체인지업" };
		return "타자 = " + name + ",강점:" + strs[favorite] + "(" + tot + " / " + hit + ")";
	}
	// 메서드가 하나 더
	public boolean batting(Ball target) {
		tot++;
		if (target.getMistake() == true) {
			hit++;
			return true;
		} else if (target.getType() == this.favorite) {
			hit++;
			return true;
		} else {
			return false;
		}
		// 실투였으면 무조건 true
		// 좋아하는 공이면 true
		// 그게 아니면 전부 false
		// 그러면서, tot, hit에 변화가 일어나야 함
	}
	// =====================================================================
	public static void main(String[] args) {
		Hitter h1 = new Hitter("박병호", 2);
		System.out.println(h1.status());
		Ball b1 = new Ball(2);
		System.out.println(b1.info());
		boolean r = h1.batting(b1);
		System.out.println(r);
		Pitcher p1 = new Pitcher("김광현");
		Ball b2 = p1.pitching();
		h1.batting(b2);
	}

}
