package slapj;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Slapjack extends JFrame {

    enum GameStatus {
        WIN,
        LOSE,
        NONE
    }
    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;
    private Label cardLabel;

    private int cardNum;
    private int suitNum;
    private boolean slapped = false;

    public Slapjack(){
        prepareGUI();
    }

    public class MyFrameAdapter extends WindowAdapter { //Creates a class that is derived from a window adapter to use as a listener.
        public void windowClosing(WindowEvent windowEvent){
            System.out.println("Exiting ...");
            System.exit(0);
        }
    }
    /*public static void main(String[] args){
        MyButton  MyButton = new MyButton();
        MyButton.showButtonDemo();
    }*/

    private void prepareGUI(){
        mainFrame = new Frame("My Example Frame"); //created an object called Frame, and modifies the object in future parts of the code
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(4, 1));
        /*
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
         */
        mainFrame.addWindowListener(new MyFrameAdapter());
        headerLabel = new Label("Header");
        headerLabel.setAlignment(Label.CENTER);
        statusLabel = new Label("Status");
        statusLabel.setAlignment(Label.CENTER);
        //statusLabel.setSize(350,100);
        cardLabel = new Label();
        cardLabel.setAlignment(Label.CENTER);

        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());

        //now add the widgets in the required order
        mainFrame.add(headerLabel);
        mainFrame.add(cardLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    public void showButtonDemo(){
        headerLabel.setText("Control in action: Button");

        Button slapButton = new Button("Slap");
        Button burnButton = new Button("Burn");
        Button cancelButton = new Button("Cancel");

        slapButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Slap Button clicked.");
                slapped = true;
            }
        });

        burnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Burn Button clicked.");
                //changeCard("10 H"); // use random card instead
                //nextCard();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Cancel Button clicked.");
            }
        });

        controlPanel.add(slapButton);
        controlPanel.add(burnButton);
        controlPanel.add(cancelButton);
        mainFrame.setVisible(true);
    }

    public void changeCard(String cardText)
    {
        cardLabel.setText(cardText);
    }

    public static void delayer()
    {
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
        }
    }

    public void nextCard() {
        cardNum = (int) Math.round(Math.random()*11) + 1; // 1 to 12
        suitNum = (int) Math.round(Math.random()*3); // 0 to 3
        String cardStr = Long.toString(cardNum) + " " + suitStr(suitNum);
        changeCard(cardStr);
    }

    public void nextCardV1() {

    }

    /**
     * Convert Suite number to a string
     * @param i suite number
     * @return suite string
     */
    public static String suitStr(int i) {
        switch(i) {
            case 0: return new String("D");
            case 1: return new String("H");
            case 2: return new String("C");
            case 3: return new String("S");
            default: return new String("");
        }
    }

    public boolean checkForJack(){
        return (cardNum  == 11);
    }

    /**
     * Plays next card and returns status of the game
     * @return GameStatus (WIN/LOSE/NONE)
     */
    public GameStatus nextCardCheck() {
        slapped = false;  // clear slap status
        nextCard();
        delayer();
        if(slapped) {
            if (checkForJack()) {
                statusLabel.setText("You win!");
                controlPanel.setEnabled(false);
                return GameStatus.WIN;
            }
            else {
                statusLabel.setText("No Jack! You Lose!");
                controlPanel.setEnabled(false);
                return GameStatus.LOSE;
            }
        }
        else {
            if (checkForJack()) {
                statusLabel.setText("Jack not slapped! You Lose!");
                controlPanel.setEnabled(false);
                return GameStatus.LOSE;
            }
            return GameStatus.NONE;
        }
    }

    public static void main(String[] args) {

        Slapjack demo = new Slapjack();
        demo.showButtonDemo();

        while(true) {
            GameStatus status = demo.nextCardCheck();
            if (status != GameStatus.NONE)
                break;
        }
    }

}

