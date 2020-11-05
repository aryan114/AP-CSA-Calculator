
package Ecommerce;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Items extends JFrame {
    private JPanel Panel;
    private JButton apples;
    double TotalMoney = 0;
    int allapples = 0;

    public Items(){

        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JButton apples = new JButton("apples: $1.99");
        frame.getContentPane().add(apples);

        apples.setBounds(225,400,200,200);

        apples.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TotalMoney = TotalMoney + 1.99;
                allapples = allapples + 1;
                System.out.println(TotalMoney);
                System.out.println(allapples);
            }
        });
    }


    public static void main(String[] args) {
        JFrame TotalItems = new JFrame("Items Page");
        TotalItems.setSize(1000,1000);
        TotalItems.setContentPane(new Items().Panel);
        TotalItems.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TotalItems.setVisible(true);
    }
}

