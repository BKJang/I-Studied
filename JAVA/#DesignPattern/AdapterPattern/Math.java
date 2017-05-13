package AdapterPattern;
//이미 구현된 함수
public class Math {

	//두배 
	public static double twoTime(double num){return num*2;}
	//절반
	public static double half(double num){
		return num/2;
		}
	
	//새롭게 두배를 구할 수 있는 함수
	public static Double doubled(Double d){return d*2;}

}
