package obj;

import java.io.Serializable;

public class Hero implements Serializable {
	String name; //�̸�
	String group; //�Ҽ�
	String sort; //ī�װ�
	public Hero(String n, String g, String s){
		name = n;
		group = g;
		sort =s;
	}
	public String toString(){
		return name + "[" + group +"]";
	}
}
