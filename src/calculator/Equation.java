/* Equation.java */

/*
 * Adam Reid
 * February 15, 2016
 */

package calculator;

public class Equation 
{
	private double num1;
	private double num2;
	private char function;
	private double result;
	
	public Equation()
	{
		num1 = 0;
		num2 = 0;
		function = '+';
		result = 0;
	}
	
	public Equation(long num1, char function, long num2)
	{
		this.num1 = num1;
		this.num2 = num2;
		if(function != '+' && function != '-' && function != '*' && function != '/' && function != '%' && function != 'm')
		{
		    this.function = '+';
		}
		else
		{
		    this.function = function;
		}
		this.evaluate();
	}
	
	public double getNum1()
	{
		return(num1);
	}
	
	public double getNum2()
	{
		return(num2);
	}
	
	public char getFunc()
	{
		return(function);
	}
	
	public double getResult()
	{
		return(result);
	}
	
	public void setNum1(double newNum)
	{
		this.num1 = newNum;
	}
	
	public void setNum2(double newNum)
	{
		this.num2 = newNum;
	}
	
	public void setFunc(char newFunc)
	{
		this.function = newFunc;
	}
	
	public void evaluate()
	{
		if(function == '+')
		{
			this.result = num1 + num2;
		}
		if(function == '-')
		{
			this.result = num1 - num2;
		}
		if(function == '*')
		{
			this.result = num1 * num2;
		}
		if(function == '/')
		{
			this.result = num1 / num2;
		}
		if(function == '%')
		{
			this.result = num1 / 100;
		}
		if(function == 'm')
		{
			this.result = num1 % num2;
		}
	}
}
