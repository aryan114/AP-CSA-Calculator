package CalcView;

import util.Math;

public class CalcControl {

    private enum STATE {INITIAL, SAVE1, SAVE2, CALC}
    private STATE mathState;

    CalcModel model;
    CalculatorView view;

    public static void main(String[] args) {
        new CalcControl();
    }

    public CalcControl(){
        model = new CalcModel();
        this.view = new CalculatorView(this);
        view.setVisible(true);
    }

    public void clearCalculator(){
        mathState = STATE.INITIAL;
        model = new CalcModel();
        view.initializeCalcDisplay();
    }

    public void calculateResult(){
        double result = model.thingstocalculate();
        model.setfnum(result);
        mathState = STATE.CALC;
        view.setCalcDisplay(String.valueOf(result));
    }

    public void savefnum(Double number){
        model.setfnum(number);
        mathState = STATE.SAVE1;
        view.initializeInputState();
    }

    public void savesnum(Double number){
        if (mathState != STATE.CALC){
            model.setsnum(number);
            mathState = STATE.SAVE2;
        }
    }

    public void savemathop(Math.OPERATOR op){
        model.setmathop(op);
    }
}
