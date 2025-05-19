package demo1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonDemo {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Country Button Press Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create the panel to hold components
        JPanel panel = new JPanel();

        // Create a label to display the message
        JLabel messageLabel = new JLabel("Press a button");
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        messageLabel.setForeground(Color.BLUE);

        // Create two buttons
        JButton indiaButton = new JButton("India");
        JButton srilankaButton = new JButton("Srilanka");

        // Add ActionListener to "India" button
        indiaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("India is pressed");
            }
        });

        // Add ActionListener to "Srilanka" button
        srilankaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Srilanka is pressed");
            }
        });

        // Add components to panel
        panel.add(indiaButton);
        panel.add(srilankaButton);
        panel.add(messageLabel);

        // Add panel to frame
        frame.getContentPane().add(panel);

        // Center the frame and make it visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
