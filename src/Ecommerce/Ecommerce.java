package Ecommerce;

import Pythagoras.Pythagoras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ecommerce extends JFrame {
    private JButton ViewItems;
    public JButton ViewInventory;
    public JPanel estore;
    public JLabel welcomeLabel;
    public JLabel Checkout;

    public Ecommerce() {

        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JButton ViewItems = new JButton("View Items");
        JButton ViewInventory = new JButton("View Inventory");
        JButton Checkout = new JButton("Proceed to Checkout");
        getContentPane().add(ViewItems);
        getContentPane().add(ViewInventory);
        getContentPane().add(Checkout);
        JLabel welcome = new JLabel("Welcome to the ecommerce store!");
        getContentPane().add(welcome);

        ViewItems.setBounds(225, 400, 200, 200);
        ViewInventory.setBounds(500, 400, 200, 200);
        Checkout.setBounds(380, 700, 200, 200);
        welcome.setBounds(375, 0, 200, 200);

        ViewItems.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Items.main(null);
            }
        });

        Checkout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TotalCheckout.main(null);
            }
        });

        ViewInventory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inventory.main(null);
            }
        });

    }


    public static void main(String[] args) {
        //Items.main(null);

        EventQueue.invokeLater(() -> {
            try {
                Ecommerce ecommerceMarket = new Ecommerce();
                ecommerceMarket.setTitle("Ecommerce Market");
                ecommerceMarket.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });


    }
}