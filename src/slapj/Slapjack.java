package slapj;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Slapjack {

    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;
    private Label cardLabel;

    private int cardNum;
    private int suitNum;

    public Slapjack(){
        prepareGUI();
    }

    public class MyFrameAdapter extends WindowAdapter {
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
        mainFrame = new Frame("My Example Frame");
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
                //changeCard("5 S");  // use random card instead
                nextCard();
            }
        });

        burnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Burn Button clicked.");
                //changeCard("10 H"); // use random card instead
                nextCard();
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
        delayer();
    }

    public void nextCardV1() {

    }

    public static String suitStr(int i) {
        switch(i) {
            case 0: return new String("D");
            case 1: return new String("H");
            case 2: return new String("C");
            case 3: return new String("S");
            default: return new String("");
        }
    }

    /**
     * @return true on success; false when you lose the game
     */
    public boolean gameStatusCheck(){
        if (cardNum  == 11) {
            statusLabel.setText("You Lose ...");
            controlPanel.setEnabled(false);
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Slapjack demo = new Slapjack();
        demo.showButtonDemo();
        while(true) {
            demo.nextCard();
            if (!demo.gameStatusCheck())
                break;
        }

    }

}
