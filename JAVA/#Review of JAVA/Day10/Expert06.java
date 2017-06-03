import java.awt.Frame;
import javax.swing.JOptionPane;
public class Expert06 {
	public static void main(String[] args) {
		// 기본형데이터===> String화 시켜야되는 상황
		for (int i = 1; i <= 3; i++) {
			Frame f = new Frame(Integer.toString(i));
			f.setVisible(true);
		}
		// String ==> 기본화
		String m = JOptionPane.showInputDialog("나이?");
		if(Integer.parseInt(m) > 19) {
			
		}else {
			
		}
	}
}


