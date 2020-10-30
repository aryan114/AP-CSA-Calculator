//This is the login code to our project. Requires you to enter a username and password to login.
// Made by Pranav
package LoginToProject;
import view_control.MainMenu;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Objects;
import LoginToProject.NewUser.*;

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
    //^Components on JPanel initiation. See form for color updates.

    /*
    NewUser hmap = new NewUser();
    private void credentialcheck(String x, String y){
        //HashMap<String, String> credentials =
        HashMap<String, String> hm = hmap.getCredentialsMap();
        if (hm.get(x).equals(y)){
            LoginMessage.setText("You're in!");
            MainMenu.main(null);
        } else{
            LoginMessage.setText("Wrong Credentials!");
        }
    }

     */

    //credstore hmap = new credstore();
    //HashMap<String,String> hm = hmap.getCreds();



    public Login() {
        Verify.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = UserEntry.getText();
                String password = PassEntry.getText();
                //credentialcheck(username, password);

                //hmap.checker(UserEntry, PassEntry);

                if (username.equals("coderwithswag") && password.equals("Legit")) {
                    LoginMessage.setText("You're in!");
                    MainMenu.main(null);
                    //Part of the sequence to opening the panels correctly. More in other areas of the code.
                } else {
                    LoginMessage.setText("Wrong Credentials!");
                }
            }
        });
        newUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewUser.main(null);
            }
        });
    }
    public static void main(String[] args) {
        JFrame log = new JFrame("Login");
        log.setSize(500,300);
        log.setContentPane(new Login().LoginPanel);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        log.setVisible(true);
    }
}