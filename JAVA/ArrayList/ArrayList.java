package Algoritm;

public class ArrayList {
	private int size = 0;
	private Object[] Array = new Object[100];

	public ArrayList() {
	 
	}
	     
	public boolean addLast(Object data) {//add element of array(index = last)
		Array[size] = data; 
		size++;
		return true;
	}
	     
	public boolean add(int index, Object data) {//add element in particular index.
		
		for (int i = size - 1; i >= index; i--) {//displace element in a single space
			Array[i + 1] = Array[i];
		}
		Array[index] = data;
		size++;
		return true;
	}
	
	public boolean addFirst(Object data){//add element of array(index = first)
		return add(0, data);
	}
	 	
	public String toString() {
		String str = "[";
		for	(int i = 0; i < size; i++) {
		  str += Array[i];
		  if (i < size - 1)
			  str += ",";
		}
		return str + "]";
	}
	     
	public Object remove(int index) {//delete element in particular index.
		Object removed = Array[index];
		
		for (int i = index + 1; i <= size - 1; i++) {
			Array[i - 1] = Array[i];
		}
		//decrease size.
		size--;
		// delete last element explicitly. 
		Array[size] = null;
		return removed;
	}   
	     
	public Object removeFirst(){//delete element in first index.
		return remove(0);
	}
	 
	public Object removeLast(){//delete element in last index.
		return remove(size-1);
	}
	 
	public Object get(int index) {//get element in particular index.
		return Array[index];
	}
	
	public int size() {//get size of array.
		return size;
	} 
	public int indexOf(Object o) {//get index of particular element.
		for (int i = 0; i < size; i++) {
			if (o.equals(Array[i])) {
				return i;
			}
		}
		return -1;
	}
}
