package BuilderPattern02;
//가독성, 많은 멤버 변수
public class Main {
	public static void main(String[] args) {
		
//		Computer computer = new Computer("256g ssd", "i7", "8g");
		
		Computer computer = ComputerBuilder
			.start()
			.setCpu("i7")
			.setRam("8g")
			.setStorage("256g ssd")
			.build();
			
		System.out.println(computer.toString());
	}
}
