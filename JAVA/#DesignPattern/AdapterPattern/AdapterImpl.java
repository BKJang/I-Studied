package AdapterPattern;

public class AdapterImpl implements Adapter {
	
	@Override
	public Float twiceOf(Float num) {
		
		return (float) Math.twoTime(num.doubleValue());//�ڵ����� �� ��ȯ
	}

	@Override
	public Float halfOf(Float num) {
		
		return (float) Math.half(num.doubleValue());//�ڵ����� �� ��ȯ

	}

}
