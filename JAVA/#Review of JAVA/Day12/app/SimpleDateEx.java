package app;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateEx {
	public static void main(String[] args) throws Exception {
		// ���α׷��� ó���� ������ �� ���Ŀ� ���ϰ��� �� ���� �α׸� ����� ���� ��Ȳ
		
		//���ϸ��� log201305261000.txt
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmm");
		
		String name ="log"+sdf.format(new Date())+".txt";
				System.out.println("name = " +name);
				new File(name).createNewFile();
	}
}
