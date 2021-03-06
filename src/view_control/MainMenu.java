package view_control;

import CalcView.CalcControl;
import Ecommerce.Ecommerce;
import Factorial.Factorial;
import Measurements.MeasurementsMenu;
import Pythagoras.Pythagoras;
import Temperature.Temperature;
import slapj.Slapjack;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                MainMenu frame = new MainMenu();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public MainMenu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        // JLabel with image
        JLabel pic = new JLabel("");
        java.awt.Image image = new ImageIcon("APCompSci.jpeg").getImage();
        pic.setIcon(new ImageIcon(image));
        pic.setBounds(377, 111, 128, 128);

        // Content Panel to add Label and Image
        //https://docs.oracle.com/javase/tutorial/uiswing/components/rootpane.html
        Container content = getContentPane();
        content.setBackground(new Color(96, 206, 250, 255));
        content.add(pic);

        // Menu Objects
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnHone = new JMenu("Home");
        menuBar.add(mnHone);

        JMenuItem mntmPreferences = new JMenuItem("Preferences");
        mnHone.add(mntmPreferences);

        JMenu mnApTest = new JMenu("AP Test");
        menuBar.add(mnApTest);

/*
        JMenuItem mntmApReview = new JMenuItem("Review");
        mntmApReview.addActionListener(e -> {
            AP_UI frame = new AP_UI();
            frame.setVisible(true);
        });
        mnApTest.add(mntmApReview);

 */

        JMenu mnJig = new JMenu("Labs");
        menuBar.add(mnJig);

        JMenuItem mntmCalculator = new JMenuItem("Aryan and Pranav Calculator");
        mntmCalculator.addActionListener(e -> {
            CalculatorUI frame = new CalculatorUI();
            frame.setVisible(true);
        });
        mnJig.add(mntmCalculator);

        JMenuItem ecommerce = new JMenuItem("Ecommerce");
        ecommerce.addActionListener(e -> {
            Ecommerce frame = new Ecommerce();
            frame.setVisible(true);
        });
        mnJig.add(ecommerce);

        JMenuItem mntmPythagoras = new JMenuItem("Pythagoras Calculator");
        mntmPythagoras.addActionListener(e -> {
            Pythagoras triangle = new Pythagoras();
            triangle.setVisible(true);
        });
        mnJig.add(mntmPythagoras);

        JMenuItem mntmTemperature = new JMenuItem("Temperature Converter");
        mntmTemperature.addActionListener(e-> {
            Temperature temp = new Temperature();
            temp.setVisible(true);
        });
        mnJig.add(mntmTemperature);

        JMenuItem mntmMVCCalculator = new JMenuItem("MVC Calculator");
        mntmMVCCalculator.addActionListener(e-> {
            CalcControl calc = new CalcControl();
            calc.setVisible(true);
        });
        mnJig.add(mntmMVCCalculator);

        JMenuItem mntmConversions = new JMenuItem("Conversions/Measurements");
        mntmConversions.addActionListener(e-> {
            MeasurementsMenu menu = new MeasurementsMenu();
            menu.setVisible(true);
        });
        mnJig.add(mntmConversions);

        JMenuItem mntmFactorial = new JMenuItem("Factorial Calculator");
        mntmFactorial.addActionListener(e-> {
            Factorial menu = new Factorial();
            menu.setVisible(true);
        });
        mnJig.add(mntmFactorial);
/*
        JMenuItem mntmSlapJ = new JMenuItem("Slapjack");
        mntmSlapJ.addActionListener(e-> {
            Slapjack menu = new Slapjack();
            menu.setVisible(true);
        });
        mnJig.add(mntmSlapJ);

 */


/*
        JMenuItem ecommerce = new JMenuItem("Ecommerce");
        ecommerce.addActionListener(e -> {
            Ecommerce frame = new Ecommerce();
            frame.setVisible(true);
        });
        mnJig.add(ecommerce);

 */


/*
        JMenuItem mntmLogin = new JMenuItem("Login Screen");
        mntmLogin.addActionListener(e -> {
            LoginScreen frame = new LoginScreen();
            frame.setVisible(true);
        });
        mnJig.add(mntmLogin);

 */
/*
        JMenuItem mntmMethodSearch = new JMenuItem("File Search");
        mntmMethodSearch.addActionListener(e -> {
            MethodSearchUI frame = new MethodSearchUI();
            frame.setVisible(true);
        });

 */
/*
        JMenuItem mntmPalindrome = new JMenuItem("Palindrome");
        mntmPalindrome.addActionListener(e -> {
            PalindromeUI frame = new PalindromeUI();
            frame.setVisible(true);
        });
        mnJig.add(mntmPalindrome);
        mnJig.add(mntmMethodSearch);



        JMenuItem mntmProgrammingLanguages = new JMenuItem("Model Search");
        mntmProgrammingLanguages.addActionListener(e -> {
            ProgLang_UI frame = new ProgLang_UI();
            frame.setVisible(true);
        });
        mnJig.add(mntmProgrammingLanguages);
 */

    }

}
