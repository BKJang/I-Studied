//복잡한 단계가 필요한 인스턴스 생성
//Builder Pattern : 복잡한 단계를 거쳐야 생성되는 객체의 구현을 서브 클래스에게 넘겨주는 패턴
package BuilderPattern;

public class Main {
	public static void main(String[] args) {
		
		ComputerFactory factory = new ComputerFactory();//ComputerFactory : 컴퓨터를 만들어주는 애

		factory.setBlueprint(new LgGramBlueprint());
		
		factory.make();
		
		Computer computer = factory.getComputer();

//		Computer computer = new Computer("17", "16G", "256G SSD");
		
		System.out.println(computer.toString());
	}
}
