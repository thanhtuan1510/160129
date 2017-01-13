import java.awt.*;
import javax.swing.*;


public class TestField  {
	public static void main(String[] args) {
		TestFieldMan man = new TestFieldMan();

		
	}
	
}
class TestFieldMan {
	//data
	JFrame frame;
	JButton button;
	JTextField fileName;
	JPanel fieldPanel;

	//method
	public TestFieldMan(){
		//make frame
		frame = new JFrame("TestField");
		frame.setLocation(400,400);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//BUTTTON,FIELD, PANEL
		button = new JButton("click here");
		fileName = new JTextField("hello", 20);
		fieldPanel = new JPanel();
		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));


		fieldPanel.add(fileName);	
		fieldPanel.add(button);	
		con.add(fieldPanel);
		frame.setVisible(true);		




	}
}