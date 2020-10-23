//This is the login code to our project. Requires you to enter a username and password to login.
// Made by Pranav

package LoginToProject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JPanel LoginPanel;
    private JLabel User;
    private JLabel LoginMessage;
    private JTextField UserEntry;
    private JPasswordField PassEntry;
    private JLabel Pass;
    private JButton Verify;
    private JLabel welcome;

    public Login() {
        Verify.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = UserEntry.getText();
                String password = PassEntry.getText();

                if(username.equals("coderwithswag") && password.equals("Legit")){
                    LoginMessage.setText("You're in!");
                } else{
                    LoginMessage.setText("Wrong Credentials!");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setSize(400,300);
        frame.setContentPane(new Login().LoginPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        frame.setVisible(true);


    }

}