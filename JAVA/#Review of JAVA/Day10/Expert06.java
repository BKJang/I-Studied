import java.awt.Frame;
import javax.swing.JOptionPane;
public class Expert06 {
	public static void main(String[] args) {
		// �⺻��������===> Stringȭ ���ѾߵǴ� ��Ȳ
		for (int i = 1; i <= 3; i++) {
			Frame f = new Frame(Integer.toString(i));
			f.setVisible(true);
		}
		// String ==> �⺻ȭ
		String m = JOptionPane.showInputDialog("����?");
		if(Integer.parseInt(m) > 19) {
			
		}else {
			
		}
	}
}


