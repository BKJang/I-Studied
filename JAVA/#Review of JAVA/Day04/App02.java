
public class App02 {
	public static void main(String[] args) {
		//a�� b������?
		double r =1.0;
		int a = (int)(Math.random()*4)+2;
		int b = (int)(Math.random()*10)-4;
		
		if(b>0){
			for(int b1=0 ; b>b1 ; b1++){//������ �ش�Ǵ� !����! ���α׷��� ���ư�
				r *= a;
			}
		}else if(b<0){
			for(int b1=0 ; b<b1  ;b1--){
				r /= a;
			}
		}else{
			r=1.0;
		}
		System.out.println(a +"��" + b + "������ " +r);
	}
}
