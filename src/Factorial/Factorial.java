package Factorial;

import Pythagoras.Pythagoras;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Factorial extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private javax.swing.JLabel JLabel;
    private JButton Calculate;
    private JLabel Answer;
    private JLabel JLabel1;

    public static int answer;

    public Factorial() {
        getContentPane().add(panel1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);

        Calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String facotrialize = textField1.getText();
                int number = Integer.parseInt(facotrialize);

                facotrializer(number);
                Answer.setText(String.valueOf(answer));


            }
        });
    }

    public int facotrializer(int x){ //Recursivly multiplies the previous number by the next number through if statements
        if(x == 1){
            return 1;
        } else{
            answer =  x * facotrializer(x-1);
            return answer;
        }
    }

    public static void main(String[] args) {
        Factorial frame = new Factorial();
        frame.setTitle("Factorial Calculator");
        frame.setVisible(true);
    }
}
