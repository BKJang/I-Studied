package app;

import java.text.*;

class Employee{
	String firstName;
	String lastName;
	int age;
	
	public Employee(String f, String ln, int a){
		firstName = f;
		lastName = ln;
		age = a;
	}
	
	public String toString(){
		Object[] obj = {firstName, lastName, age};
		MessageFormat mf = new MessageFormat("\"firstname\": \"{0}\", \"lastname\": \"{1}\", \"age\": \"{2}\"");
		return mf.format(obj); //포맷형태의 리턴
	}
}

public class MessageEx {
	public static void main(String[] args) {
		
		Employee e = new Employee("John", "Doe", 31);
		System.out.println(e.toString()); 
		
		//================================================================
		String id = "saan";
		String pass = "1q2w3e";
		String nick = "산";
		
		Object[] db = {id, pass, nick};
		MessageFormat f = new MessageFormat("insert into info values(''{0}'', ''{1}'', ''{2}'')");
		String cmd = f.format(db);
		System.out.println(cmd);
		//insert into info values('saan', '1q2w3e', '산')
	}
}
