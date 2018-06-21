package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int userScore = 0;
		JOptionPane.showMessageDialog(null, "Welcome to the SEPTIMUS HEAP QUIZ GAME!");
		// 2.  Ask the user a question 
		String question1 = JOptionPane.showInputDialog("First question! How old is Septimus in Darke?");
		
		// 3.  Use an if statement to check if their answer is correct
		if(question1.equalsIgnoreCase("14")) {
			userScore = userScore + 1;
			System.out.println(userScore);
		
		// 4.  if the user's answer is correct
			JOptionPane.showMessageDialog(null, "Your answer is correct! Next question!");
		} else {
			JOptionPane.showMessageDialog(null, "Your answer is incorrect! Next question!");
		}
		
		// -- add one to their score 
		
		
//question2
		String question2 = JOptionPane.showInputDialog("Septimus meets Boy 409's siblings in Darke. What is Boy 409's real, FULL name?");
		
		if(question2.equalsIgnoreCase("Mandy Marwick")) {
			userScore = userScore + 1;
			System.out.println(userScore);
			JOptionPane.showMessageDialog(null, "Your answer is correct! Next question!");
		} else {
			JOptionPane.showMessageDialog(null, "Your answer is incorrect! Next question!");
		}

//question3
		String question3 = JOptionPane.showInputDialog("Boy 409, or Mandy Marwick (though he hates being called Mandy), spends time with Aunt Zelda in order to become a what?");
		if(question3.equalsIgnoreCase("White Witch")) {
			userScore = userScore + 1;
			System.out.println(userScore);
			JOptionPane.showMessageDialog(null, "Your answer is correct! Next question!");
		} else {
			JOptionPane.showMessageDialog(null, "Your answer is incorrect! Next question!");
		}
		
//question4
		String question4 = JOptionPane.showInputDialog("Aunt Zelda is whose actual aunt? (Full name, please!)");
		if(question4.equalsIgnoreCase("Silas Heap")) {
			userScore = userScore + 1;
			System.out.println(userScore);
			JOptionPane.showMessageDialog(null, "Your answer is correct! Next question!");
		} else {
			JOptionPane.showMessageDialog(null, "Your answer is incorrect! Next question!");
		}
		
//question5
		String question5 = JOptionPane.showInputDialog("Silas Heap has one heck of a family. How many kids does he have, including Jenna?");
		if(question5.equalsIgnoreCase("8")) {
			userScore = userScore + 1;
			System.out.println(userScore);
			JOptionPane.showMessageDialog(null, "Your answer is correct! Next question!");
		} else {
			JOptionPane.showMessageDialog(null, "Your answer is incorrect! Next question!");
		}
		
//question6
		String question6 = JOptionPane.showInputDialog("Speaking of Silas's kids, what are their names, in ALPHABETICAL ORDER? (Jo-jo's name is hyphenated!)");
		if(question6.equalsIgnoreCase("Edd, Erik, Jenna, Jo-jo, Nicko, Sam, Septimus, Simon")) {
			userScore = userScore + 1;
			System.out.println(userScore);
			JOptionPane.showMessageDialog(null, "Your answer is correct!");
		} else {
			JOptionPane.showMessageDialog(null, "Your answer is incorrect!");
		}
		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "Alright, here's your score: \nYou got " + userScore + " questions out of 6 right!");
		if (userScore == 6) {
			JOptionPane.showMessageDialog(null, "You really know your Magyk!");
		}
	}
}
