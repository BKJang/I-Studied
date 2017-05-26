package Mac02;

import AbstractFactory02.Button;
import AbstractFactory02.GUIFac;
import AbstractFactory02.TextArea;

public class MacGuiFac implements GUIFac {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public TextArea createTextArea() {
		return new MacTextArea();
	}

}
