/*
 * AdapterPattern : �̹� ������ �̿��ϴµ� �˰����� ���ϴ� ���·� �����Ͽ� ���
 * ��, �˰����� �䱸���׿� ���� ���� ����
 * 
 * ���� ���, ������ BubbleSort�˰���(array�� ����)�� �̿��Ѵٸ�
 * list -> array �ٲٰ�,
 * sorting
 * array -> list �ٲٴ� ���
 */
package AdapterPattern;

public interface Adapter {
	
	//���ϴ� ���
	public Float twiceOf(Float num);
	
	public Float halfOf(Float num);
}
