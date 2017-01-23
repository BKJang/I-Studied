package Algoritm;
import java.util.Scanner; 

public class LinkedListEx {
	private Node Head; 
    private static int nNumber=0; //number of node

    public LinkedListEx()
    { 
            Head=new Node(0);//Location '0' is Head of Node.
    } 
     
    public void insertNode(int ndata,int nSequence) 
    { 
            Node pNew=new Node(ndata); 

            if(nNumber==0) 
                    Head.Next=pNew; 

            Node pTemp=new Node(0);//Making Object of Node.java.
            pTemp=Head; 
            for(int i=0;i<nSequence;i++) 
                    pTemp=pTemp.Next; 

            pNew.Next=pTemp.Next;          
            pTemp.Next=pNew; 
                     
            nNumber++;//Increase size of Node.
    } 

    public boolean deleteNode(int nSequence) 
    { 
            if(nNumber<nSequence) 
            { 
                 System.out.println("Location that you insert is larger than size of node!!"); 
                 return false; 
            } 

            Node pTemp=new Node(0); 
            Node pTemp2=new Node(0); 
            pTemp=Head; 

            for(int i=0;i<nSequence-1;i++) 
                    pTemp=pTemp.Next; 

            pTemp2=pTemp.Next; 
            pTemp.Next=pTemp2.Next; 
     
            nNumber--;//Decrease size of Node.
     
            return true; 
    } 

    public void showData() 
    { 
            Node pTemp=new Node(0); 
            pTemp=Head; 
            int data; 

            if(nNumber==0) 
                    System.out.println("That isn't have any data!!"); 
             
            for(int i=0;i<nNumber;i++) 
            { 
                    pTemp=pTemp.Next; 
                    data=pTemp.getData(); 
                    System.out.print(data + " "); 
            } 
    } 

    public void showMenu() 
    { 
            System.out.println("1. Add"); 
            System.out.println("2. Delete"); 
            System.out.println("3. Show");   
            System.out.println("4. End"); 
            System.out.print("Select the Menu : "); 
    } 

    public static void main(String args[]){
    	LinkedListEx ll=new LinkedListEx(); 
    	 
    	while (true) 
        { 
    		ll.showMenu();
    		Scanner sc = new Scanner(System.in);
    		int n = sc.nextInt();
        	switch (n){ 
        	case 1: 
        		System.out.println("Insert Data that you want save : ");
            	int a = sc.nextInt();
            	System.out.println("Insert Location of Data : ");
            	int b = sc.nextInt();
            	ll.insertNode(a, b);
                break; 
            case 2: 
            	System.out.println("Insert Location of Data that you want delete : ");
            	int c = sc.nextInt();
            	sc.nextLine();
            	if(c==0){
            		ll.deleteNode(0);
            	}else
            		ll.deleteNode(c-1);
            	break;
            case 3: 
            	ll.showData();
            	System.out.println("");
            	break;
        		} 
        	if(n == 4)
            	break;
        }
    } 
}
	
	 