/*
 * 데이터관리 - 자료형 설계해서
 * 데이터처리 - 함수화 시켜서
 * 	프로그램을 만들때는 함수들을 많이 만들어두고 필요할 때 불러다가 흐름을 만들어 내자! <-여기까지 생각한게 절차지향
 * 객체지향으로 넘어오면 개념이 하나 추가 된다.
 * 애초에 자료형 설계를 할 때, 그 안에 메서드까지 함께 구현
 * 
 * 주차요금계산 같은걸 해보자면서, Park를 설계하고,
 * 주차시간에 따른 요금을 계산하는 함수를 만들어봤는데..이걸 객체지향방식으로 처리하면
 */
public class Advance01 {
	public static void main(String[] args) {
		Park2 p = new Park2();
			p.no = "11오 4965";
			p.use = 79;
			
			int c = p.cost();
			System.out.println("C==" +c);
		Park2 p2 = new Park2();
			p.no = "14오 1142";
			p.use = 19;
			p2.change("31자 1234", 19);
			System.out.println(p2.info());
			
			int c2 = p2.cost();
			System.out.println("C2==" + c2);
			
			p2.use +=50;
			System.out.println(p2.use);
			System.out.println(p2.cost());
		}
}
