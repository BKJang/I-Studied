import poly2.*;

class RandomGame extends Game{
	public void init(){//init가 아니면 작동할 수 없음.. 오버라이딩을 시켜놨기 때문에 작동 가능
		System.out.println("랜덤께임!");
	}
	public void destroy(){
		System.out.println("게임 아웃!");
	}
	
}
//=============================================
public class Expert04 {
	public static void main(String[] args) {
		RandomGame r = new RandomGame();
		Hunt.run(r, 2);
	}
}
