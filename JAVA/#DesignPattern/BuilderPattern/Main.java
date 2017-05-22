//������ �ܰ谡 �ʿ��� �ν��Ͻ� ����
//Builder Pattern : ������ �ܰ踦 ���ľ� �����Ǵ� ��ü�� ������ ���� Ŭ�������� �Ѱ��ִ� ����
package BuilderPattern;

public class Main {
	public static void main(String[] args) {
		
		ComputerFactory factory = new ComputerFactory();//ComputerFactory : ��ǻ�͸� ������ִ� ��

		factory.setBlueprint(new LgGramBlueprint());
		
		factory.make();
		
		Computer computer = factory.getComputer();

//		Computer computer = new Computer("17", "16G", "256G SSD");
		
		System.out.println(computer.toString());
	}
}
