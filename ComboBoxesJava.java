import javax.swing.*;
import java.awt.*;

public class ComboBoxesJava {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JFrame Title");
        frame.setDefaultCloseOperation(3);
        frame.setLayout(new FlowLayout());

        String[] animals = { "dog", "cat", "bird" };
        JComboBox<String> comboBox = new JComboBox<>(animals);
        System.out.println("item count: " + comboBox.getItemCount());
        comboBox.addActionListener(
                e -> {
                    System.out.println(comboBox.getSelectedIndex() + " " + comboBox.getSelectedItem());
                });
        comboBox.addItem("horse");
        comboBox.insertItemAt("pig", 0);
        // comboBox.setEditable(true);
        System.out.println("item count: " + comboBox.getItemCount());
        comboBox.setSelectedIndex(0);
        frame.add(comboBox);
        frame.pack();
        frame.setVisible(true);
    }
}
