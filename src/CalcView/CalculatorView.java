package CalcView;

import LoginToProject.Login;
import util.Math;
import view_control.CalculatorUI;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import util.Math.OPERATOR;

public class CalculatorView extends JFrame {
    private String calcDisplaydefault = "0.0";
    private boolean CalcInputState;

    private JButton number1;
    private JButton number7;
    private JButton number2;
    private JButton number8;
    private JButton number0;
    private JButton number3;
    private JButton number4;
    private JButton number5;
    private JButton number6;
    private JButton number9;
    private JButton oadd;
    private JButton osubtract;
    private JButton oequal;
    private JButton ACButton;
    private JButton odivide;
    private JButton opower;
    private JButton omultiply;
    private JButton osquare;
    private JButton osin;
    private JButton ocos;
    private JButton otan;
    private JButton oln;
    private JButton osininverse;
    private JButton ocosinverse;
    private JButton otaninverse;
    private JButton oroots;
    private JLabel CalcDisplay;
    private JPanel CalcPanel;
    // package view_control;

    public static void main(String[] args) {
        JFrame Calc = new JFrame();
        //Calc.setContentPane(new CalculatorView().CalcPanel); //What should I pass in as a parameter?
        Calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Calc.setBounds(150, 150, 700, 375);
        Calc.setVisible(true);
    }

    public void initializeCalcDisplay(){
        this.initializeInputState();
        CalcDisplay.setText(calcDisplaydefault);
    }

    public void initializeInputState(){
        CalcInputState = true; //gets the calculator ready for user to enter numbers
    }

    public void setCalcDisplay(String number){
        this.initializeInputState();
        CalcDisplay.setText(number);
    }

    private void LongNumbers (String number){
        if(CalcInputState){
            CalcDisplay.setText(number);
            CalcInputState = false;
        } else { //only happens when second number is about to be entered
            CalcDisplay.setText(CalcDisplay.getText() + number);
        }
    }

    public CalculatorView(CalcControl CalcControl) {
/*
        getContentPane().add(CalcDisplay);
        getContentPane().add(number0);
        getContentPane().add(number1);
        getContentPane().add(number2);
        getContentPane().add(number3);
        getContentPane().add(number4);
        getContentPane().add(number5);
        getContentPane().add(number6);
        getContentPane().add(number7);
        getContentPane().add(number8);
        getContentPane().add(number9);
        getContentPane().add(oadd);
        getContentPane().add(osubtract);
        getContentPane().add(ACButton);
        getContentPane().add(oequal);

 */

        CalcDisplay.setBounds(18, 6, 650, 67);
        number1.addActionListener(e -> LongNumbers(number1.getText()));
        number2.addActionListener(e -> LongNumbers(number2.getText()));
        number3.addActionListener(e -> LongNumbers(number3.getText()));
        number4.addActionListener(e -> LongNumbers(number4.getText()));
        number5.addActionListener(e -> LongNumbers(number5.getText()));
        number6.addActionListener(e -> LongNumbers(number6.getText()));
        number7.addActionListener(e -> LongNumbers(number7.getText()));
        number8.addActionListener(e -> LongNumbers(number8.getText()));
        number9.addActionListener(e -> LongNumbers(number9.getText()));
        number0.addActionListener(e -> LongNumbers(number0.getText()));

        oadd.addActionListener(e->{
            CalcControl.savefnum(Double.parseDouble(CalcDisplay.getText()));
            CalcControl.savemathop(OPERATOR.PLUS);
        });

        osubtract.addActionListener(e->{
            CalcControl.savefnum(Double.parseDouble(CalcDisplay.getText()));
            CalcControl.savemathop(OPERATOR.MINUS);
        });

        oequal.addActionListener(e->{
            CalcControl.savesnum(Double.parseDouble(CalcDisplay.getText()));
            CalcControl.calculateResult();
        });

        ACButton.addActionListener(e->{
            CalcControl.clearCalculator();
        });


    }

}
