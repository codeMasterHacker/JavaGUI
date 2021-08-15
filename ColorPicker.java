import javax.swing.*;
import java.awt.*;

public class ColorPicker extends JFrame
{
    public ColorPicker()
    {
        ColorPanel colorPanel = new ColorPanel();
        ButtonPanel buttonsPanel = new ButtonPanel(colorPanel);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1, 2));
        mainPanel.add(colorPanel);
        mainPanel.add(buttonsPanel);

        setTitle("Color Picker");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        new ColorPicker();
    }
}