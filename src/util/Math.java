package util;

public class Math {
	
	public static enum OPERATOR { NOOP, PLUS, MINUS, DIVIDE, MULTIPLY, SQUARE, POWER, SIN, COSINE, TAN, SINVERSE, CINVERSE, TINVERSE, ROOTS, LN, PI, EULER};
	public static double calculateIt(double arg1, OPERATOR mathOp, double arg2) {
		
		double calcAnswer =0;
		switch(mathOp)
	    {
	        case PLUS:
	            calcAnswer = arg1 + arg2;
	            break;
	        case MINUS:
	            calcAnswer = arg1 - arg2;
	            break;
	        case DIVIDE:
	            calcAnswer = arg1 / arg2;
	            break;
	        case MULTIPLY:
	            calcAnswer = arg1 * arg2;
	            break;
			case SQUARE:
				calcAnswer = arg1 * arg1;
				break;
			case POWER:
				calcAnswer = java.lang.Math.pow(arg1, arg2);
				break;
			case SIN:
				calcAnswer = java.lang.Math.sin(arg1);
				break;
			case COSINE:
				calcAnswer = java.lang.Math.cos(arg1);
				break;
			case TAN:
				calcAnswer = java.lang.Math.tan(arg1);
				break;
			case SINVERSE:
				calcAnswer = java.lang.Math.asin(arg1);
				break;
			case CINVERSE:
				calcAnswer = java.lang.Math.acos(arg1);
				break;
			case TINVERSE:
				calcAnswer = java.lang.Math.atan(arg1);
				break;
			case ROOTS:
				calcAnswer = java.lang.Math.pow(arg1, 1/arg2);
				break;
			case LN:
				calcAnswer = java.lang.Math.log(arg1);
				break;
			case PI:
				arg1 = 3.14159265;
				break;
			case EULER:
				arg1 = 2.718;
				break;
	        case NOOP:
	        default:	
	            calcAnswer = arg1;
	    }
		return calcAnswer;
	}
	

}
