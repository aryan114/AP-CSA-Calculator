/*
package LoginToProject;

import view_control.MainMenu;

public class credcontrol {

    credstoremodel model = credstoremodel.getInstance();
    Login login;
    NewUser user;

    public credcontrol() {
        this.login = new Login();
        login.setVisible(true);
    }

    public void verifier(String username, String password){
        if (username.equals("coderwithswag") && password.equals("Legit")) {
            login.userin();
            MainMenu.main(null);
            //Part of the sequence to opening the panels correctly. More in other areas of the code.
        } else {
            login.userout();
        }

        if(model.getUserPassword(username).equals(password)){
            login.userin();
            MainMenu.main(null);
        } else if (username.equals("coderwithswag") && password.equals("Legit")){
            login.userin();
            MainMenu.main(null);
        } else {
            login.userout();
        }
    }

    public static void main(String[] args) {
        new credcontrol();
    }

}

 */
