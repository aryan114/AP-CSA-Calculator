package Ecommerce;

import view_control.CalculatorUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Ecommerce extends Items {
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
        //JLabel Image = new JLabel(new ImageIcon("486.png"));
        JLabel Image = new JLabel("");
        java.awt.Image image = new ImageIcon("486.png").getImage();
        Image.setIcon(new ImageIcon(image));
        Image.setBounds(377, 111, 128, 128);

        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(estore);

        estore.setLayout(null);

        ViewItems.setBounds(225, 400, 200, 200);
        ViewInventory.setBounds(500, 400, 200, 200);
        Checkout.setBounds(388, 700, 200, 200);
        welcome.setBounds(375, 0, 200, 200);
        Image.setBounds(100, 100, 200, 200);

        estore.add(ViewItems);
        estore.add(ViewInventory);
        ViewInventory.addActionListener(e -> {
            Items items = new Items();
            items.setVisible(true);
            estore.add(items);
        });
        estore.add(ViewInventory);
        estore.add(welcome);
        estore.add(Checkout);

    }
}