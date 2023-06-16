import javax.swing.*;
import java.awt.*;

public class TextFieldJava {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JFrame Title");
        frame.setDefaultCloseOperation(3);
        frame.setLayout(new FlowLayout());

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        textField.setForeground(Color.GREEN);
        textField.setBackground(Color.BLACK);
        textField.setText("username");

        JButton button = new JButton("Submit");
        button.addActionListener(
                e -> {
                    System.out.println("Welcome " + textField.getText());
                    textField.setEditable(false);
                    button.setEnabled(false);
                });
        button.setFocusable(false);

        frame.add(button);
        frame.add(textField);
        frame.pack();
        frame.setVisible(true);
    }
}
