/* Calculator.java */

/*
 * Adam Reid
 * February 15, 2016
 */

package calculator;

public class Calculator 
{
    public static Equation eq = new Equation();
	
    public static void main(String[] args) 
    {
    	CalculatorGUI gui = new CalculatorGUI();    	
    	gui.setVisible(true);	
    }
}
