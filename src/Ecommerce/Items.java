//test
package Ecommerce;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Items extends JFrame {

    private final JLabel TotalMoney = new JLabel("");
    //private JButton apples;
    double TotalMoneyCount = 0;
    int allapples = 0;

    public Items(){

        getContentPane().setBackground(new Color(211, 211,211));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(150, 150, 700, 375);
        getContentPane().setLayout(null);
        TotalMoney.setForeground(Color.BLACK);
        TotalMoney.setFont(new Font("Lucida Grande", Font.PLAIN, 72));
        TotalMoney.setHorizontalAlignment(SwingConstants.RIGHT);
        TotalMoney.setBounds(18, 6, 650, 67);
        getContentPane().add(TotalMoney);

        JButton apples = new JButton("Apples: $1.99");
        apples.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                apples.setBackground(Color.ORANGE);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                apples.setBackground(Color.ORANGE);
            }
        });

        apples.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        apples.setOpaque(true);
        apples.setForeground(Color.BLACK);
        apples.setBackground(Color.ORANGE);
        //apples.addActionListener(e -> (apples.getText()));
        apples.setBounds(35, 86, 100, 40);
        getContentPane().add(apples);
    }


    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            try {
                Items ItemsFrame = new Items();
                ItemsFrame.setTitle("Items Page");
                ItemsFrame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
//        JFrame TotalItems = new JFrame("Items Page");
//        TotalItems.setSize(1000,1000);
//        TotalItems.setContentPane(new Items().Panel);
//        TotalItems.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        TotalItems.setVisible(true);

    }
}

