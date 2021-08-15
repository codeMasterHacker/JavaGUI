import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonPanel extends JPanel implements ActionListener 
{
    private ColorButton red, blue, green, magenta, cyan, yellow;
    private ColorPanel colorPanel;
    private JLabel scoreLabel;
    private int points;

    public ButtonPanel(ColorPanel colorPanel)
    {
        points = 0;
        setBackground(Color.darkGray);
        setLayout(new GridLayout(3, 2));
        this.colorPanel = colorPanel;

        red = new ColorButton(Color.red, "red");
        red.addActionListener(this);

        blue = new ColorButton(Color.blue, "blue");
        blue.addActionListener(this);

        green = new ColorButton(Color.green, "green");
        green.addActionListener(this);

        magenta = new ColorButton(Color.magenta, "magenta");
        magenta.addActionListener(this);

        cyan = new ColorButton(Color.cyan, "cyan");
        cyan.addActionListener(this);

        yellow = new ColorButton(Color.yellow, "yellow");
        yellow.addActionListener(this);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(3, 2));
        buttonsPanel.add(red);
        buttonsPanel.add(blue);
        buttonsPanel.add(green);
        buttonsPanel.add(magenta);
        buttonsPanel.add(cyan);
        buttonsPanel.add(yellow);

        scoreLabel = new JLabel("Points: " + points);

        JPanel scorePanel = new JPanel();
        scorePanel.add(scoreLabel);

        setLayout(new BorderLayout());
        add(scorePanel, BorderLayout.NORTH);
        add(buttonsPanel, BorderLayout.CENTER);
    }

    private void checkAns(ColorButton button)
    {
        if(colorPanel.getColor() == button.getColor())
        {
            points++;
            scoreLabel.setText("Correct! Points: " + points);
        }
        else
        {
            points = (points > 0) ? points - 1 : points;
            scoreLabel.setText("Incorrect! Points: " + points);
        }

        colorPanel.update();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() != null)
        {
            checkAns((ColorButton)e.getSource());
        } 

    }
}
