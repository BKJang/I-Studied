
public class App02 {
	public static void main(String[] args) {
		//a의 b제곱은?
		double r =1.0;
		int a = (int)(Math.random()*4)+2;
		int b = (int)(Math.random()*10)-4;
		
		if(b>0){
			for(int b1=0 ; b>b1 ; b1++){//조건이 해당되는 !동안! 프로그램이 돌아감
				r *= a;
			}
		}else if(b<0){
			for(int b1=0 ; b<b1  ;b1--){
				r /= a;
			}
		}else{
			r=1.0;
		}
		System.out.println(a +"의" + b + "제곱은 " +r);
	}
}
