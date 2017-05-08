
public class Basic05 {
	public static void main(String[] args) {
		//for - 정해진 회수만큼의 일정작업
			//일정범위의 수치확보가 필요할 때.
		for(int i=50 ; i>=20 ; i--){
			System.out.println("i== " + i);
		}
		//=======================================
		//이 변화하는 범위의 수치를 뽑아서 사용하는 가장 기본적인 예(구구단)
		int k =(int)(Math.random()*8)+2;
		System.out.println("k==" + k);
		for(int i = 1; i<=9 ; i++){
			System.out.println(k + "x" + i + "=" + k*i);
		}
		//배열처리할 때.. 배열 접근번호가 0~ 차례대로 증가되면서 설정되기 때문에..
		int[] ar = {1, 4, 12, 4, 24, 124, 5, 14, 2};
		for(int i=0; i<9; i++){
			System.out.println("배열 "+ i +"번" + "==" + ar[i]);
		}
	}
}
