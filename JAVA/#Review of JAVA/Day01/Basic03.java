
public class Basic03 {
	public static void main(String[] args){
		//같은 데이터 형태라면 일일이 변수지정 할 필요 없음
		int a=1960, b=1965, c=1991, d=1994;
		
		//배열처리
		int[] f = {1960, 1965, 1991, 1994};
		System.out.println(f[0]);
		System.out.println(f[1]);
		System.out.println(f[2]);
		System.out.println(f[3]);
		
		int[] ff = {a, b, c, d};
		System.out.println(ff[2]);
		
		String[] n = {"장", "김", "장", "장"};
		System.out.println(n[1]);
	}
}
