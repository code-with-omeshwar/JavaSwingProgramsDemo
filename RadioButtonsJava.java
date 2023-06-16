import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonsJava extends JFrame implements ActionListener {

    JRadioButton pizzaButton = new JRadioButton("pizza");
    JRadioButton hamburgerButton = new JRadioButton("hamburger");
    JRadioButton hotdogButton = new JRadioButton("hotdog");

    RadioButtonsJava() {
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);
        /*
         * pizzaButton.addActionListener(
         * e -> {
         * System.out.println("You ordered pizza!");
         * });
         * hamburgerButton.addActionListener(
         * e -> {
         * System.out.println("You ordered a hamburger!");
         * });
         * hotdogButton.addActionListener(
         * e -> {
         * System.out.println("You ordered a hotdog!");
         * });
         */
        /*
         * hotdogButton.addActionListener(new ActionListener() {
         * 
         * @Override
         * public void actionPerformed(ActionEvent e) {
         * System.out.println("You ordered a hotdog!");
         * }
         * });
         */

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        add(pizzaButton);
        add(hamburgerButton);
        add(hotdogButton);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton) {
            System.out.println("You ordered pizza!");
        } else if (e.getSource() == hamburgerButton) {
            System.out.println("You ordered a hamburger!");
        } else if (e.getSource() == hotdogButton) {
            System.out.println("You ordered a hotdog!");
        }
    }

    public static void main(String[] args) {
        new RadioButtonsJava();
    }
}
