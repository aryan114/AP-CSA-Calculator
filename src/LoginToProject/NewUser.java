package LoginToProject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class NewUser {
    private JTextField usernameentry;
    private JPasswordField passwordentry;
    private JButton createNewUserButton;
    private JLabel password;
    private JLabel username;
    private JLabel banner;
    private JPanel newUserpanel;


    //ArrayList<String> usernames = new ArrayList<>();
    //ArrayList<String> passwords = new ArrayList<>();
    HashMap<String, String> credentials = new HashMap<String, String>();


    public NewUser() {
        createNewUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usertemp = usernameentry.getText();
                String passtemp = passwordentry.getText();

               // usernames.add(usertemp);
                //passwords.add(passtemp);

                credentials.put(usertemp, passtemp);
                System.out.println(credentials);

                //From here, make the hashmap accessible to the code in Login.java. You can just then just write if statement in the Login.java where it checks the credentials.
                //You can save the key as the username var and then get the value. Then compare the value with the given password. If it's right, let em in. If not, call it incorrect.
                //First task is to figure out how to make the hashmap accessible to the other file.
                //Hashmap help: https://codehs.gitbooks.io/apjava/content/Data-Structures/hashmaps.html

            /*
                for(int i =0; i < usernames.size(); i++){
                    String grade = usernames.get(i);
                    System.out.println(grade);
                }

            */

            }
        });


    }

    public static void main(String[] args) {

        JFrame log = new JFrame("Login");
        log.setSize(500, 500);
        log.setContentPane(new NewUser().newUserpanel);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        log.setVisible(true);

    }
}
