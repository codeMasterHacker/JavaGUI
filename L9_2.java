import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class L9_2 extends JFrame implements ActionListener 
{
    private JButton button;

    public L9_2() 
    {
        final int WINDOW_WIDTH = 500;
        final int WINDOW_HEIGHT = 500;

		button = new JButton("I'm a button!");
		button.setBounds(WINDOW_WIDTH/4, WINDOW_HEIGHT/4, 250, 125);
		button.addActionListener(this);

        setTitle("A Window With A Button");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.red);
        setLayout(null);
		add(button);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == button)
        {
            System.out.println("button pressed");
        }
    }

    public static void main(String[] args) 
    {
        new L9_2();
    }
}
