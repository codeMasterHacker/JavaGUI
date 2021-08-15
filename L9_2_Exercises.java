import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class L9_2_Exercises extends JFrame implements ActionListener 
{
    private JButton fragileButton, trueButton, falseButton;

    public L9_2_Exercises() 
    {
		fragileButton = new JButton("Fragile");
		fragileButton.setBounds(125, 50, 250, 125);
		fragileButton.addActionListener(this);

        trueButton = new JButton("True");
		trueButton.setBounds(125, 175, 250, 125);
		trueButton.addActionListener(this);

        falseButton = new JButton("False");
		falseButton.setBounds(125, 300, 250, 125);
		falseButton.addActionListener(this);

        setTitle("A Window With 3 Buttons");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.red);
        setLayout(null);
        add(fragileButton);
        add(trueButton);
        add(falseButton);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == fragileButton)
        {
            System.out.println("ouch!!");
        }

        if(e.getSource() == trueButton)
        {
            System.out.println(true);
        }

        if(e.getSource() == falseButton)
        {
            System.out.println(false);
        }
    }

    public static void main(String[] args) 
    {
        new L9_2_Exercises();
    }
}
