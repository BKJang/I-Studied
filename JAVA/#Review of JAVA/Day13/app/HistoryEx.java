package app;

import java.util.*;

public class HistoryEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList li = new ArrayList();

		while (true) {
			System.out.print("# ");
			String m = sc.nextLine();
			if (m.equals("exit"))
				break;

			li.add(m);
		}
		// =====================================
		System.out.println("HISTORY↓ " +li.size() +"개 저장중..");
		for (int i = li.size() - 1; i >= 0; i--) {
			String o = (String) li.get(i);
			System.out.println(o + " (" + o.length() + ") ");
		}

		int n = (int) (Math.random() * li.size());

		String m = (String)li.get(n);
		
		System.out.println("랜덤!!" + m);
		
		
		
		
		
		
	}
}




