import java.util.Arrays;

public class Essential04 {
	public static void main(String[] args) {
		// 그냥은 무의미하고.. Comparable 인터페이스를 걸어두면
		String[] ar = {"유비", "관우", "장비", "조조", "손책"};
		
		Arrays.sort(ar);//sorting
		String m = Arrays.toString(ar);
		System.out.println(m);
		
		Test[] arr = {new Test(44), new Test(79), new Test(111), new Test(1)};
		String mm = Arrays.toString(arr);//배열 안에 들어가있는 내용을 문자열값으로 다 불러내줌
										 //sorting 안 된 상태
										 //toString을 안쓰면 데이터값으로 출력이 되므로
										 //웬만하면 오버라이딩하는 것
		System.out.println(mm);
		Arrays.sort(arr);//sorting
		System.out.println(Arrays.toString(arr));
	}
}
