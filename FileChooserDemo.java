import javax.swing.*;
import java.awt.*;
import java.io.*;

public class FileChooserDemo extends JFrame {
    FileChooserDemo() {
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());
        JButton button = new JButton("Open File");
        button.addActionListener(
                e -> {
                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.setCurrentDirectory(new File("."));// set current directory

                    // int response = fileChooser.showOpenDialog(null);// select file to open
                    int response = fileChooser.showSaveDialog(null);// select file to save

                    if (response == JFileChooser.APPROVE_OPTION) {
                        File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                        System.out.println(file);
                    }
                });

        add(button);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new FileChooserDemo();
    }
}
