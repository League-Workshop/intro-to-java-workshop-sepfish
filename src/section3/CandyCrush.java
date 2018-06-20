package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String hmm = JOptionPane.showInputDialog("Who don't you like?");

		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "Nah, you totally have a crush on " + hmm + "!");
		// 3. Ask the user for the name of their best friend
		String yeet = JOptionPane.showInputDialog("So who's your best friend?");

		// 4. Tell them their best friend is as sweet as candy
		JOptionPane.showMessageDialog(null, "Whoever " + yeet + " is, they're sweet as candy!");

	} 
}



