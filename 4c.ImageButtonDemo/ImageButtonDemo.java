//4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
//Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
//pressed by implementing the event handling mechanism with addActionListener( ).

package demo1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo {

    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Image Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        // Create a panel
        JPanel panel = new JPanel();

        // Label to show messages
        JLabel messageLabel = new JLabel("Click an icon button");
        messageLabel.setFont(new Font("Arial", Font.BOLD, 18));
        messageLabel.setForeground(Color.BLUE);

        // Load icons (Ensure these files exist in your project directory)
        ImageIcon digitalClockIcon = new ImageIcon("digital_clock.png");
        ImageIcon hourGlassIcon = new ImageIcon("hourglass.png");

        // Create buttons with icons
        JButton digitalClockButton = new JButton(digitalClockIcon);
        JButton hourGlassButton = new JButton(hourGlassIcon);

        // Add action listeners
        digitalClockButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Digital Clock is pressed");
            }
        });

        hourGlassButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Hour Glass is pressed");
            }
        });

        // Add buttons and label to the panel
        panel.add(digitalClockButton);
        panel.add(hourGlassButton);
        panel.add(messageLabel);

        // Add panel to the frame
        frame.getContentPane().add(panel);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}
