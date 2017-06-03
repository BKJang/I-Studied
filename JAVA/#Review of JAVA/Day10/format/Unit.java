package format;

//==========================================
// 추상클래스 - 다형성 활용을 위해 틀잡아둔 설계 
public abstract class Unit {
	String name;
	int x;
	public Unit(String name){
		this.name = name;
		this.x =0;
	}
	public void move(int x) {
		this.x =x;
	}
	public abstract boolean possible(int t);
	public abstract String info(); 
}
// 필드도 가지고 있고, 완성된 메서드도 가질수 잇고
// 미완성메서드도 가질수 있는 클래스
// 객체생성은 안됨 # 