package section4;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URI;

import javax.swing.JOptionPane;

//import org.teachingextensions.logo.ImageBackground;
//import org.teachingextensions.logo.Paintable;
//import org.teachingextensions.logo.robot;
import org.jointheleague.graphical.robot.Robot;

public class RobotTreasureHunt implements KeyEventDispatcher{

	// 1. Create a new mini robot (type "mini" inside the parentheses)
	Robot meiko = new Robot("mini");
	
	private void goUp() throws InterruptedException {
		// 2. Make the robot move up the screen (use setAngle(angle) and microMove(distance))
		meiko.setAngle(0);
		meiko.microMove(10);
		
	}

	private void goDown() throws InterruptedException{
		// 3. make the robot move down the screen (use setAngle(angle) and microMove(distance))
		meiko.setAngle(180);
		meiko.microMove(10);
	}

	private void turnLeft() throws InterruptedException{
		// 4. Make the robot turn to the left (use setAngle(angle) and microMove(distance))
		meiko.setAngle(270);
		meiko.microMove(10);

	}

	private void turnRight() throws InterruptedException{
		// 5. make the robot turn to the right (use setAngle(angle) and microMove(distance))
		meiko.setAngle(90);
		meiko.microMove(10);
		
	}

	private void spaceBarWasPressed() {

		// 5. Change ROBOTNAME below to match the name of the robot you created in step 1.  THEN, remove the slashes at the beginning of the next two lines
		int robotXLocation = meiko.getX();
		int robotYLocation = meiko.getY();
		
		// 6. Print the robotXLocation and robotYLocation variables to the console 
		System.out.println(robotXLocation);
		System.out.println(robotYLocation);
		
		// 7. If robot is at same location as the little girl
		//      --make a pop-up tell the robot where to go next
		if (robotXLocation == 720 && robotYLocation == 440) {
		JOptionPane.showMessageDialog(null, "Hey! I don't know where the treasure is, but I think the boy does!");
		}
		// 8. Give the user subsequent clues at different locations on the image
	//little boy
		if (robotXLocation == 200 && robotYLocation == 420) {
		JOptionPane.showMessageDialog(null, "Treasure? I think I saw something in the eye of the skull!");
		}
	//skull
		if (robotXLocation == 210 && robotYLocation == 70) {
		JOptionPane.showMessageDialog(null, "Ugh, doesn't it say to keep out? You want a clue, fine! I heard the parrots chattering about treasure.");
	}
	//parrots
		if (robotXLocation == 620 && robotYLocation == 140) {
			JOptionPane.showMessageDialog(null, "Treasure?? Hehe, we've hid it where you'll never find it! But maybe go ask the skull again! \nI'm sure he could help you SNIFF out some clues!");
		}
		if (robotXLocation == 180 && robotYLocation == 240) {
			JOptionPane.showMessageDialog(null, "KEEP OUT!");
		}
		if (robotXLocation == 310 && robotYLocation == 210) {
			JOptionPane.showMessageDialog(null, "KEEP OUT!");
		}
		if (robotXLocation == 830 && robotYLocation == 290) {
			JOptionPane.showMessageDialog(null, "KEEP OUT!");
		}
		// 9.  If the robot is in the final location
		//     --call the treasureFound() method
		if (robotXLocation == 250 && robotYLocation == 120) {
			treasureFound();
		}
	}
	private void go() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		Robot.setWindowImage("section4/treasure_hunt.jpg");
	
		JOptionPane.showMessageDialog(null, "Ask the girl for help with your quest. Press the space bar to ask.");

	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				try {
					turnRight();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			else if (e.getKeyCode() == KeyEvent.VK_LEFT)
				try {
					turnLeft();
				} catch (InterruptedException e2) {
					e2.printStackTrace();
				}
			else if (e.getKeyCode() == 38)
				try {
					goUp();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
				try {
					goDown();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			else if (e.getKeyCode() == KeyEvent.VK_SPACE)
				spaceBarWasPressed();
		}
		return false;
	}
	
	static void treasureFound() {
		try {
			URI uri = new URI("https://www.youtube.com/watch?v=G0aIg4N6aro");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static void main (String[] args) throws MalformedURLException {
		new RobotTreasureHunt().go();
	}
}
