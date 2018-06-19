package section2;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot megurine = new Robot();

	
	void go() {

		// 6. Make the robot go as fast as possible
		megurine.setSpeed(10);
		megurine.penDown();
		// 4. make a variable to hold the length of the triangle and set it to 50
		int l = 50;
		// 7. Use a for loop to repeat steps #9 to #10, 60 times
		for (int w = 0; w < 60; w++) {
			// 9. Change the color of the pen to a random color
		megurine.setRandomPenColor();
			// 8. Increase the length variable by 10
		l += 10;
			// 5. call your drawTriangle() method using your length variable
		drawTriangle(l);
			// 10. Turn the robot 6 degrees to the right
		megurine.turn(6);
		}

	}

	/* 2. fill in the method below to draw a triangle. Use the length variable when you call move(). */
	private void drawTriangle(int l) {
		for (int t = 0; t < 3; t++) {
		megurine.move(l);
		megurine.turn(120);
		}
		
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
