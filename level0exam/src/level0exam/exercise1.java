package level0exam;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;


public class exercise1
{
	public static void main(String[] args)
	{
		// 3. ask the user what color they would like the tortoise to draw
		String color = JOptionPane.showInputDialog("What color would you like the tortoise to draw? Type 'blue' or 'red'.");
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		if (color.equals("red")) {
			Tortoise.setPenColor(Color.red);
		}
		if (color.equals("blue")) {
			Tortoise.setPenColor(Color.blue);
		}
		// 2. set the pen width to 10
		Tortoise.setPenWidth(10);
		// 1. make the tortoise draw a shape
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.penUp();
	}
}
