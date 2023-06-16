import java.awt.*;
import javax.swing.*;

public class GraphicsDemo extends JFrame {
    GraphicsDemo() {
        setDefaultCloseOperation(3);
        setSize(500, 500);

        setLayout(null);
        setVisible(true);
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.setStroke(new BasicStroke(5));
        g2D.setColor(Color.BLUE);
        g2D.fillOval(50, 50, 100, 100);
    }

    public static void main(String[] args) {
        new GraphicsDemo();
    }
}
