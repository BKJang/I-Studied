package poly2;

public class Hunt {
	public static void run(Game g, int cnt){
		
		g.init();
		for(int i=1; i<=cnt; i++){
			boolean r = g.start();
			if(r==false)
				break;
		}
		g.destroy();
	}
	
}
