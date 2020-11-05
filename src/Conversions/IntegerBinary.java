package Conversions;

// Made by Aryan

import Temperature.Temperature;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntegerBinary extends JFrame {
    private JPanel Panel;
    private JTextField number;
    private JLabel binaryAnswer;
    private JButton button1;
    private JButton convert;

    public IntegerBinary() {
        getContentPane().add(Panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 1000);
        convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numberInput = Integer.parseInt(number.getText());
                String convertedAnswer = Integer.toBinaryString(numberInput);
                convert.setText((convertedAnswer));
            }
        });
    }

    public static void main(String[] args) {
        IntegerBinary convert = new IntegerBinary();
        convert.setTitle("This will convert an integer input to its binary value.");

        //convert.setContentPane(new Temperature().Panel);
        //convert.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        convert.setVisible(true);
    }
}
