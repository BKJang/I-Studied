package Linux02;

import AbstractFactory02.Button;
import AbstractFactory02.GUIFac;
import AbstractFactory02.TextArea;

public class LinuxGuiFac implements GUIFac{

	@Override
	public Button createButton() {
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		return new LinuxTextArea();
	}

}
