package Temperature;

// Made by Aryan

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temperature extends JFrame {
    private JPanel Panel;
    private JTextField fahrenheit;
    //private JTextField celsius;
    private JLabel conversion;
    private JButton calculate;

    public Temperature() {
        ///JFrame frame = new JFrame();
        getContentPane().add(Panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 1000);

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
        Temperature convert = new Temperature();
        convert.setTitle("Fahrenheit to Celsius Conversion");

        //convert.setContentPane(new Temperature().Panel);
        //convert.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        convert.setVisible(true);
}

    }


