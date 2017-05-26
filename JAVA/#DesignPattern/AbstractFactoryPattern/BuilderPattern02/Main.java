package BuilderPattern02;
//많은 변수를 가진 객체 생성을 가독성 높도록 코딩
public class Main {
	public static void main(String[] args) {

		Computer computer = ComputerBuilder
				.start()
				.setCpu("i7")
				.setRam("8g")
				.setStorage("256g ssd")
				.build();

		System.out.println(computer.toString());
	}
}
