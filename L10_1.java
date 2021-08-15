import javax.swing.*;
import java.awt.*;

public class L10_1 extends JFrame
{
    public L10_1() 
    {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.gray);
        buttonPanel.add(new JButton("Button 1 (PAGE_START)"));

        JPanel labelPanel = new JPanel();
        labelPanel.setBackground(Color.darkGray);
        labelPanel.add(new JLabel("ya yeet"));

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.black);
        // mainPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        // mainPanel.add(buttonPanel);
        // mainPanel.add(labelPanel);
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(buttonPanel, BorderLayout.EAST);
        mainPanel.add(labelPanel, BorderLayout.WEST);
        // mainPanel.setLayout(new GridLayout(2, 1));
        // mainPanel.add(buttonPanel);
        // mainPanel.add(labelPanel);

        setTitle("A Window");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.red);
        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        new L10_1();
    }
}
