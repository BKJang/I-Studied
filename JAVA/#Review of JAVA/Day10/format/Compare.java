package format;

// 인터페이스..? - 추상클래스의 목적과 똑같음 / 틀잡아둔 설계
	// 추상클래스와 차이가 있다면..필드나 완성메서드를 못갖는다 / 미완성(추상메서드)만 가질수 잇음
public interface Compare {
	public abstract boolean same(int a, int b);
	public abstract boolean like(int a, int b);
}

