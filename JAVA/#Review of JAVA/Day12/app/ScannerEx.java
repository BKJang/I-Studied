package app;

import java.text.MessageFormat;
import java.util.*;

public class ScannerEx {
	public static void main(String[] args) {
		//Scanner�� ���µ�, ������ System.in���� �ؼ� ����
		System.out.println("����� ��ȭ����");
		Scanner sc = new Scanner(System.in);
		System.out.println("����");
		String name  = sc.nextLine();// nextLine
		System.out.println("�����⵵");
		//int year  = sc.nextInt(); //nextInt ��� ���� ������ �߻�
		int year = Integer.parseInt(sc.nextLine());//�̷������� ���°� ����..
		System.out.println("�帣");
		String genre = sc.nextLine();
		

		
		Object[] db = {name, year, genre};
		MessageFormat f = new MessageFormat("{0}, {1}, {2}");
		String cmd = f.format(db);
		System.out.println(cmd);
	}
}

//API => ���� API changki.net