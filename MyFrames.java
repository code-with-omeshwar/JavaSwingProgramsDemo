import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrames {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JFrame Title");
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false); // prevent frame from being resized
        frame.setSize(420, 420);
        frame.setVisible(true);
        ImageIcon image = new ImageIcon("img1.png"); // create an ImageIcon
        frame.setIconImage(image.getImage());// change icon of image
        frame.getContentPane().setBackground(Color.GREEN);// change color of background with default colors
        // change color of backgrounf by creating new color
        frame.getContentPane().setBackground(new Color(123, 50, 250));
    }
}
/*
 * Alternatively extend JFrame Class and create a constructor
 * Inside constructor call the frame methods as required
 */