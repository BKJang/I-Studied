package Algoritm;

public class DNAEx01 {
    public static void main (String[] args){
    	DNA dna = new DNA();
        char[] charArray = dna.dna.toCharArray();
        
        int num1 = 0, num2 =0, num3 =0;

        for(int j=0; j<=charArray.length - 4 ; j++) {
            if (charArray[j] == 'T' && charArray[j + 1] == 'A' && charArray[j + 2] == 'G' && charArray[j + 3] == 'G') {
                num1++;
            } else if (charArray[j] == 'C' && charArray[j + 1] == 'C' && charArray[j + 2] == 'A' && charArray[j + 3] == 'G') {
                num2++;
            } else if (charArray[j] == 'A' && charArray[j + 1] == 'G' && charArray[j + 2] == 'C' && charArray[j + 3] == 'C') {
                num3++;
            }
        }
        System.out.println("TAGG : " + num1);
        System.out.println("CCAG : " + num2);
        System.out.println("AGCC : " + num3);
    }
}