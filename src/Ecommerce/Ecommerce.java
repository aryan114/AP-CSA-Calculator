
package Ecommerce;

import Pythagoras.Pythagoras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ecommerce extends JFrame {
    private JButton ViewItems;
    private JButton ViewInventory;
    private JPanel estore;
    private JLabel welcomeLabel;
    private JLabel Checkout;

    public Ecommerce() {
        // JFrame frame = new JFrame();

        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //add(estore);

        JButton ViewItems = new JButton("View Items");
        JButton ViewInventory = new JButton("View Inventory");
        JButton Checkout = new JButton("Proceed to Checkout");
        //JPanel estore = new JPanel();
        getContentPane().add(ViewItems);
        getContentPane().add(ViewInventory);
        getContentPane().add(Checkout);
        JLabel welcome = new JLabel("Welcome to the ecommerce store!");
        getContentPane().add(welcome);
       // JLabel Image = new JLabel(new ImageIcon("486.png"));

        //estore.setLayout(null);

        ViewItems.setBounds(225, 400, 200, 200);
        ViewInventory.setBounds(500, 400, 200, 200);
        Checkout.setBounds(380, 700, 200, 200);
        welcome.setBounds(375, 0, 200, 200);
        //Image.setBounds(100, 100, 200, 200);
/*
        estore.add(ViewItems);
        estore.add(ViewInventory);
        estore.add(welcome);
        estore.add(Checkout);
        //estore.add(Image);

 */

    }
    public static void main(String[] args) {
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

