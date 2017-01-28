package Algoritm;

public class ArrayListEx {
    public static void main(String args[]){
    	ArrayList numbers = new ArrayList();
    	numbers.addLast(10);
    	numbers.addLast(555);
    	numbers.addLast(20);
    	numbers.addLast(23);
    	numbers.addLast(677);
    	numbers.removeFirst();
    	numbers.removeLast();
    	
    	System.out.println(numbers.size());//size of Array
    	System.out.println(numbers);//show Array
    	System.out.println(numbers.get(0));//get Array[0]
    	System.out.println(numbers.get(1));//get Array[1]
    	System.out.println(numbers.get(2));//get Array[2]
    	System.out.println(numbers.indexOf(20));//get index of element 20
    	System.out.println(numbers.indexOf(40));//get index of element 40
    }
}
