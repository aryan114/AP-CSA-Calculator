package CalcView;
import util.Math;

public class CalcModel {

    private double result;
    private Math.OPERATOR mathop;
    private double fnum;  //first number of calculation
    private double snum;  //second number of calculation

    public CalcModel() {
        this.mathop = Math.OPERATOR.NOOP;
        this.fnum = 0.0;
        this.snum = 0.0;
        this.result = 0.0;
    }

    public void setmathop (Math.OPERATOR value){
        this.mathop = value;
    }

    public void setfnum (double value){
        this.fnum = value;
    }

    public void setsnum (double value){
        this.snum = value;
    }

    public double thingstocalculate(){
        return Math.calculateIt(fnum, mathop,snum);
    }

}
