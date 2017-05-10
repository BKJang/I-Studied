
public class Item {
	// 필드들..
	String name; //이름
	int lv; //강화수치
	int price; //가격
	//메서드들..
	
	boolean enchant(){
		if(Math.random()>0.7){
			lv++;
			return true;
		}else{
			return false;
		}
	}
	String info(){
		return name+"/가격="+price+"/강화수치="+lv;
	}
	//================================================
	//생성자들..new 할 떄 작동되는..
	//이걸 설정안하면, new XXXX()패턴으로 작동된다.
	//설정은 일반 매서드 만들듯이 만들면 된다.
	//리턴부 자체가 없음, 이름이 해당 설계하고자하는 데이터(클래스)의 이름과 일치
	//오버로드 룰을 따르기 때문에
	//String 한개짜리를 두개 설계하는 짓은 안됨.
	//애초에 설계를 안하면 new Item()이런 형태로 밖에 안됨.
	//설계를 안하면 디폴트 생성자(매개변수가 없는 생성자)가 자동 추가.
	//설계를 하면 기본 생성자가 자동으로 추가가 안되므로 기본생성자가 필요하면 설계를 따로
	//일단 설계가 들어가면, 디폴트 생성자는 자동추가 안됨(위와 같은 내용)
	//생성자 설정을 했는데, 디폴트 생성도 되게 하고 싶다면 그때 수동으로 추가
	Item() {
		name = "미정";
		lv = 0;
		price = 0;
	}
	Item(String s){
		name = "n";
		lv = 1;
		price = 0;
	}
	Item(String n, int p){
		name = "n";
		lv = 1;
		price = 100;
	}

}
