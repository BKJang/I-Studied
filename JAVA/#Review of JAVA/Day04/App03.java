
public class App03 {
	public static void main(String[] args) {
		int[] ar = {(int)(Math.random()*7) ,
					(int)(Math.random()*7) ,
					(int)(Math.random()*7) ,
					(int)(Math.random()*7) ,
					(int)(Math.random()*7) ,
					(int)(Math.random()*7)};
		//==============================================================
		for(int i=0; i<6; i++){
			System.out.println(ar[i]+" ");
		}
		//==============================================================
		//세팅된 데이터중에...짝수 개수 ==> 확인하는 반복처리
		int c = 0;
		int d = 0;
		for(int i=0; i<6; i++){
			if(ar[i]%2==0){
				c+=1;
			}
		}System.out.println("짝수 개수 : " + c);
		//세팅된 데이터중에...0 여부 ==> 확인하는 반복처리
		for(int i=0; i<6; i++){
			if(ar[i]==0){
				d+=1;
			}
		}System.out.println("0의 개수 : " + d);
		
		
	}
}
