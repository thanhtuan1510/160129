import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


public class PPAP {
	public static void main(String[] args) {
		PPAPMan man = new PPAPMan();
	}
}


class PPAPMan {
	// data
	JFrame frame;				
	JButton buttonSave;			
	JButton buttonNext;
	JPanel buttonPanel;			
	JLabel word1;			
	JLabel word2;
	JPanel wordPanel;		
	JTextArea memo;			
	JScrollPane memoPane;		

	// method
	public PPAPMan() {
		
		frame = new JFrame("PPAP");
		frame.setLocation(400, 400);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
		buttonSave = new JButton("Save");
		buttonNext = new JButton("Next");

		word1 = new JLabel("HAPPY NEW YEAR OF THE ROOSTER 2017");
		word2 = new JLabel("謹賀新年//酉年");

		memo = new JTextArea(5, 20);


		
		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(3, 1));	
		buttonPanel = new JPanel();				
		wordPanel = new JPanel();				
		memoPane = new JScrollPane(memo);		

		//   のせる
		buttonPanel.add(buttonSave);
		buttonPanel.add(buttonNext);
		wordPanel.add(word1);
		wordPanel.add(word2);

		con.add(buttonPanel);
		con.add(wordPanel);
		con.add(memoPane);

		
		frame.setVisible(true);
	}
}