package AdapterPattern;
/* �߰�
 * Math Ŭ������ ���Ӱ� �� �踦 ���� �� �ִ� �Լ��� �߰�
 * ���� ������ �˰����� �̿��Ͽ� ���α׷��� ����
 * 
 * ������ ���ϴ� ��ɿ��� �α׸� ��� ����� �߰�
 */
public class AdapterImpl02 implements Adapter {

	@Override
	public Float twiceOf(Float num) {
		
		return Math.doubled(num.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float num) {
		System.out.println("���� �Լ� ȣ�� start");
		//Math Ŭ������ �ǵ帮�� �Ǹ� MathŬ������ ����ϴ� �ٸ� ���α׷����� ����
		return (float) Math.half(num.doubleValue());
	}

}
