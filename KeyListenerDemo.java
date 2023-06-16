import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyListenerDemo extends JFrame implements KeyListener {
    JLabel label;

    KeyListenerDemo() {
        setDefaultCloseOperation(3);
        setSize(500, 500);
        setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.RED);
        label.setOpaque(true);

        addKeyListener(this);

        add(label);
        setVisible(true);

    }

    public static void main(String[] args) {
        new KeyListenerDemo();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // keyTyped = Invoked when a key is typed. Uses KeyChar, char output
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int
        // output
        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 39:
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 40:
                label.setLocation(label.getX(), label.getY() + 10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // keyReleased = Invoked when a physical key is released. Uses KeyCode, int
        // output
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());

    }
}
