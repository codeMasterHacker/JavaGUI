import java.awt.*;
import javax.swing.*;
import java.util.*;

public class ColorPanel extends JPanel
{
    private Color color;

    public ColorPanel()
    {
        update();
    } 

    private Color randColor()
    {
        Color[] colors = {Color.red, Color.blue, Color.green, Color.cyan, Color.yellow, Color.magenta};
        Random rand = new Random();
        return colors[rand.nextInt(colors.length)];
    }

    public void update()
    {
        color = randColor();
        setBackground(color);
    }

    public Color getColor() { return color; }
}