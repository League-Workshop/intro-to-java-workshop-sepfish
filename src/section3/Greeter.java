package section3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Who art thou?");
		JOptionPane.showMessageDialog(null, "Good day, " + name);
	}

}
