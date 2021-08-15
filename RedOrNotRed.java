import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RedOrNotRed extends JFrame implements ActionListener
{
    private JButton redButton, notRedButton;
    private ColorPanel colorPanel;
    private int points;

    public RedOrNotRed()
    {
        points = 0;

        colorPanel = new ColorPanel();
        redButton = new JButton("Red");
        redButton.addActionListener(this);
        notRedButton = new JButton("Not Red");
        notRedButton.addActionListener(this);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.add(redButton);
        buttonsPanel.add(notRedButton);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(colorPanel, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

        setTitle("Red Or Not Red Game");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(mainPanel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == redButton)
        {
            if (colorPanel.getColor() == Color.red)
            {
                points++;
                JOptionPane.showMessageDialog(null, "Correct! Points: " + points);
            }
            else
            {
                points = (points > 0) ? points - 1 : points;
                JOptionPane.showMessageDialog(null, "Incorrect! Points: " + points);
            }
        }

        if(e.getSource() == notRedButton)
        {
            if (colorPanel.getColor() != Color.red)
            {
                points++;
                JOptionPane.showMessageDialog(null, "Correct! Points: " + points);
            }
            else
            {
                points = (points > 0) ? points - 1 : points;
                JOptionPane.showMessageDialog(null, "Incorrect! Points: " + points);
            }
        }

        colorPanel.update();
    }

    public static void main(String[] args)
    {
        new RedOrNotRed();
    }
}