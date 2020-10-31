package Temperature;

// Made by Aryan

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temperature {
    private JPanel Panel;
    private JTextField fahrenheit;
    //private JTextField celsius;
    private JLabel conversion;
    private JButton calculate;

    public Temperature() {
        JFrame frame = new JFrame();
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double fahrenheitInput = Double.parseDouble(fahrenheit.getText());
                //double celsiusInput = Double.parseDouble(celsius.getText());
                double convertedAnswer = (fahrenheitInput - 32) * 0.555555555555555556;

                conversion.setText(String.valueOf(convertedAnswer));
            }
        });
    }

    public static void main(String[] args) {
        JFrame convert = new JFrame("Fahrenheit to Celsius Conversion");
        convert.setSize(500, 1000);
        convert.setContentPane(new Temperature().Panel);
        convert.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        convert.setVisible(true);
}

    }


