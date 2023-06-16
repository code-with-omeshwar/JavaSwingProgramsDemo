import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerDemo extends JFrame implements MouseListener {
    JLabel label;

    MouseListenerDemo() {
        setDefaultCloseOperation(3);
        setSize(500, 500);
        setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        label.addMouseListener(this);

        add(label);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseListenerDemo();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // invoked when mouse is clicked (pressed and released)
        label.setBackground(Color.GREEN);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // invoked when mouse is pressed (clicked and held)
        label.setBackground(Color.BLUE);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // invoked when mouse is released (after being pressed)
        label.setBackground(Color.RED);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // invoked when mouse enters a component
        label.setBackground(Color.BLACK);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // invoked when mouse exits a component
        label.setBackground(Color.ORANGE);
    }
}
