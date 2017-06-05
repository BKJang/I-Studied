package app;

import java.util.Arrays;

class Stat implements Comparable {
	int lv;
	double exp;
	
	Stat(int lv, double exp){
		this.lv = lv;
		this.exp = exp;
	}
	// �߰��� ���ؼ�
	
	@Override
	public int compareTo(Object obj){
		Stat t = (Stat)obj;
		if(this.lv == t.lv){
			if(this.exp > t.exp){//�������϶� ����ġ ������ ����
				return -1;
			}else{
				return 1;
			}
		}else if(this.lv < t.lv){
			return 1;
		}else{
			return -1;
		}
			
		}
	public String toString(){
		return "{lv=" + lv + ", exp=" + exp + "}";
	}
}


public class ComparableEx01 {
	public static void main(String[] args) {
		Stat[] team = {new Stat(1, 11.5), new Stat(6, 29.2), 
						new Stat(6, 11.5), new Stat(3, 1.5), new Stat(2, 3.4)};
		Arrays.sort(team);//sorting
		
		String m = Arrays.toString(team);
		System.out.println(m); //������ ��������, �������̶�� ����ġ ��	}

}
}
