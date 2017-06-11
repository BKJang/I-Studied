package app;

import java.util.*;

public class GainEx {
	public static void main(String[] args) {
		// Set -- 같다고 생각되는 놈은 저장안한다.//
		Set<Integer> gain = new HashSet<Integer>();//TreeSet을 쓰면 정렬도 같이 됨.
		
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
