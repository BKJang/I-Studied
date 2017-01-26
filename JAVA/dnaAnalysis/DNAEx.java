package Algoritm;

public class DNAEx {
	public static void main(String[] args) {
		DNA dna = new DNA();
		
		int TAGG = 0;
		int CCAG = 0;
		int AGCC = 0;
		
		char[] charArray = dna.dna.toCharArray();
		char[] Arr = new char[4];
		
		for(int i=0; i < charArray.length - 3; i++){
			for(int j=0; j < Arr.length; j++ ){
				Arr[j] = charArray[i + j];
			}
			
			//change charArray to String
			String seq = new String(Arr);
			
			switch(seq){
			case "TAGG" :
				TAGG++;
				break;
			case "CCAG" :
				CCAG++;
				break;
			case "AGCC" :
				AGCC++;
				break;
			}
		}
		System.out.println("TAGG : " + TAGG);
		System.out.println("CCAG : " + CCAG);
		System.out.println("AGCC : " + AGCC);
	}
}
