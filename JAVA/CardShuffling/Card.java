
public class Card {
	String kind;	
	String num;
	int i;
	int number;
	
	public Card(){
		
		int i = (int)(Math.random() * 4) + 1;
		
		if(i == 1){
			kind = "Spade";
		}
		else if(i == 2){
			kind = "Heart";
		}
		else if(i == 3){
			kind = "Diamond";
		}else{
			kind = "Clover";
		}	
		
		int number = (int)(Math.random() * 13) + 1; 
		
		if(number == 1){
			 num = "A";
		}else if(number == 11){
			 num = "J";
		}else if(number == 12){
			 num = "Q";
		}else if(number == 13){
			 num = "K";
		}else{
			 num = Integer.toString(number);
		}
		
		
	}
	
	public String showCard(){
		
		return kind + " " + num;
	}
	
}
