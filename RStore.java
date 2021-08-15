import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class RStore extends JPanel implements ActionListener
{
    private LButtons leftPanel;
    private JButton buyButton;
    private JButton randomButton;
    private JButton luckyRandomButton;
    
    public RStore(LButtons leftPanel)
    {
        this.leftPanel = leftPanel;
    
        buyButton = new JButton("Upgrade Button: $" + 10*leftPanel.getIncrement());
        buyButton.addActionListener(this);
    
        randomButton = new JButton("Random Effect: $" + 15 * leftPanel.getIncrement());
        randomButton.addActionListener(this);
    
        luckyRandomButton = new JButton("Lucky Random Effect: $" + 30 * leftPanel.getIncrement());
        luckyRandomButton.addActionListener(this);
    
        setBackground(Color.blue);
        setLayout(new GridLayout(3, 1));
        add(buyButton);
        add(randomButton);
        add(luckyRandomButton);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) 
    {
        Random rand = new Random();

        if(arg0.getSource() == buyButton)
        {
            leftPanel.upgradeButton();
            buyButton.setText("Upgrade Button: $" + 10*leftPanel.getIncrement());
            randomButton.setText("Random Effect: $" + 15 * leftPanel.getIncrement());
            luckyRandomButton.setText("Lucky Random Effect: $" + 30 * leftPanel.getIncrement());
        }
        
        if(arg0.getSource() == randomButton)
        {
            switch (rand.nextInt(3)) 
            {
                case 0: leftPanel.updateCount(-50, 15 * leftPanel.getIncrement()); break;
                case 1: leftPanel.updateCount(-(leftPanel.getIncrement() * 7), 15 * leftPanel.getIncrement()); break;
                case 2: leftPanel.updateCount((leftPanel.getIncrement() * 3), 15 * leftPanel.getIncrement()); break;
                default: break;
            }
        }

        if(arg0.getSource() == luckyRandomButton)
        {
            switch (rand.nextInt(3)) 
            {
                case 0: leftPanel.updateCount(20, 30 * leftPanel.getIncrement()); break;
                case 1: leftPanel.updateCount(-(leftPanel.getIncrement() * 3), 30 * leftPanel.getIncrement()); break;
                case 2: leftPanel.updateCount((leftPanel.getIncrement() * 7), 30 * leftPanel.getIncrement());; break;
                default: break;
            }
        }
    }
}
