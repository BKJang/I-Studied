import poly.*;
public class Expert03 {
	public static void main(String[] args) {
		Employee e = new Employee(5700000);
		PartTime p = new PartTime(6100, 10);
		
		int t1 = Calc.income(e);// 12개월치의 급여
		System.out.println(t1);
		int t2 = Calc.income(p);// 12개월치의 급여
		System.out.println(t2);
	}
}
