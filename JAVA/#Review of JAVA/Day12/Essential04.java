//java.util.��Ű�� ��
	//Scanner

import java.util.*;
import java.io.*;
public class Essential04 {
	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(System.in); //�Է��� ó�����ִ� ����� �ַ� ���. �о ���� �о.
		System.out.println("======");
		Scanner sc = new Scanner("�޷�\n������\n4343\n3.14");
		//Scanner sc = new Scanner(new File("aaa.txt")); //������ ������ ������ ��. ���Ͽ� �ִ� ������ �о
		String z  = sc.nextLine(); //������ �����κ��� ������ �о
		System.out.println("z== " +z);
		String zz = sc.nextLine(); //Ȯ���� �Ǵ°� String
		System.out.println(zz);
		
		//===================================
		int n = sc.nextInt();//int�� ������ �Է¹��� ������ int�� ������ֱ⵵ ��, �� �Է��� ���� int���� �Է�
		System.out.println("N== " +n);
		double d = sc.nextDouble();
		System.out.println("Nu== " +d);
	}
}
