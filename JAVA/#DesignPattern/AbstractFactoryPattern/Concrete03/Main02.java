package Concrete03;

import AbstractFactory02.Button;
import AbstractFactory02.GUIFac;
import AbstractFactory02.TextArea;

public class Main02 {
	public static void main(String[] args) {
		
		GUIFac fac = FactoryInstance.getGuiFac();
		
		Button button = fac.createButton();
		TextArea text = fac.createTextArea();
		
		button.click();
		System.out.println(text.getText());
	}
}
