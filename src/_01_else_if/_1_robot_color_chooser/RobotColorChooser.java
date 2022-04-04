
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		Robot rob = new Robot(); 
		String color = JOptionPane.showInputDialog("What color pen would you like the robot to draw with?");
		if (color.equals("red")){
			rob.setPenColor(Color.RED);
		}else if(color.equals("orange")) {
			rob.setPenColor(Color.ORANGE);
		}else if(color.equals("yellow")) {
			rob.setPenColor(Color.YELLOW);
		}else if(color.equals("blue")) {
			rob.setPenColor(Color.BLUE);
		}else if(color.equals("green")) {
			rob.setPenColor(Color.GREEN);
		}else if(color.equals("pink")){
			rob.setPenColor(Color.PINK);
		}else {
			rob.setRandomPenColor();
		}
		rob.penDown();
		rob.setPenWidth(10);
		rob.setSpeed(10);
		for (int i = 0; i < 4; i++){
		rob.move(200);
		rob.turn(90);
		}
		
		
		
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
