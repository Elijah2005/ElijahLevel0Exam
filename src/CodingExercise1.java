import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;


/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {


    public static void main(String[] args) {
   	 // 3. ask the user what color they would like the Robot to draw


   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)


   	 // 2. set the pen width to 10


   	 // 1. make the Robot draw a shape
   	 Robot E = new Robot();
   	 JOptionPane.showMessageDialog(null, "The color choices are blue and red");
   String color =	 JOptionPane.showInputDialog("What color would you like the robot to draw");
   if(color.equals("blue")){
	   E.setPenColor(Color.BLUE);
   } else if(color.equals("red")) {
	   E.setPenColor(Color.RED);
   }
   	 E.setPenWidth(10);
   	 E.setSpeed(10);
   	 for (int i = 0; i < 4; i++) {
   	 E.turn(90);
   	 E.penDown();
   	 E.move(200);
   	 }
    }


}