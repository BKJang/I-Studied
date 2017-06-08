package app;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateEx {
	public static void main(String[] args) throws Exception {
		// 프로그램이 처리가 끝나고 난 이후에 파일같은 걸 만들어서 로그를 남기고 싶은 상황
		
		//파일명이 log201305261000.txt
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmm");
		
		String name ="log"+sdf.format(new Date())+".txt";
				System.out.println("name = " +name);
				new File(name).createNewFile();
	}
}
