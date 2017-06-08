//포맷계열의 MessageFormat

import java.text.*;

public class Essential03 {
	public static void main(String[] args) {
		MessageFormat f = new MessageFormat("안녕하세요.\"{0}\"씨! 반갑습니다. 나이는 {1}살 이시라구요!" ); // 기본 생성자는 없고 안의 숫자가 배열의 숫자..
											//쌍따옴표 출력시엔 \" 이런식으로 출력해야함. 홀따옴표는 ''

		//String[] ar = {"루피", "31"};
		Object[] ar = {"루피", 31};
		String r = f.format(ar);
		System.out.println(r);
	}
}
