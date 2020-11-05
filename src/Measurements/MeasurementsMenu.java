package Measurements;

import Temperature.Temperature;
import view_control.CalculatorUI;
import view_control.MainMenu;

import javax.swing.*;
import java.awt.*;

public class MeasurementsMenu extends JFrame {

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                MeasurementsMenu frame = new MeasurementsMenu();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public MeasurementsMenu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        Container content = getContentPane();
        content.setBackground(new Color(96, 206, 250, 255));

        // Menu Objects
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnHome = new JMenu("Home");
        menuBar.add(mnHome);

        JMenu mnMeasurements = new JMenu("Measurements");
        menuBar.add(mnMeasurements);

        JMenuItem mntmTemperature = new JMenuItem("Fahrenheit to Celsius");
        mntmTemperature.addActionListener(e -> {
            Temperature frame = new Temperature();
            frame.setVisible(true);
        });
        mnMeasurements.add(mntmTemperature);





    }
}