/*
 * AdapterPattern : 이미 구현된 이용하는데 알고리즘을 원하는 형태로 변형하여 사용
 * 즉, 알고리즘을 요구사항에 맞춰 수정 가능
 * 
 * 예를 들어, 기존의 BubbleSort알고리즘(array로 구현)을 이용한다면
 * list -> array 바꾸고,
 * sorting
 * array -> list 바꾸는 방식
 */
package AdapterPattern;

public interface Adapter {
	
	//원하는 기능
	public Float twiceOf(Float num);
	
	public Float halfOf(Float num);
}
