import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class L9_Project extends JFrame implements ActionListener 
{
    private JButton plus1Button, minus1Button, plus10Button, minus10Button;
    private int n = 0;

    public L9_Project() 
    {
		plus1Button = new JButton();
		plus1Button.setBounds(200, 200, 50, 50);
		plus1Button.addActionListener(this);
		plus1Button.setText("+1");

        minus1Button = new JButton();
		minus1Button.setBounds(200, 250, 50, 50);
		minus1Button.addActionListener(this);
		minus1Button.setText("-1");

        plus10Button = new JButton();
		plus10Button.setBounds(250, 200, 50, 50);
		plus10Button.addActionListener(this);
		plus10Button.setText("+10");

        minus10Button = new JButton();
		minus10Button.setBounds(250, 250, 50, 50);
		minus10Button.addActionListener(this);
		minus10Button.setText("-10");

        setTitle("Bulk Buy and Sell");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.red);
        setLayout(null);
        add(plus1Button);
        add(minus1Button);
        add(plus10Button);
        add(minus10Button);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == plus1Button)
        {
            n++;
        }

        if(e.getSource() == minus1Button)
        {
            n--;
        }

        if(e.getSource() == plus10Button)
        {
            n += 10;
        }

        if(e.getSource() == minus10Button)
        {
            n -= 10;
        }

        System.out.println(n);
    }

    public static void main(String[] args) 
    {
        new L9_Project();
    }
}
