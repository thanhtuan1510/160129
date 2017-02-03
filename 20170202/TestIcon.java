import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class TestIcon {
    public static void main(String[] args) {
    IconMan icon = new IconMan();


    }
}

class IconMan
{
    JFrame frame;
    JLabel inputImg;
    String[] images = {"rooster1.jpg","rooster2.jpg"};
    int idx = 0;

    public IconMan()
    {
        frame = new JFrame("Picture Change");
        frame.setLocation(400, 400);
        frame.setSize(1920,1280);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();

        inputImg = new JLabel();
        inputImg.setIcon(new ImageIcon("rooster1.jpg"));
        inputImg.setPreferredSize( new Dimension( 1280, 1024 ) );
        JButton btnChange = new JButton("CHANGE");

        ActionListener saveActionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("HELLO ROOSTER");
                idx++;
                if (idx >= images.length) {
                    idx = 0;
                }
                String name = images[idx];
                inputImg.setIcon(new ImageIcon(name));
            }
        };

        btnChange.addActionListener(saveActionListener);

        panel.add(inputImg);
        panel.add(btnChange);

        Container con = frame.getContentPane();
        con.setLayout(new GridLayout(1, 2));
        con.add(panel);
        frame.setVisible(true);
    }
}

