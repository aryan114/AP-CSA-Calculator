//This is the login code to our project. Requires you to enter a username and password to login.
// Made by Pranav

package LoginToProject;

import view_control.MainMenu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.*;

public class Login {
    private JPanel LoginPanel;
    private JLabel User;
    private JLabel LoginMessage;
    private JTextField UserEntry;
    private JPasswordField PassEntry;
    private JLabel Pass;
    private JButton Verify;
    private JButton newUser;
    private JLabel welcome;
    public static boolean entry;

    public Login() {
        Verify.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = UserEntry.getText();
                String password = PassEntry.getText();

                if(username.equals("coderwithswag") && password.equals("Legit")){
                    LoginMessage.setText("You're in!");
                    MainMenu.main(null);
                    boolean entry = true;


                } else{
                    LoginMessage.setText("Wrong Credentials!");
                }
            }
        });
        newUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Create New User
            }
        });
    }

    public static void main(String[] args) {
        JFrame log = new JFrame("Login");
        log.setSize(400,300);
        log.setContentPane(new Login().LoginPanel);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        log.setVisible(true);

    }

}