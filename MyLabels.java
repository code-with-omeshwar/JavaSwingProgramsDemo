import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

public class MyLabels extends JFrame {
    MyLabels() {
        // Label is a GUI display area for a string of text, an image or both
        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        ImageIcon image = new ImageIcon("img1.png");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);// set text LEFT, CENTRE, RIGHT of image icon
        label.setVerticalTextPosition(JLabel.TOP);// set text TOP,CENTRE,BOTTOM of image icon
        label.setForeground(new Color(123, 50, 250));// set foreground color/font color of image
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));// set font of text
        label.setIconTextGap(20);// set gap of text to image
        label.setBackground(Color.BLACK);// set backgroung color
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(100, 100, 250, 250);

        setDefaultCloseOperation(3);
        // setSize(420, 420);
        // setLayout(null);
        setVisible(true);
        add(label);
        pack();
    }

    public static void main(String[] args) {
        new MyLabels();
    }
}
