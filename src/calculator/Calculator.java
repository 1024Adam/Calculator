/* Calculator.java */

/*
 * Adam Reid
 * February 15, 2016
 */

package calculator;

public class Calculator 
{
    public static void main(String[] args) 
    {
    	CalculatorGUI gui = new CalculatorGUI();
    	
    	System.out.println(Double.parseDouble("-1.2345"));
    	
    	gui.setVisible(true);	
    }
}
