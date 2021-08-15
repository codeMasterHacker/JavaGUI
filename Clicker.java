import javax.swing.*;
import java.awt.*;

public class Clicker extends JFrame
{
    private JPanel mainPanel;
    private LButtons leftPanel;
    private RStore rightPanel;

    public Clicker()
    {
        leftPanel = new LButtons();
        rightPanel = new RStore(leftPanel);
        
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1, 2));
        mainPanel.add(leftPanel);
        mainPanel.add(rightPanel);

        setTitle("Clicker Game");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        new Clicker();
    }
}