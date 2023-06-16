import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyFrameCircle extends JFrame {
    CircleLabel label;

    MyFrameCircle() {
        setDefaultCloseOperation(3);
        setSize(500, 500);
        label = new CircleLabel();
        JLabel message = new JLabel();
        message.setBounds(0, 0, 250, 50);
        message.setFont(new Font("MV Boli", Font.PLAIN, 15));
        // add mouse entered listener to the label
        label.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                message.setText("Mouse Entered");
            }

            public void mouseExited(MouseEvent evt) {
                message.setText("Mouse Exited");
            }
        });

        setLayout(null);
        add(label);
        add(message);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrameCircle();
    }
}
