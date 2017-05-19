package PrototypePattern;

public class Shape implements Cloneable{//Object 클래스에 이미 정의되어 있음.
	
	private String id;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
}
