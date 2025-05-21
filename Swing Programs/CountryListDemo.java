package demo1;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.List;

public class CountryListDemo {

    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Country JList Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // List of countries
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
        };

        // Create JList with countries
        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        countryList.setVisibleRowCount(8);
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Add a listener to handle selection
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    List<String> selectedCountries = countryList.getSelectedValuesList();
                    System.out.println("Selected Countries:");
                    for (String country : selectedCountries) {
                        System.out.println(country);
                    }
                    System.out.println("------");
                }
            }
        });

        // Add components to frame
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}
