import javax.swing.*;
import java.awt.*;

public class L9_1_Exercises extends JFrame
{
    public L9_1_Exercises() 
    {
        // // 1.
        // getContentPane().setBackground(new Color(155, 0, 255));
        // JLabel label = new JLabel();
        // label.setText("Bottom Text");
        // label.setFont(new Font("Dialog", Font.PLAIN, 24));
        // label.setForeground(Color.green);
        // label.setHorizontalTextPosition(JLabel.CENTER); // set LEFT, CENTER, RIGHT
        // label.setVerticalTextPosition(JLabel.CENTER); // set TOP, CENTER, BOTTOM
        // label.setHorizontalAlignment(JLabel.CENTER);
        // label.setVerticalAlignment(JLabel.BOTTOM);
        // // 1.

        // // 2.
        // getContentPane().setBackground(Color.blue);
        // JLabel label = new JLabel();
        // label.setText("llllllllll");
        // label.setFont(new Font("Dialog", Font.BOLD, 48));
        // label.setForeground(Color.black);
        // label.setHorizontalTextPosition(JLabel.CENTER); // set LEFT, CENTER, RIGHT
        // label.setVerticalTextPosition(JLabel.CENTER); // set TOP, CENTER, BOTTOM
        // label.setHorizontalAlignment(JLabel.CENTER);
        // label.setVerticalAlignment(JLabel.CENTER);
        // // 2.

        // 3.
        getContentPane().setBackground(new Color(220, 0, 200));
        JLabel label = new JLabel();
        label.setText("hi");
        label.setFont(new Font("Dialog", Font.PLAIN, 12));
        label.setForeground(Color.black);
        label.setHorizontalTextPosition(JLabel.RIGHT); // set LEFT, CENTER, RIGHT
        label.setVerticalTextPosition(JLabel.TOP); // set TOP, CENTER, BOTTOM
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setVerticalAlignment(JLabel.TOP);
        // 3.

        setTitle("A Window");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(label);
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        new L9_1_Exercises();
    }
}
