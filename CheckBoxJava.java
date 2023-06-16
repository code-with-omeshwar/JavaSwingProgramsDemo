import javax.swing.*;
import java.awt.*;

public class CheckBoxJava extends JFrame {
    public static void main(String[] args) {
        new CheckBoxJava();
    }

    public CheckBoxJava() {
        setTitle("JFrame Title");
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());

        JButton button = new JButton("Submit");
        button.setFocusable(false);

        JCheckBox checkBox = new JCheckBox();
        checkBox.setText("I'm a checkbox");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Comic Sans", Font.BOLD, 16));

        button.addActionListener(
                e -> {
                    System.out.println(checkBox.isSelected());
                });
        checkBox.setIcon(new ImageIcon("x.png"));
        checkBox.setSelectedIcon(new ImageIcon("check.png"));
        add(button);
        add(checkBox);
        pack();
        setVisible(true);

    }
}
