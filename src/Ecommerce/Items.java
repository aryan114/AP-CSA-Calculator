
package Ecommerce;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Items extends JFrame {
    private JLabel apples;
    private JLabel bananas;
    private JLabel oranges;
    private JLabel grapes;
    private JLabel milk;
    private JLabel tomatoes;
    private JLabel masks;
    private JLabel water;
    private JLabel pencils;
    private JLabel lemonade;
    private JLabel chips;
    private JPanel panel1;

    public static void main(String[] args) {
        JFrame items = new JFrame();
        JLabel welcome = new JLabel("Hello! These are the items in our store.");
        JLabel apples = new JLabel("Apples - $3.99 for 12.");
        JLabel bananas = new JLabel("Bananas - $3.99 for 6.");
        JLabel oranges = new JLabel("Oranges - $6.99 for 6.");
        JLabel grapes = new JLabel("Grapes - $8.99 for a large pack.");
        JLabel milk = new JLabel("Milk - $2.99 for a gallon.");
        JLabel tomatoes = new JLabel("Tomatoes - $0.99 for one.");
        JLabel masks = new JLabel("Masks - $99.99 for one.");
        JLabel water = new JLabel("Water - $9.99 for 32 bottles.");
        JLabel pencils = new JLabel("Pencils - $9.99 for 24 pencils.");
        JLabel lemonade = new JLabel("Lemonade - $4.99 for a gallon.");
        JLabel chips = new JLabel("Chips - $2.99 for a pack");

        items.setSize(1000, 1000);
        items.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        items.setVisible(true);

        apples.setBounds(225, 400, 200, 200);
        bananas.setBounds(500, 400, 200, 200);
        oranges.setBounds(388, 700, 200, 200);

        items.add(welcome);
        items.add(apples);
        items.add(bananas);
        items.add(oranges);

    }
}

