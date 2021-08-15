import javax.swing.*;
import java.awt.*;

public class ColorButton extends JButton
{
    private Color color;

    public ColorButton(Color color, String buttonName)
    {
        super(buttonName);
        this.color = color;
        setBackground(this.color);
        setForeground(this.color);
        setOpaque(true);
    }

    public Color getColor() { return color; }
}
