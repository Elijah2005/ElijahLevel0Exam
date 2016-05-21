/* Level 0 Exam: Coding  Exercise #1 */
import java.awt.Color;

import javax.swing.JOptionPane;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;


public class CodingExercise1
{
	public static void main(String[] args)
	{
		// 3. ask the user what color they would like the tortoise to draw
		
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		
		// 2. set the pen width to 10
		
		// 1. make the tortoise draw a shape
		JOptionPane.showInputDialog("What color do you want me to draw");
		
			
		
		Tortoise.penDown();
		Tortoise.setPenColor(Color.RED);
		Tortoise.setPenWidth(100);
		Tortoise.setSpeed(10);
		Tortoise.move(40);
Tortoise.turn(90);
Tortoise.move(40);
Tortoise.turn(90);
Tortoise.move(40);
Tortoise.turn(90);
Tortoise.move(40);
	}
}
