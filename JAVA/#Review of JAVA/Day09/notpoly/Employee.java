package notpoly;

public class Employee {
	int base;
	public Employee(int b){
		this.base = b;
	}
	public int calcSalary(){
		base -= base*0.33;
		return base;
	}
	
}
