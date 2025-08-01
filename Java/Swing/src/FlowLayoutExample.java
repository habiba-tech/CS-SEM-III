import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        //Create a JFrame
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);

        //Create a JPanel With FlowLayout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT,20,10));

        // Add components
        panel.add(new JLabel("Name"));
        panel.add(new JTextField(15));

        panel.add(new JLabel("Email"));
        panel.add(new JTextField(15));

        panel.add(new JButton("Submit"));
        panel.add(new JButton("Reset"));

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);


    }
}
