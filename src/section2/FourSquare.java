package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	/* 3. Fill in the code to draw a square inside the method below. */
	static void drawSquare(Robot gumi) {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		for (int i = 0; i < 4; i++) {
			gumi.move(100);
			gumi.turn(90);
		}
		
	}

	public static void main(String[] args) {
		// 2. Create a new Robot

		Robot gumi = new Robot();

			// 4. Make the robot move as fast as possible
			gumi.setSpeed(1000);

			// 5. Set the pen width to 5
			gumi.setPenWidth(5);
			gumi.penDown();

			// 6. Use a for loop to repeat steps #7 to #8, four times...
			for (int j = 0; j < 4; j++) {
				

				// 7. Set the pen color to random
			gumi.setRandomPenColor();
		
				// 1. Call the drawSquare() method
			drawSquare(gumi);
		
				// 8. Turn the robot 90 degrees to the right
			gumi.turn(90);
		}

}
}



