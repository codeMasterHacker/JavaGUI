import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LButtons extends JPanel implements ActionListener 
{
    private JButton button;    
    private JLabel scoreLabel;
    private JPanel scorePanel;
    private JLabel incrementLabel;
    private JPanel incrementPanel;
    private int count = 0;
    private int increment = 1;
    
    public LButtons()
    {
        scoreLabel = new JLabel("Clicks: 0");
        scoreLabel.setHorizontalAlignment(JLabel.CENTER);

        incrementLabel = new JLabel("Increment: 1");
        incrementLabel.setHorizontalAlignment(JLabel.CENTER);

        scorePanel = new JPanel();
        scorePanel.setBackground(Color.red);
        scorePanel.setLayout(new BorderLayout());
        scorePanel.add(scoreLabel, BorderLayout.CENTER);
    
        incrementPanel = new JPanel();
        incrementPanel.setBackground(Color.red);
        incrementPanel.setLayout(new BorderLayout());
        incrementPanel.add(incrementLabel, BorderLayout.CENTER);
        
        button = new JButton(":3");
        button.addActionListener(this);
    
        setLayout(new GridLayout(3, 1));
        add(scorePanel);
        add(incrementPanel);
        add(button);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) 
    {
        count += increment;
        scoreLabel.setText("Clicks: " + count);
    }

    public void updateCount(int n, int cost)
    {
        if(count - cost >= 0)
        {
            count += n;
            scoreLabel.setText("Clicks: " + count);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Not enough clicks to buy");
        }
    }

    public void upgradeButton()
    {
        if(count >= increment*10)
        {
            count -= increment * 10;
            increment++;
    
            incrementLabel.setText("Increment: " + increment);
            scoreLabel.setText("Clicks: " + count);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Not enough clicks to buy");
        }
    }

    public int getIncrement() { return increment; }
    
    public int getCount() { return count; }
}