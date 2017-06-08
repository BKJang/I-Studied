//java.util.패키지 쪽
	//Scanner

import java.util.*;
import java.io.*;
public class Essential04 {
	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(System.in); //입력을 처리해주는 기능을 주로 담당. 읽어낸 값을 읽어냄.
		System.out.println("======");
		Scanner sc = new Scanner("메롱\nㅋㅋㅋ\n4343\n3.14");
		//Scanner sc = new Scanner(new File("aaa.txt")); //파일이 없으면 에러가 뜸. 파일에 있는 내용을 읽어냄
		String z  = sc.nextLine(); //설정된 곳으로부터 한줄을 읽어냄
		System.out.println("z== " +z);
		String zz = sc.nextLine(); //확보가 되는건 String
		System.out.println(zz);
		
		//===================================
		int n = sc.nextInt();//int로 받으면 입력받은 내용을 int로 만들어주기도 함, 단 입력할 때는 int값을 입력
		System.out.println("N== " +n);
		double d = sc.nextDouble();
		System.out.println("Nu== " +d);
	}
}
