package Ecommerce;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.util.StringJoiner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inventory extends JFrame {

    public static final JLabel AllTheItemsInCart = new JLabel("");

    public Inventory() {
        getContentPane().setBackground(new Color(211, 211, 211));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(150, 150, 700, 375);
        getContentPane().setLayout(null);

        AllTheItemsInCart.setForeground(Color.WHITE);
        AllTheItemsInCart.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        AllTheItemsInCart.setHorizontalAlignment(SwingConstants.RIGHT);
        AllTheItemsInCart.setBounds(18, 6, 650, 67);
        getContentPane().add(AllTheItemsInCart);

//        while (Items.alltheitems.hasNext()){
//            String obj = (String)Items.alltheitems.next();
//            Inventory.AllTheItemsInCart.setText(obj);
//        }

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Inventory AllTheItems = new Inventory();
                AllTheItems.setTitle("Items Page");
                AllTheItems.setVisible(true);
                System.out.println(Items.totalitems);
                AllTheItemsInCart.setText(String.valueOf(Items.totalitems));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }
}