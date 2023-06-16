import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class SliderJava extends JFrame implements ChangeListener {

    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderJava() {
        setTitle("Slider Demo");
        setDefaultCloseOperation(3);
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);

        slider.setPreferredSize(new Dimension(400, 200));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));

        slider.setOrientation(SwingConstants.VERTICAL);
        label.setFont(new Font("MV Boli", Font.PLAIN, 25));
        label.setText("Celsius = " + slider.getValue());

        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(label);
        add(panel);
        setSize(420, 420);
        setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("Celsius = " + slider.getValue());
    }

    public static void main(String[] args) {
        new SliderJava();
    }
}
