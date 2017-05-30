package poly;

public class Employee extends Person {
	int base;
	public Employee(int s){
		this.base = base;
	}
	public int calcSalary(){
		base -= base*0.33;
		return base;
	}
}
