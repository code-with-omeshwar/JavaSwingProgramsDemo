import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JFrame Title");
        frame.setDefaultCloseOperation(3);
        frame.setSize(420, 420);

        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setBounds(0, 0, 420, 50);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        progressBar.setFont(new Font("MV Boli", Font.PLAIN, 25));
        progressBar.setForeground(Color.RED);
        progressBar.setBackground(Color.BLACK);

        frame.setLayout(null);
        frame.add(progressBar);
        frame.setVisible(true);

        fill(progressBar);
    }

    private static void fill(JProgressBar progressBar) {
        int counter = 500;
        while (counter >= 0) {
            progressBar.setValue(counter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter -= 10;
        }
        progressBar.setString("Done!");
    }
}
