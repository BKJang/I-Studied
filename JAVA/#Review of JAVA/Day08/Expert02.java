//java파일 하나에 클래스를 여러개 설계할 수 있다.(단, 일반클래스일 때)

class Base{
	Base(){
		System.out.println("Base()");
	}
}

//========================================================
class Book extends Base{
	Book(){
		System.out.println("Book()");//출력
	}
	Book(String s){
		super();
		System.out.println("Book()" + s);
	}
}
//========================================================
class Magazine extends Book {//Book을 상속했기 때문에 출력시 Book()이 출력됨
							 //extends에 걸린 원본을 만들 때 기본생성자를 찾기 때문에
							 //없는 상황이거나, 다른 생성자를 호출되게 하면서, 상위를 만들 때
							 //super라는 키워드를 사용하면 된다.
	Magazine(){
		super("메롱");//super와 this는 동시에 쓸 수 없다.
		System.out.println("Magazine()");
	}
	Magazine(String s){
		super(s);
		System.out.println("Magazine(String)" + s);
	}
}
//========================================================
public class Expert02{
	public static void main(String[] args) {
		new Magazine();
		
	}
}
