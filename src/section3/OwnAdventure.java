package section3;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		//variables
		String yeet1 = "A Risk";
		
		//code
		String crime = JOptionPane.showInputDialog("You're a criminal being tried for something in front of the king...");
		JOptionPane.showMessageDialog(null, "The king and his guards read the captian's report of the " + crime + ". \nMeanwhile, you're a bit bored and decide to try to escape.");
		int ans = JOptionPane.showConfirmDialog(null, "A small voice asks you if you're 100% sure about this...");
		if (ans == 1) {
			JOptionPane.showMessageDialog(null, "Well, that's too bad. It wouldn't have worked anyway, since the king sentenced you to death.");
		}else {
			JOptionPane.showMessageDialog(null, "It's settled, then. \nYou look around for a means of escape.");
			JOptionPane.showMessageDialog(null, "You loosen the bindings tied around your wrists easily. They weren't tied in the proper way.");
			JOptionPane.showMessageDialog(null, "It seems like the guards to your left and right aren't paying attention. Maybe you could take one of their weapons...");
			int weap1 = JOptionPane.showOptionDialog(null, "Who do you go for?", yeet1, 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Right", "Left", "You know what nevermind"}, null);
		if (weap1 == 0) {
			JOptionPane.showMessageDialog(null, "Unfortulately, he was watching you out of the corner of your eye and grabbed your hand before it reached his dagger. \nYou're in real trouble now.");
		}
		//PATH 1
		if (weap1 == 1) {
			JOptionPane.showMessageDialog(null, "You pull on his dagger and find you're able to slip it out of his sheath without anyone noticing. \nYou've got a weapon now.");
			JOptionPane.showMessageDialog(null, "There's a door to your left where you can try and escape, but you know that there's a loose floorboard underneath you that leads to the sewers. \nThe floorboard is more risky, but the door will cause a bigger fight.");
			int door = JOptionPane.showOptionDialog(null, "Which one do you take?", yeet1, 0, JOptionPane.INFORMATION_MESSAGE, null, new String [] {"Door", "Floorboard", "You know what nevermind"}, null);
			
			if (door == 2) {
				JOptionPane.showMessageDialog(null, "Well, that's too bad. It wouldn't have worked anyway, since the king sentenced you to death.");
			}
			//PATH 1-1
			if (door == 1) {
				JOptionPane.showMessageDialog(null, "You casually slip the tip of your boot under the floorboard until you can see the hole that lies beneath. \nYou see the king lean in to discuss something with his men, and you decide to take your chance.");
				
			}
			//PATH 1-2
			if (door == 0) {
				JOptionPane.showMessageDialog(null, "The king leans in to discuss something with his men, and you decide to take your chance.");
				JOptionPane.showMessageDialog(null, "You run as fast as you can towards the door with the dagger to shield you. The shouts of the guard follow you as you race through the (unlocked) door.");
			}
			
			
		}
		//PATH 2
		if (weap1 == 2) {
			JOptionPane.showMessageDialog(null, "You guess... it's best to keep quiet?");
			JOptionPane.showMessageDialog(null, "There's a door to your left where you can try and escape, but you know that there's a loose floorboard underneath you that leads to the sewers. \nThe floorboard is more risky, but the door will cause a bigger fight.");
			int doorAlt = JOptionPane.showOptionDialog(null, "Which one do you take?", yeet1, 0, JOptionPane.INFORMATION_MESSAGE, null, new String [] {"Door", "Floorboard", "You know what nevermind"}, null);
				
			if (doorAlt == 2) {
				JOptionPane.showMessageDialog(null, "Well, that's too bad. It wouldn't have worked anyway, since the king sentenced you to death.");
			}
			//PATH 2-1
			if (doorAlt == 1) {
				JOptionPane.showMessageDialog(null, "You casually slip the tip of your boot under the floorboard until you can see the hole that lies beneath. \nYou see the king lean in to discuss something with his men, and you decide to take your chance.");
				
			}
			//PATH 2-2
			if (doorAlt == 0) {
				JOptionPane.showMessageDialog(null, "The king leans in to discuss something with his men, and you decide to take your chance.");
				JOptionPane.showMessageDialog(null, "You run as fast as you can towards the door with the dagger to shield you. The shouts of the guard follow you as you race through the (unlocked) door.");
			}
			
			
		}
			
			
		}
	}

}
