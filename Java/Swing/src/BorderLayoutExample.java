import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        //Create JFrame
        JFrame frame = new JFrame("BoderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);

        //CREATE  JPanel with  BorderLAYOUT
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10,10));

        //Add  Components to all regions
        panel.add(new JButton ("North(Top)"), BorderLayout.NORTH);
        panel.add(new JButton ("South(Bottom)"), BorderLayout.SOUTH);
        panel.add(new JButton ("West(Left)"), BorderLayout.WEST);
        panel.add(new JButton ("East(Right)"), BorderLayout.EAST);
        panel.add(new JButton ("Center(Min Area)"), BorderLayout.CENTER);

        //Add Panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
