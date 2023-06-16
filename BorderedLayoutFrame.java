import javax.swing.*;
import java.awt.*;

public class BorderedLayoutFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.BLUE);
        panel3.setBackground(Color.GREEN);
        panel4.setBackground(Color.YELLOW);
        panel5.setBackground(Color.PINK);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        JPanel panel6 = new JPanel();
        panel6.setBackground(Color.BLACK);
        panel6.setPreferredSize(new Dimension(50, 50));
        JPanel panel7 = new JPanel();
        panel7.setBackground(Color.ORANGE);
        panel7.setPreferredSize(new Dimension(50, 50));
        JPanel panel8 = new JPanel();
        panel8.setBackground(Color.CYAN);
        panel8.setPreferredSize(new Dimension(50, 50));
        JPanel panel9 = new JPanel();
        panel9.setBackground(Color.MAGENTA);
        panel9.setPreferredSize(new Dimension(50, 50));
        JPanel panel10 = new JPanel();
        panel10.setBackground(Color.GRAY);
        panel10.setPreferredSize(new Dimension(50, 50));

        panel3.setLayout(new BorderLayout());
        panel3.add(panel6, BorderLayout.NORTH);
        panel3.add(panel7, BorderLayout.SOUTH);
        panel3.add(panel8, BorderLayout.WEST);
        panel3.add(panel9, BorderLayout.EAST);
        panel3.add(panel10, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(3);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10, 10));
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.CENTER);
        frame.add(panel4, BorderLayout.EAST);
        frame.add(panel5, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
