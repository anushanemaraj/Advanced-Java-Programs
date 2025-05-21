package demo1;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class CountryCapitalListDemo {

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Country and Capital Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 300);

        // Map of countries and their capitals
        Map<String, String> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("USA", "Washington, D.C.");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("Vietnam", "Hanoi");
        countryCapitalMap.put("Canada", "Ottawa");
        countryCapitalMap.put("Denmark", "Copenhagen");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Great Britain", "London");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("Africa", "Addis Ababa (AU HQ)"); // Continent placeholder
        countryCapitalMap.put("Greenland", "Nuuk");
        countryCapitalMap.put("Singapore", "Singapore");

        // Create a list of countries
        String[] countries = countryCapitalMap.keySet().toArray(new String[0]);
        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Add a selection listener to display capitals
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    List<String> selectedCountries = countryList.getSelectedValuesList();
                    System.out.println("Selected Countries and Capitals:");
                    for (String country : selectedCountries) {
                        String capital = countryCapitalMap.get(country);
                        System.out.println(country + " - " + capital);
                    }
                    System.out.println("------");
                }
            }
        });

        // Add the scrollPane to the frame
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
    }
}
