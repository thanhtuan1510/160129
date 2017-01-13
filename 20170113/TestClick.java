import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestClick {
	public static void main(String[] args) {
		TestClickMan man = new TestClickMan();
	}
}


class TestClickMan {
	//data
	JFrame frame;
	JButton button;
	JTextField fileName;
	JPanel fieldPanel;

	//method
	public TestClickMan(){
		frame = new JFrame("TestClick");
		frame.setLocation(400,400);
		frame.setSize (500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		//BUTTON, FIELD, PANEL

		button = new JButton("Click Here!");		
		button.addActionListener(this);			
		fileName = new JTextField("ALOHA", 20); 
		fieldPanel = new JPanel();

		fieldPanel.add(fileName);	
		fieldPanel.add(button);		
		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(fieldPanel);		

		//up load
		frame.setVisible(true);				

	}

	
	public void actionPerformed(ActionEvent ae) {
		
		fileName.setText("HELLO");
	}
} 
