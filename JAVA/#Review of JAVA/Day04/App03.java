
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
		//���õ� �������߿�...¦�� ���� ==> Ȯ���ϴ� �ݺ�ó��
		int c = 0;
		int d = 0;
		for(int i=0; i<6; i++){
			if(ar[i]%2==0){
				c+=1;
			}
		}System.out.println("¦�� ���� : " + c);
		//���õ� �������߿�...0 ���� ==> Ȯ���ϴ� �ݺ�ó��
		for(int i=0; i<6; i++){
			if(ar[i]==0){
				d+=1;
			}
		}System.out.println("0�� ���� : " + d);
		
		
	}
}
