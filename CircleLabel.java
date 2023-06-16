import java.awt.*;
import javax.swing.*;

public class CircleLabel extends JLabel {
    // draw circle on the label
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setStroke(new BasicStroke(5));
        g2D.setColor(Color.BLUE);
        g2D.fillOval(50, 50, 50, 50);
    }

    CircleLabel() {
        setBounds(50, 50, 200, 200);
        setOpaque(true);
        setBackground(Color.WHITE);
    }
}