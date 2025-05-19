package demo1;

import javax.swing.*;
import java.awt.*;

public class CMYTabbedPaneDemo {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("CMY Color Tabs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels with CMY colors
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add tabs with the color panels
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Add the tabbed pane to the frame
        frame.getContentPane().add(tabbedPane);

        // Center the frame and display
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
