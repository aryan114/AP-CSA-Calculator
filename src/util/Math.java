package util;

public class Math {
	
	public static enum OPERATOR { NOOP, PLUS, MINUS, DIVIDE, MULTIPLY, SQUARE, POWER, SIN, COSINE, TAN };
	public static double calculateIt(double arg1, OPERATOR mathOp, double arg2) {
		
		double calcAnswer;		
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
	        case NOOP:
	        default:	
	            calcAnswer = arg1;
	    }
		return calcAnswer;
	}
	

}
