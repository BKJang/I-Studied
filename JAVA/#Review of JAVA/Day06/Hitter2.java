
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
			return "타자["+name+"경기수 = "+game+"타석수 = "+tot+"안타 =" + hit+"홈런 = " + hr +", 타율="+z+"]";		
		}
		double average(){
			double a = (double)(hit+hr)/tot;
			a += 0.0005;//소수점 4째자리에서 반올림해서 끊음
			a = (int)(a*1000)/1000.0;//소수점 3째자리에서 반올림
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
		//타율비교
		boolean higherThan(Hitter2 c){
			if(average() > c.average()){
				return true;
			}else{
				return false;}
		}
		
		
}
