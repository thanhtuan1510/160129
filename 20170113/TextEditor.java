import java.awt.*;
		import java.awt.event.*;
		import javax.swing.*;
		import java.io.*;

		public class TextEditor {
			public static void main(String[] args) {
				TextEditorMan man = new TextEditorMan();
			}
		}


		class TextEditorMan {
			//data
			JFrame frame;				
			//method

			
			public TextEditorMan() {
				// コンストラクタ(constructor)
				// make frame
				frame = new JFrame("TextEditor");
				frame.setLocation(400, 400);
				frame.setSize(500, 500);		
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				// frame
				frame.setVisible(true);
			}
		}