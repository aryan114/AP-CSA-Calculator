package Pythagoras;

// Created by Aryan
import view_control.CalculatorUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;
import java.awt.EventQueue;

public class Pythagoras extends JFrame {
    private JPanel Panel;
    private JTextField side1;
    private JTextField side2;
    private JLabel hypotenuse;
    private JButton Calculate;


    public Pythagoras() {
    JFrame frame = new JFrame();
    //JLabel instructions = new JLabel("Enter the first leg and the second leg of your right triangle");
    //JTextField side1 = new JTextField("Enter the value of side 1: ");
    //JTextField side2 = new JTextField("Enter the value of side 2: ");
    //JLabel hypotenuse = new JLabel("The hypotenuse of your triangle is: ");

    // Variables leg 1 and leg 2 basically take the text that was entered in the text field (in this a number) and converted it into a double
    // Help taken from the video https://www.youtube.com/watch?v=f-lqHR3isxg
    Calculate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            double leg1 = Double.parseDouble(side1.getText());
            double leg2 = Double.parseDouble(side2.getText());
            double answer = (leg1 * leg1 + leg2 * leg2);
            double answer2 = java.lang.Math.sqrt(answer);

            // Converts answer back into a string
            hypotenuse.setText(String.valueOf(answer2));
        }
    });

}
    public static void main(String[] args) {
        JFrame triangle = new JFrame("Pythagoras Calculator");
        triangle.setSize(500, 1000);
        triangle.setContentPane(new Pythagoras().Panel);
        triangle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        triangle.setVisible(true);
        EventQueue.invokeLater(() -> {
            try {
                Pythagoras frame = new Pythagoras();
                frame.setTitle("Pythagoras Calculator");
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });


    }
}
