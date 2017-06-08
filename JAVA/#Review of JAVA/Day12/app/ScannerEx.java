package app;

import java.text.MessageFormat;
import java.util.*;

public class ScannerEx {
	public static void main(String[] args) {
		//Scanner를 쓰는데, 설정을 System.in으로 해서 생성
		System.out.println("등록할 영화정보");
		Scanner sc = new Scanner(System.in);
		System.out.println("제목");
		String name  = sc.nextLine();// nextLine
		System.out.println("개봉년도");
		//int year  = sc.nextInt(); //nextInt 섞어서 쓰면 문제가 발생
		int year = Integer.parseInt(sc.nextLine());//이런식으로 쓰는게 좋음..
		System.out.println("장르");
		String genre = sc.nextLine();
		

		
		Object[] db = {name, year, genre};
		MessageFormat f = new MessageFormat("{0}, {1}, {2}");
		String cmd = f.format(db);
		System.out.println(cmd);
	}
}

//API => 번역 API changki.net