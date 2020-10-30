package Ecommerce;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ecommerce {
    private JButton ViewItems;
    private JButton ViewInventory;
    private JPanel estore;
    private JLabel welcomeLabel;
    private JLabel Checkout;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton ViewItems = new JButton("View Items");
        JButton ViewInventory = new JButton("View Inventory");
        JButton Checkout = new JButton("Proceed to Checkout");
        JPanel estore = new JPanel();
        JLabel welcome = new JLabel("Welcome to the ecommerce store!");
        JLabel Image = new JLabel(new ImageIcon("486.png"));
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(estore);

        estore.setLayout(null);

        ViewItems.setBounds(225, 400, 200, 200);
        ViewInventory.setBounds(500, 400, 200, 200);
        Checkout.setBounds(380, 700, 200, 200);
        welcome.setBounds(375, 0, 200, 200);
        Image.setBounds(100, 100, 200, 200);

        estore.add(ViewItems);
        estore.add(ViewInventory);
        estore.add(welcome);
        estore.add(Checkout);
        estore.add(Image);


    }
}