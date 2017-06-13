import java.util.*;

//Map - 데이터저장을 이름(키)을 붙여서 저장시키고, 이름을 통해서 재확보를 할 수 있게 해둔 그룹


public class Essential01 {
	public static void main(String[] args) {
		ArrayList li = new ArrayList();
		Map map1 = new HashMap();
		Map map2 = new TreeMap();
		Map map3 = new Properties();
		Map map4 = new LinkedHashMap();
		//========================================
		// int size() => 개수 얻어내는.
		// booelan isEmpty() => 0개 인지.(비어있냐)
		
		// 등록.. put(K key, V value) : 앞이 이름(키 값), 뒤가 저장객체 값(저장할 데이터) - 기본이 Object, Object
		String[] ar1 = new String[]{"루피", "조로", "나미"};
		int[] ar2 = new int[]{11, 55, 2};
		
		// 키 값은 90%이상이 String으로 씀.
		map1.put("asia", li);
		map1.put("name", ar1);
		map1.put("ages", ar2);
		map1.put(0, new Scanner(System.in) );
		map1.put("title", "컬렉션");
		
		System.out.println(map1.size());
		System.out.println(map1.isEmpty());
		
		// 확보.. V get(K key) : 키 값을 매개변수로 주면 ==> 저장되있는 객체값 변환
		Object o = map1.get("title"); //해당 키에 물려있는 객체가 없으면 null을 리턴
		if(o==null)
				System.out.println("해당 키에 물린 객체 없음");
		else
			System.out.println(o.getClass());
		
		
		//boolean containsKey(Object k), boolean containsValue(Object v)
		boolean b1 = map1.containsKey("컬렉션");//map1의 key값에 "컬렉션"이 없으므로 false
		boolean b2 = map1.containsKey("title");//map1의 key값에 "title"이 있으므로 true
		boolean b3 = map1.containsValue("컬렉션");//map1의 value값에 "컬렉션"이 있으므로 true
		System.out.println("b1 = " + b1 + " b2 = " + b2 + " b3 = " + b3);
		
		//V remove(Object k)
		//V replace(K key, V value)
		map1.replace("title", "collection");
		map1.put("title", "collection");//어차피 put을 하면 대체가 됨.
		String mz = (String)map1.get("title");
			System.out.println(mz);
		//==============================================
		//keySet().. 키만 Set으로 만들어진다.
			
			Set keys = map1.keySet();//키값을 Set으로 만들어줌
			System.out.println(keys.toString());//갖고 있던 키값들을 출력.
	}
}
