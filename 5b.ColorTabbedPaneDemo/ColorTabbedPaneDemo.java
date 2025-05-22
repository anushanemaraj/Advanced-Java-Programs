//5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and
//display the concerned color whenever the specific tab is selected in the Pan.

package demo1;

import javax.swing.*;
import java.awt.*;

public class ColorTabbedPaneDemo {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Color Tabbed Pane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels for each color
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        // Add panels to the tabbed pane
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add tabbedPane to the frame
        frame.getContentPane().add(tabbedPane);

        // Center the frame and make it visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
