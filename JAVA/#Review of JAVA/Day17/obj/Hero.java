package obj;

import java.io.Serializable;

public class Hero implements Serializable {
	String name; //이름
	String group; //소속
	String sort; //카테고리
	public Hero(String n, String g, String s){
		name = n;
		group = g;
		sort =s;
	}
	public String toString(){
		return name + "[" + group +"]";
	}
}
