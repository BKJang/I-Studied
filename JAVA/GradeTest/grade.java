package GradeTest;

import java.util.Scanner;

class grade {

	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	String[] intArr = input.split(" ");
	String b;
	int z, x, c, v, r;

	public void output() throws IntegernumException{

		for(int i=0;i<intArr.length;i++){

			int a = Integer.parseInt(intArr[i]);
			if(a<0 || a>=100){
				throw new IntegernumException("Scores you insert must be 0 or more and below 100");
			}

			if(90<=a && a<=100)
				b = "A";
			if(80<=a && a<90)
				b = "B";
			if(70<=a && a<80)
				b = "C";
			if(60<=a && a<70)
				b = "D";
			if(a<60)
				b = "F";

			//������ ����

			if(b=="A")
				z++;
			if(b=="B")
				x++;
			if(b=="C")
				c++;
			if(b=="D")
				v++;
			if(b=="F")
				r++;

			System.out.println("A�� �л���  " + z + " B���л��� " + x + 
					" C�� �л��� " + c + " D�� �л��� "+ v +" F�� �л���" + r + "�� �Դϴ�.");
		}
	}
}

	
