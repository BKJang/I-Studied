import java.util.Scanner;

class grade {
	
	
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	String[] intArr = input.split(" ");
	String b;
	int z, x, c,  v, r;
	
		public void output() throws IntegernumException{
		
		for(int i=0;i<intArr.length;i++){
		
		int a = Integer.parseInt(intArr[i]);
		if(a<0 || a>=100){
			IntegernumException inex = new IntegernumException();
			throw inex;
		}
		
		if(90<=a && a<=100){
			b = "A";
		}else if(80<=a && a<90){
			b = "B";
		}else if(70<=a && a<80){
			b = "C";
		}else if(60<=a && a<70){
			b = "D";
		}else{
			b = "F";
		}
			
		//������ ����
		
		if(b=="A"){
			z++;
		}else if(b=="B"){
			x++;
		}else if(b=="C"){
			c++;
		}else if(b=="D"){
			v++;
		}else{
			r++;
		}
		
		}
		
		System.out.println("A�� �л���  " + z + " B���л��� " + x + 
				" C�� �л��� " + c + " D�� �л��� "+ v +" F�� �л���" + r + "�� �Դϴ�.");
	}
			
}

	
