package BuilderPattern;
//Concrete Builder
public class LgGramBlueprint extends BluePrint {

//	private Computer computer;
	private String cpu;
	private String ram;
	private String storage;
	
	public LgGramBlueprint() {
//		computer = new Computer("default","default","default");
	}

	@Override
	public void setCpu() {
//		computer.setCpu("i7");
		cpu = "i7";
	}

	@Override
	public void setRam() {
//		computer.setRam("16G");
		ram = "16G";

	}

	@Override
	public void setStroage() {
//		computer.setStorage("256GB SSD");
		storage = "256GB SSD";
	}

	@Override
	public Computer getComputer() {
		return new Computer(cpu, ram, storage);
//		return computer;
	}

}
