package demo1;
import javax.swing.*;
import java.awt.*;

public class HelloSwing {

    public static void main(String[] args) {
        // Create a new JFrame container
        JFrame frame = new JFrame("Hello Swing");

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel with the desired message
        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", SwingConstants.CENTER);

        // Set font: plain, size 32
        label.setFont(new Font("Serif", Font.PLAIN, 32));

        // Set text color to blue
        label.setForeground(Color.BLUE);

        // Add the label to the frame's content pane
        frame.getContentPane().add(label);

        // Set frame size
        frame.setSize(700, 200);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
