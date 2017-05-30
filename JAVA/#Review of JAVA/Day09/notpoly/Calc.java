package notpoly;

import poly.PartTime;

public class Calc {
	public static int income(Employee t){
		return t.calcSalary() * 12;
	}
	
	public static int income(PartTime t){
		return t.calc() * 12;
	}
}
