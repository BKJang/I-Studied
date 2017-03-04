public class PrintApp {
	public static void main(String[] args) {
		Student st = new Student("1234", "jbk");
		Teacher th = new Teacher("5678", "BKJang");
		st.print();
		th.print();
	}
}