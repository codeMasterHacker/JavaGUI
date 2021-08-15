import javax.swing.*;
import java.awt.*;

public class L10_1_Exercises extends JFrame
{
    public L10_1_Exercises() 
    {
        JPanel blackPanel1 = new JPanel();
        blackPanel1.setBackground(Color.black);

        JPanel blackPanel2 = new JPanel();
        blackPanel2.setBackground(Color.black);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);

        JPanel colorsPanel = new JPanel();
        colorsPanel.setLayout(new GridLayout(2, 3));
        colorsPanel.add(blackPanel1);
        colorsPanel.add(bluePanel);
        colorsPanel.add(redPanel);
        colorsPanel.add(new JPanel());
        colorsPanel.add(blackPanel2);
        colorsPanel.add(new JPanel());
        colorsPanel.setBounds(75, 0, 300, 300);

        setTitle("A Window");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        add(colorsPanel);
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        new L10_1_Exercises();
    }
}
