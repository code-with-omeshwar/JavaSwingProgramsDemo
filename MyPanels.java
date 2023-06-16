import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class MyPanels extends JFrame {
    MyPanels() {
        // JPanel = GUI Component that functions as a container to hold other components

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 250, 250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 250, 500, 250);

        JLabel label1 = new JLabel();
        label1.setText("Hi");
        ImageIcon image = new ImageIcon("img2.png");
        label1.setIcon(image);
        greenPanel.setLayout(new BorderLayout());
        greenPanel.add(label1);

        setDefaultCloseOperation(3);
        setSize(750, 750);
        setLayout(null);
        add(redPanel);
        add(bluePanel);
        add(greenPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyPanels();
    }
}
