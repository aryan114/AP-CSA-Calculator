package CalcView;

import java.util.Scanner;
import util.Math;

public class CalcTerminal extends Math {


    public static void main(String[] args) {
        while (true) {
            CalcModel model = new CalcModel();
            //calculator options to choose
            System.out.println("--------------------------------------------------------------");
            System.out.println("|                      CALCULATOR OPTIONS                     |");
            System.out.println("| 1. Addition                                                 |");
            System.out.println("| 2. Subtraction                                              |");
            System.out.println("| 3. Multiplication                                           |");
            System.out.println("| 4. Division                                                 |");
            System.out.println("| 5. Roots                                                    |");
            System.out.println("| 6. Powers                                                   |");
            System.out.println("| 7. Quit                                                     |");
            System.out.println("--------------------------------------------------------------");

            Scanner arguno = new Scanner(System.in); //gets scanner input
            double arg1 = arguno.nextDouble();
            Scanner operationscan = new Scanner(System.in);
            int operation = operationscan.nextInt();
            Scanner argdos = new Scanner(System.in);
            double arg2 = argdos.nextDouble();

            Math.OPERATOR op = null;
            switch (operation) {
                case 1:
                    op = Math.OPERATOR.PLUS;
                    break;
                case 2:
                    op = Math.OPERATOR.MINUS;
                    break;
                case 3:
                    op = Math.OPERATOR.MULTIPLY;
                    break;
                case 4:
                    op = Math.OPERATOR.DIVIDE;
                    break;
                case 5:
                    op = Math.OPERATOR.ROOTS;
                    break;
                case 6:
                    op = OPERATOR.POWER;
                    break;
                default:
                    op = OPERATOR.PLUS;
            }


            //model.thingstocalculate();
            System.out.println(Math.calculateIt(arg1, op, arg2));


        }
    }
}