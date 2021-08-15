import javax.swing.*;
import java.awt.*;

public class L9_1 extends JFrame
{
    public L9_1() 
    {
        ImageIcon image = new ImageIcon("smiley.png");

        JLabel label = new JLabel();
        label.setText("This is a smiley face image");
        label.setForeground(Color.cyan);
        label.setHorizontalTextPosition(JLabel.CENTER); // set LEFT, CENTER, RIGHT
        label.setVerticalTextPosition(JLabel.TOP); // set TOP, CENTER, BOTTOM
        label.setIcon(image);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        setTitle("A Window");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.red);
        add(label);
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        new L9_1();
    }
}
