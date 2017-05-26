package Concrete03;

import AbstractFactory02.Button;
import AbstractFactory02.GUIFac;
import AbstractFactory02.TextArea;


public class FactoryInstance {
	
	public static GUIFac getGuiFac(){
		
		System.out.println(System.getProperty("os.name"));
		switch(getOsCode()) {
			case 0 :
				return new MacGuiFac();
			case 1 :
				return new LinuxGuiFac();
			case 2 :
				return new WinGuiFac();
		}
		return null;
	}

	private static int getOsCode() {
		if (System.getProperty("os.name").equals("Mac OS X")){
			return 0;
		}else if(System.getProperty("os.name").equals("Windows 10")){
			return 2;
		}else{
			return 1;
		}
	}
}

class LinuxButton implements Button {

	@Override
	public void click() {
		System.out.println("리눅스 클릭");
	}
}

class LinuxGuiFac implements GUIFac{

	@Override
	public Button createButton() {
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		return new LinuxTextArea();
	}

}

class LinuxTextArea implements TextArea {

	@Override
	public String getText() {
		return "리눅스 TextArea";
	}

}

class MacButton implements Button {

	@Override
	public void click() {
		System.out.println("맥 클릭");
	}

}

class MacGuiFac implements GUIFac {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public TextArea createTextArea() {
		return new MacTextArea();
	}

}

class MacTextArea implements TextArea {

	@Override
	public String getText() {
		return "맥 TextArea";
	}

}

class WinButton implements Button {

	@Override
	public void click() {
		System.out.println("윈도우 클릭");
	}

}

class WinGuiFac implements GUIFac {

	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public TextArea createTextArea() {
		return new WinTextArea();
	}

}

class WinTextArea implements TextArea {

	@Override
	public String getText() {
		return "윈도우 TextArea";
	}

}
