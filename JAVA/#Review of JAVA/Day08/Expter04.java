import data.*;

public class Expter04 {
	public static void main(String[] args) {
		MultiHitter m = new MultiHitter("°­Á¤È£", 1, 3);
	
		Ball b1 = new Ball(1);
		Ball b2 = new Ball(3);
		
		boolean r1 = m.batting(b1);
		System.out.println(r1);
		boolean r2 = m.batting(b2);
		System.out.println(r2);
		
		String z = m.status();
		System.out.println(z);
	}
}
