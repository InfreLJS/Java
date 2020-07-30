package threadsocketcalc;
import java.io.Serializable;

public class CalcSet implements Serializable {
	private static final long serialVersionUID = 1;
	int firstNum;
	int secondNum;
	char op;
	double result;
	boolean error;
}