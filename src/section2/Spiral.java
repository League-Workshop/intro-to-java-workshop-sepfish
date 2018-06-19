package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot ia = new Robot();
		// 5. Set your robot's pen down 
		ia.penDown();
		// 3. Set the robot to go at max speed (10)
		ia.setSpeed(10);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int y = 0; y < 75; y++) {
			// 7. Change the pen color to random
			ia.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
			ia.move(5*y);
			// 2. Turn the robot 360/7 degrees to the right
			ia.turn(360/7);
		
			// 8. Set the pen width to i
			ia.setPenWidth(y);
		}
			
	}
}
