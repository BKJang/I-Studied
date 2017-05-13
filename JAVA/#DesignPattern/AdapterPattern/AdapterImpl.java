package AdapterPattern;

public class AdapterImpl implements Adapter {
	
	@Override
	public Float twiceOf(Float num) {
		
		return (float) Math.twoTime(num.doubleValue());//자동으로 형 변환
	}

	@Override
	public Float halfOf(Float num) {
		
		return (float) Math.half(num.doubleValue());//자동으로 형 변환

	}

}
