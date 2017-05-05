
public class Basic04 {
	public static void main(String[] args){
		//데이터 저장관리가 되는 방식에 따라서 크게 두 가지로 분류가 됨
		//순수데이터타입(기본, 원시) primitive data
		//참조데이터타입(연결, 레퍼런스) reference type - 배열은 이 계열
	
	int a=11, b=11, c=13; 
	System.out.println(a==b);//== : 변수끼리의 데이터가 같은 값인가
	System.out.println(a==c);
	
	int[] i = {1, 2, 3};
	int[] j = {1, 2, 3};
	System.out.println(i[0] == j[0]);
	System.out.println(i[1] == j[1]);
	System.out.println(i[2] == j[2]);
	System.out.println(i == j);
	}
}
