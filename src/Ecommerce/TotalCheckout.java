package Ecommerce;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TotalCheckout extends JFrame {

    public final JLabel TotalCheckout = new JLabel("");
    public final JLabel TotalBalance = new JLabel("");
    public final JLabel EnoughMoney = new JLabel("");

    //public static int allapples = 0;
    public static double Balance = 123;

    public TotalCheckout() {
        getContentPane().setBackground(new Color(211, 211, 211));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(150, 150, 700, 375);
        getContentPane().setLayout(null);
        TotalCheckout.setForeground(Color.BLACK);
        TotalCheckout.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        TotalCheckout.setHorizontalAlignment(SwingConstants.RIGHT);
        TotalCheckout.setBounds(18, 6, 650, 67);
        getContentPane().add(TotalCheckout);
        TotalCheckout.setText("Total Money = " + String.valueOf(Items.TotalMoneyCount));

        TotalBalance.setForeground(Color.BLACK);
        TotalBalance.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        TotalBalance.setHorizontalAlignment(SwingConstants.RIGHT);
        TotalBalance.setBounds(18, 56, 650, 67);
        getContentPane().add(TotalBalance);
        TotalBalance.setText("Your Balance = " + String.valueOf(Balance));

        EnoughMoney.setForeground(Color.BLACK);
        EnoughMoney.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        EnoughMoney.setHorizontalAlignment(SwingConstants.RIGHT);
        EnoughMoney.setBounds(18, 106, 650, 67);
        getContentPane().add(EnoughMoney);

        JButton Exit = new JButton("Exit");
        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.exit(0);
            }
        });

        Exit.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        Exit.setOpaque(true);
        Exit.setForeground(Color.BLACK);
        Exit.setBackground(Color.ORANGE);
        Exit.setBounds(35, 156, 200, 40);
        getContentPane().add(Exit);

        JButton CheckOutItems = new JButton("Checkout");
        CheckOutItems.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        CheckOutItems.setOpaque(true);
        CheckOutItems.setForeground(Color.BLACK);
        CheckOutItems.setBackground(Color.ORANGE);
        CheckOutItems.setBounds(35, 206, 200, 40);
        getContentPane().add(CheckOutItems);

        if(Items.TotalMoneyCount > Balance){
            System.out.println("Not Enough Money");
            EnoughMoney.setText("Balance Insufficient");
            CheckOutItems.setVisible(false);
        }
        else{
            EnoughMoney.setText("Balance Sufficent");
            CheckOutItems.setVisible(true);
            CheckOutItems.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    TotalBalance.setText("Your Balance = " + String.valueOf(Balance - Items.TotalMoneyCount));
                    TotalCheckout.setText("Total Money = 0");


                }
            });
        }

    }

    public static void main(String[] args) {


        EventQueue.invokeLater(() -> {
            try {
                TotalCheckout AllCheckOut = new TotalCheckout();
                AllCheckOut.setTitle("Checkout");
                AllCheckOut.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }

}