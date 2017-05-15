package data;

public class MultiHitter extends Hitter{
	int favorite2; //�����ϴ� ���� �ϳ� �� ����
	public MultiHitter(String s, int i, int j){
		super(s, i);
		favorite2 = j;
		
	}
	public boolean batting(Ball t){
		if(super.batting(t)){
			return true;
		}else if(t.getType()==favorite2){
			return true;
		}else{
			return false;
		}
	}
	public String status(){
		return super.status() + ", " + favorite2;
	}
}
