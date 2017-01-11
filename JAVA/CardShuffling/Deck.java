
public class Deck {
	String [] deck = new String[52];
	
	
	public Deck(){
		
		for(int i=0; i<deck.length ; i++){
			Card cd = new Card();
			deck[i] = cd.showCard();
			
		}
	}
	
	
	public String pick(){
		int i = (int)(Math.random() * 52); 	
		return deck[i];
	}
	
	public String pick(int j){
		return deck[j];	 
	}
	
	public void shuffle(){
		for(int i=0; i<1000 ; i++){
			int j = (int)(Math.random() * 52); 
			String a = deck[0];
			deck[0]=deck[j];
			deck[j]=a;
		}
	}
	

		public static void main(String[] args) {
			Deck dk = new Deck();
			
			String result1 = dk.pick();
			System.out.println("임의로 하나의 카드 뽑기 :" + result1);
			result1 = dk.pick(2);
			System.out.println("세번째 카드 뽑기 : " + result1);
			dk.shuffle();
			String result2 = dk.pick(2);
			System.out.println("섞은 후 세번째 카드 뽑기 : " + result2);
			
		}
		
	}


