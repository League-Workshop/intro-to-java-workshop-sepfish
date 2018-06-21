package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		Random rand = new Random();
		int n = rand.nextInt(4) + 0;
	// 3. Print out this variable
		System.out.println(n);
	// 4. Get the user to enter something that they think is awesome
		String yeet = JOptionPane.showInputDialog("What do you think is awesome?");
	// 5. If the random number is 0
		if(n == 0) {
	// -- tell the user whatever they entered is awesome!
		JOptionPane.showMessageDialog(null, "In my opinon, " + yeet + " is TRULY awesome!");
		}
	// 6. If the random number is 1
		if (n == 1) {
	// -- tell the user whatever they entered is ok.
		JOptionPane.showMessageDialog(null, "In my opinon, " + yeet + " is... ok.");
		}
	// 7. If the random number is 2
		if (n == 2) {
	// -- tell the user whatever they entered is boring.
		JOptionPane.showMessageDialog(null, "In my opinon, " + yeet + " is boring.");
		}
	// 8. If the random number is 3
		if (n == 3) {
	// -- write your own answer
		JOptionPane.showMessageDialog(null, "In my humble opinon, " + yeet + " is a RIP GAN.");
		}
}
}


