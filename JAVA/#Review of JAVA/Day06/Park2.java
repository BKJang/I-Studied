

public class Park2 {
	String no;
	int use;
	
	//메서드를 함께 구현
		int cost() {	// 메인에서 직접 사용하게 하려면.. static옵션을 설정
			int fee;
			if(use <=10) {
				fee = 0;
			} else if(use <= 60 ) {
				fee = 3000;
			} else {
				fee = 3000;
				int over = use - 60;
				while(over > 0 ){
					fee += 500;
					over -= 15;
				}
			}
			return fee;	// 데이터 반환 키워드
		}
	//-------------------------------------------------------------
		String info(){
			return "차량["+no+"/이용시간:"+use+"]";
	//-------------------------------------------------------------
		}
		boolean change(String cn, int cu){
			no = cn;
			use = cu;
			return true;
		}
	}


