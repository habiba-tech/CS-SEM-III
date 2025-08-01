import javax.swing.*;
import java.awt.*;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        // Load background image (update path as needed)
        ImageIcon backgroundImage = new ImageIcon("C:\\Users\\Admin\\IdeaProjects\\Swing\\src\\images\\img.png"); // Update with your image path

        // Custom JPanel for background
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        backgroundPanel.setLayout(new BorderLayout());

        // Heading
        JLabel headingLabel = new JLabel("Registration Form", JLabel.CENTER);
        headingLabel.setFont(new Font("Arial", Font.BOLD, 20));
        headingLabel.setOpaque(true);
        headingLabel.setBackground(new Color(180, 200, 255, 180));
        headingLabel.setForeground(Color.BLACK);

        // Text fields (smaller with columns)
        JTextField nameField = new JTextField(10);
        JTextField addressField = new JTextField(10);
        JTextField mobileField = new JTextField(10);

        // Labels
        JLabel nameLabel = new JLabel("Name:");
        JLabel addressLabel = new JLabel("Address:");
        JLabel mobileLabel = new JLabel("Mobile No:");
        nameLabel.setForeground(Color.WHITE);
        addressLabel.setForeground(Color.WHITE);
        mobileLabel.setForeground(Color.WHITE);

        // Form panel
        JPanel formPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        formPanel.setOpaque(false);
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(addressLabel);
        formPanel.add(addressField);
        formPanel.add(mobileLabel);
        formPanel.add(mobileField);

        // Buttons (no events)
        JButton submitButton = new JButton("Submit");
        JButton resetButton = new JButton("Reset");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        buttonPanel.add(submitButton);
        buttonPanel.add(resetButton);

        // Add everything
        backgroundPanel.add(headingLabel, BorderLayout.NORTH);
        backgroundPanel.add(formPanel, BorderLayout.CENTER);
        backgroundPanel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(backgroundPanel);
        frame.setVisible(true);
    }
}
