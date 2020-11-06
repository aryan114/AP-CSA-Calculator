package Conversions;

// Made by Aryan

import Temperature.Temperature;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InchesCentimeters extends JFrame {
    private JPanel Panel;
    private JTextField inches;

    private JLabel conversion;
    private JButton calculate;

    public InchesCentimeters() {
        getContentPane().add(Panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 1000);

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double inchesInput = Double.parseDouble(inches.getText());
                double convertedAnswer = (inchesInput * 2.54);
                conversion.setText(String.valueOf(convertedAnswer));
            }
        });
    }

    public static void main(String[] args) {
        InchesCentimeters convert = new InchesCentimeters();
        convert.setTitle("Inches to Centimeters Conversion");

        //convert.setContentPane(new Temperature().Panel);
        //convert.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        convert.setVisible(true);
    }
}
