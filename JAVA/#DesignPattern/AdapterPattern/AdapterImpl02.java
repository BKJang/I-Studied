package AdapterPattern;
/* 추가
 * Math 클래스에 새롭게 두 배를 구할 수 있는 함수가 추가
 * 새로 구현된 알고리즘을 이용하여 프로그램을 수정
 * 
 * 절반을 구하는 기능에서 로그를 찍는 기능을 추가
 */
public class AdapterImpl02 implements Adapter {

	@Override
	public Float twiceOf(Float num) {
		
		return Math.doubled(num.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float num) {
		System.out.println("절반 함수 호출 start");
		//Math 클래스를 건드리게 되면 Math클래스를 사용하는 다른 프로그램에도 영향
		return (float) Math.half(num.doubleValue());
	}

}
