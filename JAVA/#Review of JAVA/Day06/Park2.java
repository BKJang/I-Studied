

public class Park2 {
	String no;
	int use;
	
	//�޼��带 �Բ� ����
		int cost() {	// ���ο��� ���� ����ϰ� �Ϸ���.. static�ɼ��� ����
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
			return fee;	// ������ ��ȯ Ű����
		}
	//-------------------------------------------------------------
		String info(){
			return "����["+no+"/�̿�ð�:"+use+"]";
	//-------------------------------------------------------------
		}
		boolean change(String cn, int cu){
			no = cn;
			use = cu;
			return true;
		}
	}


