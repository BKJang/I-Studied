
public class Hitter2 {
	
		String name;
		int game;
		int tot;
		int hit;
		int hr;
		//----------------------------------------------------------
		boolean init(String n, int g, int t, int h, int d){
			name = n;
			game = g;
			tot = t;
			hit = h;
			hr = d;
			return true;
		}
		String info(){
			double z = average();
			return "Ÿ��["+name+"���� = "+game+"Ÿ���� = "+tot+"��Ÿ =" + hit+"Ȩ�� = " + hr +", Ÿ��="+z+"]";		
		}
		double average(){
			double a = (double)(hit+hr)/tot;
			a += 0.0005;//�Ҽ��� 4°�ڸ����� �ݿø��ؼ� ����
			a = (int)(a*1000)/1000.0;//�Ҽ��� 3°�ڸ����� �ݿø�
			return a;
		}
		boolean add(int i, int j){
			if(j>i){
				return false;
			}else{
			tot += i;
			hit += j;
			game++;
			return true;
			}
		}
		//Ÿ����
		boolean higherThan(Hitter2 c){
			if(average() > c.average()){
				return true;
			}else{
				return false;}
		}
		
		
}
