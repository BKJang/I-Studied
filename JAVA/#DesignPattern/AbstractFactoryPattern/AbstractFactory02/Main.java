package AbstractFactory02;

import Linux02.LinuxGuiFac;
import Mac02.MacGuiFac;
import Windows02.WinGuiFac;

public class Main {
	public static void main(String[] args) {
		
		GUIFac fac = new LinuxGuiFac();
		Button button = fac.createButton();
		TextArea text = fac.createTextArea();
		
		GUIFac fac02 = new MacGuiFac();
		Button button02 = fac02.createButton();
		TextArea text02 = fac02.createTextArea();
		
		GUIFac fac03 = new WinGuiFac();
		Button button03 = fac03.createButton();
		TextArea text03 = fac03.createTextArea();
		
		
		button.click();
		System.out.println(text.getText());
		button02.click();
		System.out.println(text02.getText());
		button03.click();
		System.out.println(text03.getText());
		
	}
}
