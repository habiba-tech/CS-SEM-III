import javax.swing.*;
public class MyWindow {
    public static void main(String[] args) {
        //Create a window
        JFrame frame = new JFrame("My First Window");
        //Set Width and height
        frame.setSize(400,300);
        //Close the app when X is clicked
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //show the window
        frame.setVisible(true);
    }
}
