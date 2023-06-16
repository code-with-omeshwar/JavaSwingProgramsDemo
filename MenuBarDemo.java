import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class MenuBarDemo extends JFrame {
    MenuBarDemo() {
        setDefaultCloseOperation(3);
        setSize(420, 420);
        setLayout(new FlowLayout());
        // setLayout(null);
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem loadItem = new JMenuItem("Load");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(
                e -> {
                    System.out.println("You loaded a file!");
                });
        saveItem.addActionListener(
                e -> {
                    System.out.println("You saved a file!");
                });
        exitItem.addActionListener(
                e -> {
                    System.out.println("You exited the program!");
                    System.exit(0);
                });

        fileMenu.setMnemonic(KeyEvent.VK_F);
        editMenu.setMnemonic(KeyEvent.VK_E);
        helpMenu.setMnemonic(KeyEvent.VK_H);

        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuBarDemo();
    }
}
