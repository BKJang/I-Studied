package app;

import java.awt.Frame;
import java.text.DecimalFormat;

public class DecimalEx {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("000");
		// 1~999
		int n = (int) (Math.random() * 999) + 1;
		String t = "FRAME#" + df.format(n);
		System.out.println(t);
		
		// Frame f = new Frame(t);
		// f.setSize(300, 100); // width, height
		// f.setVisible(true);
		// 실수형을 무조건 소수점 2째자리.
		
	}
}
