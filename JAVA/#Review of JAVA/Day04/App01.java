
public class App01 {
	public static void main(String[] args) {
		//앞의 두자리를 제외한 나머지 값은 *로 표시하는 프로그램
		String id = "jp30219";
		String sid;
		sid = id.substring(0, 2);//앞의 두자리를 빼준다
		
		while(id.length()>sid.length()){//sid의 문자열 길이가 id의 문자열 길이보다 작은 동안 반복 실행
			
			sid += "*";
			
		}
		
		System.out.println(sid);
	}
}
