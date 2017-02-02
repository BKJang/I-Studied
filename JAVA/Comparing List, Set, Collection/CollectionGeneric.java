import java.util.*;
/**객체들을 비 연속적으로(크기를 정할 수 없다), 관리는 업무에서(DAO) - 중복 or 순서 체크할건지 결정 아직 못했어요*/
public class CollectionGeneric {
	/**입력 - Collection
	 * 처리
	 * 출력 - 출력해서 줄거에요 아니면 return을 해줄거에요?? Collection으로 return(UI가 없으니까)*/
	static Collection<Login> getObject(Collection<Login> c){
		Collection<Login> result = c;
		
		System.out.println(c.add(new Login("userid", "userpasswd")));
		
		System.out.println(c.add(new Login("userid", "userpasswd")));
		
		
		return result;
	}
	public static void main(String[] args) {
		System.out.println(getObject(new ArrayList<Login>()));
	
		Collection<Login> set = getObject(new HashSet());
		for(Login tmp : set){
			System.out.println(tmp.getLoginId());
		}//foreach => Iterator 
	}
}