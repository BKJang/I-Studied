
public class CalcJBK {
	public static void main(String[] args) {
		String a = args[0];
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int res;
		System.out.println("���� : " + a);
		System.out.println("���� 1 : " + b + " ���� 2 : " + c);
		switch(a){
		case "add" : 
		case "Add" :	
		case "ADD" : res = b + c;
		System.out.println("�������" + res);
		break;
		case "sub" :
		case "Sub" :
		case "SUB" : res = b - c;
		System.out.println("�������" + res);
		break;
		case "mul" :
		case "Mul" :
		case "MUL" : res = b * c;
		System.out.println("�������" + res);
		break;
		case "div" :
		case "Div" :
		case "DIV" : res = b / c;
		System.out.println("�������" + res);
		
		}
	
	}
}
