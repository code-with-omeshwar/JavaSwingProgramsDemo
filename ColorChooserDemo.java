import javax.swing.*;
import java.awt.*;

public class ColorChooserDemo extends JFrame {
    ColorChooserDemo() {
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());

        JButton button = new JButton("Select Color");
        JLabel label = new JLabel();
        label.setText("This is some TEXT!!");
        label.setFont(new Font("MV Boli", Font.PLAIN, 50));
        label.setBackground(Color.WHITE);
        label.setOpaque(true);

        button.addActionListener(
                e -> {
                    // JColorChooser colorChooser = new JColorChooser();
                    Color color = JColorChooser.showDialog(null, "Pick your color", Color.BLACK);
                    label.setForeground(color);
                });

        add(button);
        add(label);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorChooserDemo();
    }
}
