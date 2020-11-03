package LoginToProject;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
public class NewUser {
    private JTextField usernameentry;
    private JPasswordField passwordentry;
    private JButton createNewUserButton;
    private JLabel password;
    private JLabel username;
    private JLabel banner;
    private JPanel newUserpanel;

    credstoremodel newuser = credstoremodel.getInstance();



    public NewUser() {
        createNewUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usertemp = usernameentry.getText();
                String passtemp = passwordentry.getText();
                newuser.addUserCredentials(usertemp, passtemp);

            }
        });
    }

    public static void main(String[] args) {
        JFrame log = new JFrame("Login");
        log.setSize(600, 500);
        log.setContentPane(new NewUser().newUserpanel);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        log.setVisible(true);
    }
}