/* NumberPress.java */

/*
 * Adam Reid
 * February 15, 2016
 */

package calculator;

import java.awt.event.*;

public class NumberPress implements KeyListener
{
    public NumberPress() 
    {
        super();
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {
        e.consume();

        if(e.getKeyChar() == 'c')
        {
            CalculatorGUI.field.setText("0");
            Calculator.eq = new Equation();
        }
        else if(e.getKeyChar() == '0')
        {
            if(!CalculatorGUI.field.getText().equalsIgnoreCase("0"))
            {
                CalculatorGUI.field.setText(CalculatorGUI.field.getText() + "0");
            }
            if(CalculatorGUI.lastButton == 1)
            {
                CalculatorGUI.field.setText("0");
            }
            CalculatorGUI.lastButton = 0;
        }
        else if(e.getKeyChar() == '.')
        {
            if(!CalculatorGUI.field.getText().contains("."))
            {
                CalculatorGUI.field.setText(CalculatorGUI.field.getText() + ".");
            }
        }
        else if(e.getKeyChar() == '+')
        {
            if(Calculator.eq.getFunc() != '0' && CalculatorGUI.lastFunc != 1)
            {
                CalculatorGUI.performEquals();
            }
            else
            {
                Calculator.eq.setNum1(Double.parseDouble(CalculatorGUI.field.getText()));
            }
            Calculator.eq.setFunc('+');
            CalculatorGUI.lastButton = 1;
            CalculatorGUI.lastFunc = 0;
        }
        else if(e.getKeyChar() == '-')
        {
            if(Calculator.eq.getFunc() != '0' && CalculatorGUI.lastFunc != 1)
            {
                CalculatorGUI.performEquals();
            }
            else
            {
                Calculator.eq.setNum1(Double.parseDouble(CalculatorGUI.field.getText()));
            }
            Calculator.eq.setFunc('-');
            CalculatorGUI.lastButton = 1;
            CalculatorGUI.lastFunc = 0;
        }
        else if(e.getKeyChar() == '*')
        {
            if(Calculator.eq.getFunc() != '0' && CalculatorGUI.lastFunc != 1)
            {
                CalculatorGUI.performEquals();
            }
            else
            {
                Calculator.eq.setNum1(Double.parseDouble(CalculatorGUI.field.getText()));
            }
            Calculator.eq.setFunc('*');
            CalculatorGUI.lastButton = 1;
            CalculatorGUI.lastFunc = 0;
        }
        else if(e.getKeyChar() == '/')
        {
            if(Calculator.eq.getFunc() != '0' && CalculatorGUI.lastFunc != 1)
            {
                CalculatorGUI.performEquals();
            }
            else
            {
                Calculator.eq.setNum1(Double.parseDouble(CalculatorGUI.field.getText()));
            }
            Calculator.eq.setFunc('/');
            CalculatorGUI.lastButton = 1;
            CalculatorGUI.lastFunc = 0;
        }
        else if(e.getKeyChar() == '%')
        {
            if(Calculator.eq.getFunc() == '0')
            {
                Calculator.eq.setNum1(Double.parseDouble(CalculatorGUI.field.getText())/100);
                if(Calculator.eq.getNum1() % 1 != 0)
                {
                    CalculatorGUI.field.setText(Double.toString(Calculator.eq.getNum1()));
                }
                else
                {
                    CalculatorGUI.field.setText(Integer.toString((int)Calculator.eq.getNum1()));
                }
            }
            else
            {
                Calculator.eq.setNum2(Double.parseDouble(CalculatorGUI.field.getText())/100);
                if(Calculator.eq.getNum2() % 1 != 0)
                {
                    CalculatorGUI.field.setText(Double.toString(Calculator.eq.getNum2()));
                }
                else
                {
                    CalculatorGUI.field.setText(Integer.toString((int)Calculator.eq.getNum2()));
                }
            }
            CalculatorGUI.lastButton = 1;
        }
        else if(e.getKeyChar() == 'm')
        {
            if(Calculator.eq.getFunc() != '0' && CalculatorGUI.lastFunc != 1)
            {
                CalculatorGUI.performEquals();
            }
            else
            {
                Calculator.eq.setNum1(Double.parseDouble(CalculatorGUI.field.getText()));
            }
            Calculator.eq.setFunc('m');
            CalculatorGUI.lastButton = 1;
            CalculatorGUI.lastFunc = 0;
        }
        else if(e.getKeyChar() == '=' || e.getKeyChar() == '\n')
        {
            CalculatorGUI.performEquals();
        }
        else
        {
            if(Character.isDigit(e.getKeyChar()))
            {
                if(CalculatorGUI.field.getText().equalsIgnoreCase("0") || CalculatorGUI.lastButton == 1)
                {
                    CalculatorGUI.field.setText(String.valueOf(e.getKeyChar()));
                }
                else
                {
                    CalculatorGUI.field.setText(CalculatorGUI.field.getText() + String.valueOf(e.getKeyChar()));
                } 
                CalculatorGUI.lastButton = 0;
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

}
