import java.awt.*;
import javax.swing.*;


public class TestButton  {
	public static void main(String[] args) {
		TestButtonMan tbm = new TestButtonMan();

	}
	
}
class TestButtonMan{
	//DATA
	JFrame frame;
	JButton button;

	public TestButtonMan(){
		//make frame
		frame = new JFrame("TestButton");
		frame.setLocation(400,400);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//make button

		button = new JButton("Click Me!");

		
		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(button);

		// frame
		frame.setVisible(true);

	}
}