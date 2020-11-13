package Ecommerce;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

//this is the items class. It is called multiple times in order to count how many items were purchased and the values of the items as well
public class Items extends JFrame {

    public final JLabel TotalMoney = new JLabel("");

    //public static int allapples = 0;
    //stores the value of the total money count as a double with starting value of 0
    public static double TotalMoneyCount = 0;
    public static ArrayList<String> totalitems = new ArrayList<String>(); //stores the strings as an array and uses an iterator to sort the items
    public static Iterator alltheitems = totalitems.iterator();



    public Items(){
        getContentPane().setBackground(new Color(211, 211,211));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(150, 150, 700, 375);
        getContentPane().setLayout(null);
        TotalMoney.setForeground(Color.WHITE);
        TotalMoney.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        TotalMoney.setHorizontalAlignment(SwingConstants.RIGHT);
        TotalMoney.setBounds(18, 6, 650, 67);
        getContentPane().add(TotalMoney);
//_______________________________________________________________________
        JButton apples = new JButton("Apples: $1.75");

        apples.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TotalMoneyCount = TotalMoneyCount + 1.75;
                System.out.println(TotalMoneyCount);
                TotalMoney.setText("Total Money = " + String.valueOf(TotalMoneyCount));
                totalitems.add("Apples x 1");
            }
        });

        apples.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        apples.setOpaque(true);
        apples.setForeground(Color.BLACK);
        apples.setBackground(Color.ORANGE);
        apples.setBounds(35, 86, 200, 40);
        getContentPane().add(apples);
//___________________________________________________________________________
        JButton masks = new JButton("Masks: $100");
        masks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TotalMoneyCount = TotalMoneyCount + 100;
                System.out.println(TotalMoneyCount);
                TotalMoney.setText("Total Money = " + String.valueOf(TotalMoneyCount));
                totalitems.add("masks x 1");
            }
        });

        masks.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        masks.setOpaque(true);
        masks.setForeground(Color.BLACK);
        masks.setBackground(Color.ORANGE);
        masks.setBounds(35, 136, 200, 40);
        getContentPane().add(masks);
        //_______________________________________________________________________________
        JButton Calculator = new JButton("Calculator: $10.75");
        Calculator.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TotalMoneyCount = TotalMoneyCount + 10.75;
                System.out.println(TotalMoneyCount);
                TotalMoney.setText("Total Money = " + String.valueOf(TotalMoneyCount));
                totalitems.add("Calculator x 1");
            }
        });

        Calculator.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        Calculator.setOpaque(true);
        Calculator.setForeground(Color.BLACK);
        Calculator.setBackground(Color.ORANGE);
        Calculator.setBounds(35, 186, 200, 40);
        getContentPane().add(Calculator);
        //__________________________________________________________________________________
        JButton bannanas = new JButton("Bananas: $1.50");
        bannanas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TotalMoneyCount = TotalMoneyCount + 1.50;
                System.out.println(TotalMoneyCount);
                TotalMoney.setText("Total Money = " + String.valueOf(TotalMoneyCount));
                totalitems.add("Bananas x 1");
                System.out.println(totalitems);
            }
        });

        bannanas.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        bannanas.setOpaque(true);
        bannanas.setForeground(Color.BLACK);
        bannanas.setBackground(Color.ORANGE);
        bannanas.setBounds(35, 236, 200, 40);
        getContentPane().add(bannanas);
        //___________________________________________________________________________________
        JButton back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                //Ecommerce.main(null);

            }
        });

        back.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        back.setOpaque(true);
        back.setForeground(Color.BLACK);
        back.setBackground(Color.ORANGE);
        back.setBounds(35, 286, 200, 40);
        getContentPane().add(back);
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

    }
}

