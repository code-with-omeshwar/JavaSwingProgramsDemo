import javax.swing.*;
import java.awt.*;

public class MyButton {

    static JFrame frame = new JFrame();
    static JButton button = new JButton();

    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("img3.png");
        JLabel label = new JLabel();
        ImageIcon icon2 = new ImageIcon("img4.png");
        label.setIcon(icon2);
        label.setBounds(150, 250, 300, 350);
        label.setVisible(false);
        button.setBounds(100, 100, 250, 100);
        // button.addActionListener(new MyButton());
        button.setText("I'm a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setFont(new Font("Comic Sans", Font.BOLD, 16));
        button.setHorizontalTextPosition(JButton.RIGHT);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.addActionListener(e -> {
            System.out.println("Bro, do you even code?");
            label.setVisible(true);
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.add(button);
        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    /*
     * @Override
     * public void actionPerformed(ActionEvent e) {
     * if (e.getSource() == button) {
     * System.out.println("Bro, do you even code?");
     * }
     * }
     */
}
