package section2;
import org.jointheleague.graphical.robot.Robot;
	
public class RobotSquare {
		
		public static void main(String[] args) {
			
			// START HERE
			Robot megpoid = new Robot();
			megpoid.sparkle();
			megpoid.penDown();
			megpoid.setRandomPenColor();
			megpoid.setSpeed(120);
			for (int i = 0; i < 4; i++) {
			megpoid.move(100);
			megpoid.turn(90);
			}
			
}
		
}
