import javax.swing.*;
import java.awt.*;

public class FlowLayoutFrames {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JFrame Title");
        frame.setDefaultCloseOperation(3);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10));
        frame.setSize(500, 500);

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");

        button1.setFocusable(false);
        button2.setFocusable(false);
        button3.setFocusable(false);
        button4.setFocusable(false);
        button5.setFocusable(false);
        button6.setFocusable(false);
        button7.setFocusable(false);
        button8.setFocusable(false);
        button9.setFocusable(false);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 250));
        panel.setBackground(Color.BLUE);
        panel.setLayout(new FlowLayout(FlowLayout.LEADING, 5, 10));
        frame.add(panel);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);

        frame.setVisible(true);

    }
}
