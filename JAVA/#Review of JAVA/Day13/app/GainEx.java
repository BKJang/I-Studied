package app;

import java.util.*;

public class GainEx {
	public static void main(String[] args) {
		// Set -- ���ٰ� �����Ǵ� ���� ������Ѵ�.//
		Set<Integer> gain = new HashSet<Integer>();//TreeSet�� ���� ���ĵ� ���� ��.
		
		while (true) {
			int n = (int) (Math.random() * 45) + 1;
			System.out.println("n===> " + n);
			gain.add(new Integer(n));
			if (gain.size() == 6) {			
				break;
			}
		}
		System.out.println(gain.toString());
		Object[] ar = gain.toArray();
		
	}
}
