
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot twix = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		String colorOfPen=JOptionPane.showInputDialog(null, "Hey! Which color do you want the robot to draw in? I can do red, blue, or yellow!");
		  if(colorOfPen.equals("blue")) {
			  
				twix.setPenColor(Color.cyan);
			        	
			        }
			        else if(colorOfPen.equals("red")) {
			            twix.setPenColor(Color.red);
			                	
			                } else if(colorOfPen.equals("yellow")) {
			                    twix.setPenColor(Color.yellow);
			                	
			                }
			                else {
			          twix.setRandomPenColor();      	
			                	
			                	
			                }
		twix.penDown();
	    twix.setSpeed(100);
	    twix.setPenWidth(10);
		twix.move(100);
		twix.turn(90);

		twix.move(100);
		twix.turn(90);
	
		twix.move(100);
		twix.turn(90);
	
		twix.move(100);
		twix.turn(90);
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		
		//5. Use an if/else statement to set the pen color that the user requested
      
	
	}
		//6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}

